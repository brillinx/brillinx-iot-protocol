package com.brillinx.iot.service.restserver.protocol.space;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTSpaceCreateRequest extends IoTRequest{


    String organization_id;
    String name;
    String comments;
    Integer createTime;

    public IoTSpaceCreateRequest() {
        super(IoTRequestId.SpaceCreateReq_Id);
    }


    public IoTSpaceCreateRequest(String organization_id, String name, String comments, Integer createTime) {
        super(IoTRequestId.SpaceCreateReq_Id);
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
