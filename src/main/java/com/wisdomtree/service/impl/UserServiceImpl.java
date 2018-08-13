package com.wisdomtree.service.impl;

import com.wisdomtree.dao.UserDao;
import com.wisdomtree.dto.SysUser;
import com.wisdomtree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/7/6 16:43
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser findByUserName(String userName) {
        return this.userDao.selectByUserName(userName);
    }
}
