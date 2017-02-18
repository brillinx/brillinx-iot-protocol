package com.brillinx.iot.service.core.entity.dataconnection.realtime;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 10/12/16.
 */
public class RealtimeRestApiEntry extends Entity{

    public static String Operation_Post = "POST";
    public static String Operation_Get = "GET";

    private String entryComment;
    private String operation;
    private String restApiUrl;


    private String deviceModelId;
    private String deviceModelName;
    private String realtimeDataConnectionId;
    private String realtimeDataConnectionName;


    public RealtimeRestApiEntry(String id, String entryComment, String operation, String restApiUrl, String deviceModelId, String deviceModelName, String realtimeDataConnectionId, String realtimeDataConnectionName) {
        super(id);
        this.entryComment = entryComment;
        this.operation = operation;
        this.restApiUrl = restApiUrl;
        this.deviceModelId = deviceModelId;
        this.deviceModelName = deviceModelName;
        this.realtimeDataConnectionId = realtimeDataConnectionId;
        this.realtimeDataConnectionName = realtimeDataConnectionName;
    }

    public String getEntryComment() {
        return entryComment;
    }

    public void setEntryComment(String entryComment) {
        this.entryComment = entryComment;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getRestApiUrl() {
        return restApiUrl;
    }

    public void setRestApiUrl(String restApiUrl) {
        this.restApiUrl = restApiUrl;
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public String getRealtimeDataConnectionId() {
        return realtimeDataConnectionId;
    }

    public void setRealtimeDataConnectionId(String realtimeDataConnectionId) {
        this.realtimeDataConnectionId = realtimeDataConnectionId;
    }

    public String getRealtimeDataConnectionName() {
        return realtimeDataConnectionName;
    }

    public void setRealtimeDataConnectionName(String realtimeDataConnectionName) {
        this.realtimeDataConnectionName = realtimeDataConnectionName;
    }
}
