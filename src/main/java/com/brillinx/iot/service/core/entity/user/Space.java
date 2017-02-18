package com.brillinx.iot.service.core.entity.user;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by Kai on 2016/7/14.
 */
public class Space extends Entity {

    private String organization_id;
    private String name;
    private String comments;
    private Integer createTime;

    public Space(String id, String organization_id, String name, String comments, Integer createTime) {
        super(id);
        this.organization_id = organization_id;
        this.name = name;
        this.comments = comments;
        this.createTime = createTime;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(String organization_id) {
        this.organization_id = organization_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
