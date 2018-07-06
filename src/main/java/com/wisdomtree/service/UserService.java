package com.wisdomtree.service;

import com.wisdomtree.dto.UserInfo;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/7/6 16:41
 */
public interface UserService {

    public UserInfo findByUserName(String userName);
}
