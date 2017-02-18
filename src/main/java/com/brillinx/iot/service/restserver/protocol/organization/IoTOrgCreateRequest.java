package com.brillinx.iot.service.restserver.protocol.organization;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTOrgCreateRequest extends IoTRequest{

    private String clientId;

    private String name;

    private String comments;

    private Integer create_time;

    public IoTOrgCreateRequest() {
        super(IoTRequestId.OrgCreateReq_Id);
    }

    public IoTOrgCreateRequest(String clientId, String name, String comments, Integer create_time) {
        super(IoTRequestId.OrgCreateReq_Id);
        this.clientId = clientId;
        this.name = name;
        this.comments = comments;
        this.create_time = create_time;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public Integer getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }
}
