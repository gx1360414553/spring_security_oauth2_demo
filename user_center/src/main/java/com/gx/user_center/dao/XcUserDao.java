package com.gx.user_center.dao;

import com.gx.entity.XcUser;

/**
 * Created by Administrator.
 */
public interface XcUserDao {
    //根据账号查询用户信息
    XcUser findByUsername(String username);
}
