package com.wisdomtree.wisdomtree;


import org.apache.commons.lang3.StringUtils;
import sun.swing.StringUIClientPropertyKey;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/7/14 9:34
 */
public enum Enum {

    TRADE_SUCCESS("0000", "处理成功"),
    UNSUPPORT_CALLER("PLCO0001", "数据异常");

    private String code;
    private String msg;

    public static Enum getEnum(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }

        Enum[] var = values();

        int var2 = var.length;
        for (int var3 = 0; var3 < var2; ++var3) {
            Enum e = var[var3];
            if (e.code.equals(code)) {
                return e;
            }
        }

        return null;
    }

    Enum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
