package com.brillinx.iot.service.core.entity.dataconnection.realtime;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by Kai on 2016/7/9.
 */
public class RealtimeDataConnection extends Entity{

    public static String DataConnectRunningStatus = "running";
    public static String DataConnectionErrorStatus = "error";
    public static String DataConnectionStoppedStatus = "stopped";
    public static String DataConnectionSuccessStatus = "success";


    private String realtimeDataConnectionName;
    private String deviceModelId;
    private String deviceModelName;
    private String realtimeDataConnectionComments;
    private String status;

    public RealtimeDataConnection(String id, String realtimeDataConnectionName, String deviceModelId,String deviceModelName, String realtimeDataConnectionComments, String status) {
        super(id);
        this.realtimeDataConnectionName = realtimeDataConnectionName;
        this.deviceModelId = deviceModelId;
        this.deviceModelName = deviceModelName;
        this.realtimeDataConnectionComments = realtimeDataConnectionComments;
        this.status = status;
    }

    public String getRealtimeDataConnectionName() {
        return realtimeDataConnectionName;
    }

    public void setRealtimeDataConnectionName(String realtimeDataConnectionName) {
        this.realtimeDataConnectionName = realtimeDataConnectionName;
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

    public String getRealtimeDataConnectionComments() {
        return realtimeDataConnectionComments;
    }

    public void setRealtimeDataConnectionComments(String realtimeDataConnectionComments) {
        this.realtimeDataConnectionComments = realtimeDataConnectionComments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
