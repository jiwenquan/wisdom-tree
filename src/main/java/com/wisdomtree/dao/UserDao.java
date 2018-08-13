package com.wisdomtree.dao;

import com.wisdomtree.dto.SysUser;
import org.springframework.stereotype.Repository;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/7/6 16:35
 */
@Repository
public interface UserDao {

    SysUser selectByUserName(String userName);
}
