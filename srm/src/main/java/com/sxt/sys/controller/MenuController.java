package com.sxt.sys.controller;

import com.sxt.commons.controller.BaseController;
import com.sxt.sys.pojo.Menu;
import com.sxt.sys.service.IMenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: srm
 * @description: 菜单控制器
 * @author: 波波烤鸭
 * @create: 2019-05-03 23:32
 */
@Controller()
@RequestMapping("/sys/menu")
public class MenuController extends BaseController {

    @Resource
    private IMenuService menuService;

    /**
     *  异步查询菜单【node】信息
     * @param  id
     * @return
     */
    @RequestMapping("/getNode")
    @ResponseBody
    public List<Menu> getNode(Integer id){
        Menu menu = new Menu();
        if(id !=null && id > 0){
            menu.setParentId(id);
        }else{
            menu.setParentId(0);
        }
        return menuService.query(menu);
    }

}
