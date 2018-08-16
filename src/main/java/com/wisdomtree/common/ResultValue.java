package com.wisdomtree.common;

import java.io.Serializable;

/**
 * 通用返回值
 *
 * @author jiwenquan
 * @create 2018/8/15 10:36
 */
public class ResultValue implements Serializable {

    private boolean success;
    private Object content;

    public ResultValue() {

    }

    public ResultValue(boolean success, Object content) {
        this.success = success;
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
