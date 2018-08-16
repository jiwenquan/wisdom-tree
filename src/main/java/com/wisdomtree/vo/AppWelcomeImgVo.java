package com.wisdomtree.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author jiwenquan
 * @create 2018/8/16 14:05
 */
public class AppWelcomeImgVo implements Serializable {

    private String summary;
    private String imgPath;
    private String delFlag;
    private String delFlagText;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date created;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updated;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getDelFlagText() {
        String delFlagText = "";
        switch (this.delFlag) {
            case "0":
                delFlagText = "有效";
                break;
            case "1":
                delFlagText = "无效";
                break;
            default:
                delFlagText = "未知状态";
        }
        return delFlagText;
    }

    public void setDelFlagText(String delFlagText) {
        this.delFlagText = delFlagText;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
