package com.oracle.shopping.user.service.impl;

import com.oracle.shopping.user.mapper.SysUserMapper;
import com.oracle.shopping.user.service.SysUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.oracle.shopping.user.po.SysUser;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUser record) {
        return sysUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public SysUser selectByPrimaryKey(String id) {
        System.out.println(11111);
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

}
