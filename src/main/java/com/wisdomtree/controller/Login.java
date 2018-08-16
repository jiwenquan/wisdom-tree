package com.wisdomtree.controller;

import com.wisdomtree.common.Constants;
import com.wisdomtree.common.ResultValue;
import com.wisdomtree.dto.SysUser;
import com.wisdomtree.service.UserService;
import com.wisdomtree.vo.UserVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 登陆
 *
 * @author jiwenquan
 * @create 2018/7/6 14:36
 */
@RestController
@RequestMapping("/login")
public class Login {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public ResultValue toLogin(@RequestBody UserVo userVo, HttpServletRequest request) {
//        System.out.println("userName: " + userName + ", password: " + password + ", checkCode: " + checkCode);
        HttpSession session = request.getSession();
        String num = (String)session.getAttribute("checkCode");
        if (StringUtils.isBlank(userVo.getUsername())) {
            return new ResultValue(false, Constants.USERNAME_NOT_EMPTY);
        }

        if (StringUtils.isBlank(userVo.getPassword())) {
            return new ResultValue(false, Constants.PASSWORD_NOT_EMPTY);
        }

        if (!StringUtils.equalsIgnoreCase(num, userVo.getCheckCode())) {
            return new ResultValue(false, Constants.CHECK_CODE_ERROR);
        } else {
            SysUser user = this.userService.findByUserName(userVo.getUsername());
            if (null == user) {
                return new ResultValue(false, Constants.USER_NOT_EXISTENCE);
            }
            if (!StringUtils.equals(userVo.getPassword(), user.getPassword())) {
                return new ResultValue(false, Constants.PASSWORD_ERROR);
            }
            return new ResultValue(true, Constants.LOGIN_SUCCESS);
        }
    }

    @RequestMapping("/getVerificationCode")
    //输出验证码图片
    public void checkcode(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {
        System.out.println("checkcode...");
        /*
         * step1 生成image
         */
        //创建一个画布
        BufferedImage image =
                new BufferedImage(80,35,BufferedImage.TYPE_INT_BGR);
        //获得画笔
        Graphics g =
                image.getGraphics();
        //给笔设置颜色
        g.setColor(new Color(0,200,200));
        //设置画布颜色
        g.fillRect(0, 0, 80, 35);

        //给笔设置颜色
        Random ran = new Random();
        g.setColor(
                new Color(ran.nextInt(255),
                        ran.nextInt(255),ran.nextInt(255)));
        //设置字体
        g.setFont(new Font(null,Font.BOLD,24));
        //生成一个随机数
        String code = getNumber(4);
        //将验证码绑定到session对象上
        HttpSession session =
                request.getSession();
        session.setAttribute("checkCode", code);
        System.out.println(code);
        //在画布上绘制随机数

        g.drawString(code, 9, 25);
        for(int i=0;i<8;i++){
            g.setColor(new Color(ran.nextInt(255),
                    ran.nextInt(255),ran.nextInt(255)));
            g.drawLine(ran.nextInt(80), ran.nextInt(30),ran.nextInt(80), ran.nextInt(30));
        }
        /*
         * step2 压缩image并输出
         */
        //告诉浏览器返回的是一张图片
        response.setContentType("image/jpeg");
        //获得字节输出流
        OutputStream output =
                response.getOutputStream();
        //将原始图片按照指定格式进行压缩 输出
        javax.imageio.ImageIO.write(image, "jpeg", output);
        output.close();
    }

    private String getNumber(int size){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "";
        Random ran = new Random();
        for(int i=0;i<size;i++){
            number += chars.charAt(ran.nextInt(chars.length()));
        }
        return number;
    }
}
