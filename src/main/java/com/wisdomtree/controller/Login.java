package com.wisdomtree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
