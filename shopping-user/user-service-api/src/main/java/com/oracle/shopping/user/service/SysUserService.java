package com.oracle.shopping.user.service;

import com.oracle.shopping.user.po.SysUser;
public interface SysUserService{


    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

}
