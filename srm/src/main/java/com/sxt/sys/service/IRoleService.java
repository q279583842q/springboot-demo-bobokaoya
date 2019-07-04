package com.sxt.sys.service;

import com.github.pagehelper.PageInfo;
import com.sxt.sys.pojo.Role;
import com.sxt.sys.vo.RoleVo;

public interface IRoleService {

    /**
     * 查询角色的分页信息
     * @param roleVo
     * @return
     */
    PageInfo<Role> query(RoleVo roleVo);

}
