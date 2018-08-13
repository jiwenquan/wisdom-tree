package com.wisdomtree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 登陆
 *
 * @author jiwenquan
 * @create 2018/7/6 14:36
 */
@Controller
public class Login {

    @RequestMapping("/login")
    public String login() {
        return "/login";
    }

    @RequestMapping("/toLogin")
    public String toLogin(String userName, String password, String checkCode) {
        System.out.println("userName: " + userName + ", password: " + password + ", checkCode: " + checkCode);
        return "index";
    }
}
