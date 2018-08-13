package com.wisdomtree.wisdomtree;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/7/14 9:33
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Enum.getEnum("0000"));
        System.out.println(Enum.TRADE_SUCCESS.getMsg() + "---------------" + Enum.TRADE_SUCCESS.getCode());
    }
}
