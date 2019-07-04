package com.sxt.sys.realm;

import java.util.List;

import javax.annotation.Resource;

import com.sxt.sys.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.sxt.sys.pojo.Role;
import com.sxt.sys.pojo.User;
import org.apache.shiro.util.SimpleByteSource;


/**
 * 认证和授权的自定义Realm
 *
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public class SecurityRealm extends AuthorizingRealm {

	@Resource
	private IUserService userService;


	/**
	 * 认证的方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 获取提交的账号
		UsernamePasswordToken t = (UsernamePasswordToken) token;
		String userName = t.getUsername();
		List<User> list = userService.login(userName);
		if(list==null || list.size() != 1){
			// 认证失败，账号不存在或者同名账号过多
			return null;
		}
		// 获取数据库中的账号信息
		User user = list.get(0);
		// 账号存在，返回AuthenticationInfo对象封装对应的信息
		return new SimpleAuthenticationInfo(user,user.getPassword(),new SimpleByteSource(user.getSalt()),"loginRealm");
	}

	/**
	 * 授权的方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		return null;
	}

}
