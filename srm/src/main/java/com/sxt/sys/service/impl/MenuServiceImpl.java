package com.sxt.sys.service.impl;

import com.sxt.sys.mapper.MenuMapper;
import com.sxt.sys.pojo.Menu;
import com.sxt.sys.pojo.MenuExample;
import com.sxt.sys.service.IMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: srm
 * @description: 菜单Service层的实现类
 * @author: 波波烤鸭
 * @create: 2019-05-03 23:35
 */
@Service
public class MenuServiceImpl implements IMenuService {

    @Resource
    MenuMapper menuMapper;

    public List<Menu> query(Menu menu) {
        MenuExample example = new MenuExample();
        MenuExample.Criteria criteria = example.createCriteria();
        if(menu!=null){
            if(menu.getParentId()!=null ){
                // 根据父菜单编号查询
                criteria.andParentIdEqualTo(menu.getParentId());
            }else{
                criteria.andParentIdEqualTo(0);
            }
        }
        return menuMapper.selectByExample(example);
    }




}
