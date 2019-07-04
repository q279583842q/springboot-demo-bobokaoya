package com.sxt.sys.controller;

import com.sxt.sys.service.IBasicService;
import com.sxt.sys.vo.NodeVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: srm
 * @description: 基础数据的控制器
 * @author: 波波烤鸭
 * @create: 2019-05-05 22:48
 */
@Controller
@RequestMapping("/sys/basic")
public class BasicController {

    @Resource
    private IBasicService basicService;

    @RequestMapping("/queryNode")
    @ResponseBody
    public List<NodeVo> queryNode(Integer id){
        return basicService.queryBasicNode(id);
    }
}
