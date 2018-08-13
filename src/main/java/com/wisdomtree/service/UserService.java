package com.wisdomtree.service;

import com.wisdomtree.dto.SysUser;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/7/6 16:41
 */
public interface UserService {

    public SysUser findByUserName(String userName);
}
