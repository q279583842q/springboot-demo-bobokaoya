package com.sxt.sys.controller;

import com.github.pagehelper.PageInfo;
import com.sxt.commons.controller.BaseController;
import com.sxt.commons.utils.Resp;
import com.sxt.sys.pojo.User;
import com.sxt.sys.service.IUserService;
import com.sxt.sys.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.java2d.pipe.RegionSpanIterator;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: srm
 * @description: 账号控制器
 * @author: 波波烤鸭
 * @create: 2019-05-04 09:11
 */
@Controller
@RequestMapping("/sys/user")
public class UserController extends BaseController {


    @Resource
    private IUserService userService;

    /**
     * 分页查询账号信息
     * @param userVo
     * @return
     */
    @RequestMapping("/query")
    @ResponseBody
    public Map<String,Object> query(UserVo userVo){
        PageInfo<User> info = userService.query(userVo);
        Map<String,Object> map = new HashMap<>();
        map.put("total",info.getTotal());
        map.put("rows",info.getList());
        return map;
    }

    @RequestMapping("/validateUserName")
    @ResponseBody
    public boolean validateUserName(String username){
        List<User> list = userService.login(username);
        if(list == null || list.size() == 0){
            // 账号不存在 可以使用
            return true;
        }else{
            return false;
        }
    }

    @RequestMapping("/save")
    @ResponseBody
    public Resp  save(User user){
        userService.save(user);
        return Resp.success();
    }


}
