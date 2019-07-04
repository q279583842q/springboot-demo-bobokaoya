package com.sxt.sys.service;

import com.sxt.sys.pojo.Basic;
import com.sxt.sys.vo.NodeVo;

import java.util.List;

/**
 * 基础数据 业务层的接口
 */
public interface IBasicService {

    /**
     * 根据菜单编号查询对应的子节点数据
     * @param id
     * @return
     */
    public List<NodeVo> queryBasicNode(Integer id);

    /**
     * 根据条件查询所有的基础数据
     * @param basic
     * @return
     */
    public List<Basic> query(Basic basic);
}
