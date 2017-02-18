package com.brillinx.iot.service.core.entity.dataconnection.realtime;

import com.brillinx.iot.service.core.entity.Entity;

import java.util.Vector;

/**
 * Created by Kai on 2016/7/9.
 */
public class RealtimeDataConnectionInfo extends Entity{

    private String deviceModelId;
    private String deviceModelName;
    private String realtimeDataConnectionId;
    private String realtimeDataConnectionName;

    private Vector<RealtimeRestApiEntry> realtimeRestApiEntries;

    public RealtimeDataConnectionInfo(String id, String deviceModelId, String deviceModelName, String realtimeDataConnectionId, String realtimeDataConnectionName, Vector<RealtimeRestApiEntry> realtimeRestApiEntries) {
        super(id);
        this.deviceModelId = deviceModelId;
        this.deviceModelName = deviceModelName;
        this.realtimeDataConnectionId = realtimeDataConnectionId;
        this.realtimeDataConnectionName = realtimeDataConnectionName;
        this.realtimeRestApiEntries = realtimeRestApiEntries;
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public String getRealtimeDataConnectionId() {
        return realtimeDataConnectionId;
    }

    public void setRealtimeDataConnectionId(String realtimeDataConnectionId) {
        this.realtimeDataConnectionId = realtimeDataConnectionId;
    }

    public Vector<RealtimeRestApiEntry> getRealtimeRestApiEntries() {
        return realtimeRestApiEntries;
    }

    public void setRealtimeRestApiEntries(Vector<RealtimeRestApiEntry> realtimeRestApiEntries) {
        this.realtimeRestApiEntries = realtimeRestApiEntries;
    }

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public String getRealtimeDataConnectionName() {
        return realtimeDataConnectionName;
    }

    public void setRealtimeDataConnectionName(String realtimeDataConnectionName) {
        this.realtimeDataConnectionName = realtimeDataConnectionName;
    }
}
