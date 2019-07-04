package com.sxt.sys.service.impl;

import com.sxt.commons.utils.Constant;
import com.sxt.sys.mapper.BasicMapper;
import com.sxt.sys.pojo.Basic;
import com.sxt.sys.pojo.BasicExample;
import com.sxt.sys.service.IBasicService;
import com.sxt.sys.vo.NodeVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: srm
 * @description: 基础数据的业务层实现类
 * @author: 波波烤鸭
 * @create: 2019-05-05 22:40
 */
@Service
public class BasicServiceImpl implements IBasicService {

    @Resource
    BasicMapper basicMapper;

    @Override
    public List<NodeVo> queryBasicNode(Integer id) {
        Basic basic = new Basic();
        if(id != null){
            basic.setParentId(id);
        }else{
            basic.setParentId(0);
        }
        List<Basic> list = this.query(basic);
        // 将数据转换为tree支持的类型
        List<NodeVo> nodes = new ArrayList<>();
        for (Basic b: list) {
            NodeVo n = new NodeVo();
            n.setId(b.getBasicId());
            n.setText(b.getBasicName());
            n.setDescription(b.getBasicDesc());
            n.setCreateTime(b.getCreateTime());
            n.setParentId(b.getParentId());
            if(b.getParentId() == 0){
                n.setState(Constant.NODE_STATE_CLOSE);
            }else{
                n.setState(Constant.NODE_STATE_OPEN);
            }
            nodes.add(n);
        }
        return nodes;
    }

    @Override
    public List<Basic> query(Basic basic) {

        BasicExample example = new BasicExample();
        BasicExample.Criteria criteria = example.createCriteria();
        if(basic != null){
            if(basic.getParentId() != null ){
                criteria.andParentIdEqualTo(basic.getParentId());
            }
        }
        return basicMapper.selectByExample(example);
    }
}
