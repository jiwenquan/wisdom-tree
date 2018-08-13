package com.wisdomtree.wisdomtree;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 积分改变记录
 *
 * @author jiwenquan
 * @create 2018/7/9 19:36
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        String end = "2018-07-08 12:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date endTime = sdf.parse(end);
        Date push = new Date();
        System.out.println(endTime.getTime() - push.getTime());
        if (endTime.getTime() <= push.getTime()) {
            System.out.println("不合格NO");
        } else {
            System.out.println("合格OK");
        }

    }
}
