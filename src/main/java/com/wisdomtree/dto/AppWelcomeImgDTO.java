package com.wisdomtree.dto;

import java.util.Date;

/**
 * 欢迎页面
 *
 * @author jiwenquan
 * @create 2018/8/16 11:12
 */
public class AppWelcomeImgDTO {

    private String id;
    /**
     * 简介
     */
    private String summary;
    /**
     * 图片路径
     */
    private String imgPath;
    //删除标志 0: 有效，1： 无效
    private String delFlag;
    private Date created;
    private Date updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
