package com.wisdomtree.dao;

import com.wisdomtree.dto.UserInfo;
import org.springframework.stereotype.Repository;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/7/6 16:35
 */
@Repository
public interface UserDao {

    UserInfo selectByUserName(String userName);
}
