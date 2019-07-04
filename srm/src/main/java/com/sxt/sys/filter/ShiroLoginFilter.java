package com.sxt.sys.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxt.sys.pojo.User;
import com.sxt.sys.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.sxt.commons.utils.ErrorCode;
import com.sxt.commons.utils.Resp;

/**
 * @program: srm
 * @description: 登录验证后的拦截器
 * @author: 波波烤鸭
 * @create: 2019-05-03 19:56
 */
public class ShiroLoginFilter extends FormAuthenticationFilter {

    private static final Logger log = LoggerFactory.getLogger(FormAuthenticationFilter.class);

    @Resource
    private IUserService userService;

    /**
     * 表示当访问拒绝时
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

        if(this.isLoginRequest(request, response)) {
            if(this.isLoginSubmission(request, response)) {
                if(log.isTraceEnabled()) {
                    log.trace("Login submission detected.  Attempting to execute login.");
                }

                return this.executeLogin(request, response);
            } else {
                if(log.isTraceEnabled()) {
                    log.trace("Login page view.");
                }

                return true;
            }
        } else {
            if(log.isTraceEnabled()) {
                log.trace("Attempting to access a path which requires authentication.  Forwarding to the Authentication url [" + this.getLoginUrl() + "]");
            }

            this.saveRequestAndRedirectToLogin(request, response);
            return false;
        }
    }

    /**
     *
     * 当认证成功后会执行的方法
     *      在本方方法中查询用户具有的权限信息
     *      根据用户的提交方式，做出不同的响应
     *
     * @param token
     * @param subject
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {

        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        String requestType = ((HttpServletRequest)request).getHeader("X-Requested-With");
        // 登录成功查询出当前账号对应的信息
        User loginUser = (User) subject.getPrincipal();
        // 登录成功更新登录的时间
        loginUser.setLastLoginTime(new Date());
        userService.updateByPrimaryKey(loginUser);
        // 查询账号对应的角色信息

        // 判断角色 学生or班主任

        if (requestType==null){ // 不是ajax请求
            issueSuccessRedirect(request, response);
        } else {
            httpServletResponse.setCharacterEncoding("UTF-8");
            PrintWriter out = httpServletResponse.getWriter();
            out.println(JSONObject.toJSON(Resp.success()));
            out.flush();
            out.close();
        }
        return false;
    }

    /**
     *
     * 当登录失败
     *
     * @param token
     * @param e
     * @param request
     * @param response
     * @return
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        String requestType = ((HttpServletRequest)request).getHeader("X-Requested-With");
        if (requestType==null) {// 不是ajax请求
            setFailureAttribute(request, e);
            return true;
        }
        try {
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            String message = e.getClass().getSimpleName();
            String info = null;
            if ("IncorrectCredentialsException".equals(message)) {
                info = "密码错误";
            } else if ("UnknownAccountException".equals(message)) {
                info = "账号不存在";
            } else if ("LockedAccountException".equals(message)) {
                info = "账号被锁定";
            } else {
                info = "未知错误";
            }
            out.println(JSONObject.toJSON(Resp.fail(ErrorCode.SYSTEM_ERROR, info)));
            out.flush();
            out.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return false;
    }
}
