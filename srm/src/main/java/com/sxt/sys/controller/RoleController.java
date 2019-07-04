package com.sxt.sys.controller;

import com.github.pagehelper.PageInfo;
import com.sxt.commons.controller.BaseController;
import com.sxt.sys.pojo.Role;
import com.sxt.sys.service.IRoleService;
import com.sxt.sys.vo.RoleVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: srm
 * @description: 角色的控制器
 * @author: 波波烤鸭
 * @create: 2019-05-04 22:58
 */
@Controller
@RequestMapping("/sys/role")
public class RoleController extends BaseController {

    @Resource
    IRoleService roleService;

    @RequestMapping("/query")
    @ResponseBody
    public Map<String,Object> query(RoleVo roleVo){
        PageInfo<Role> info = roleService.query(roleVo);
        Map<String,Object> map = new HashMap<>();
        map.put("total",info.getTotal());
        map.put("rows",info.getList());
        return map;
    }
}
