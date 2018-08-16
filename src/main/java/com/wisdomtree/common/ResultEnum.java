package com.wisdomtree.common;

/**
 * 返回枚举类
 *
 * @author jiwenquan
 * @create 2018/8/13 19:04
 */
public enum ResultEnum {
    VERIF_CODE_ERROR("1001", "验证码错误");

    private String code;
    private String text;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    ResultEnum(String code, String text) {
        this.code = code;
        this.text = text;
    }
}
