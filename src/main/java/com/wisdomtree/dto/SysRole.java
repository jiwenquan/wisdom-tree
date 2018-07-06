package com.wisdomtree.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色
 *
 * @author jiwenquan
 * @create 2018/7/6 16:27
 */
public class SysRole implements Serializable {

    private String id;
    private String role;
    private String description;
    //是否可用,如果不可用将不会添加给用户
    private Boolean available = Boolean.FALSE;
    private List<SysPermission> permissions;
    private List<UserInfo> userInfos;
    private Date created;
    private Date updated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
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
