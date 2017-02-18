package com.brillinx.iot.service.restserver.protocol.UserLogin;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/12.
 */
public class IoTUserLoginResponse extends IoTResponse {
    private String userId;
    private String token;
    private String organizationId;
    private String spaceId;

    public IoTUserLoginResponse() {
        super(IoTResponseId.UserLoginResp_Id);
    }

    public IoTUserLoginResponse(String userId, String token, String organizationId, String spaceId) {
        super(IoTResponseId.UserLoginResp_Id);
        this.userId = userId;
        this.token = token;
        this.organizationId = organizationId;
        this.spaceId = spaceId;
    }

    public IoTUserLoginResponse(Integer bSuccess, String errorMessage)
    {
        super(IoTResponseId.UserLoginResp_Id, bSuccess, errorMessage);
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
