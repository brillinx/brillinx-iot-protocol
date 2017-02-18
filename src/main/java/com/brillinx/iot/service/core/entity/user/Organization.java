package com.brillinx.iot.service.core.entity.user;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by Kai on 2016/7/14.
 */
public class Organization extends Entity{

    private String name;
    private String clientId;
    private String comments;
    private Integer createTime;

    public Organization(String id, String name, String clientId, String comments, Integer createTime) {
        super(id);
        this.name = name;
        this.clientId = clientId;
        this.comments = comments;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}
