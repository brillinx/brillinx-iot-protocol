package com.brillinx.iot.service.restserver.protocol;

/**
 * Created by Kai on 2016/7/12.
 */
public class IoTRequest {

    private Integer requestId;

    private String organizationId;
    private String spaceId;
    private String userId;
    private String token;

    public IoTRequest(Integer requestId) {
        this.requestId = requestId;
    }

    public IoTRequest(Integer requestId, String organizationId, String spaceId, String userId, String token) {
        this.requestId = requestId;
        this.organizationId = organizationId;
        this.spaceId = spaceId;
        this.userId = userId;
        this.token = token;
    }

    public IoTRequest(Integer requestId, String organizationId, String spaceId) {
        this.requestId = requestId;
        this.organizationId = organizationId;
        this.spaceId = spaceId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
