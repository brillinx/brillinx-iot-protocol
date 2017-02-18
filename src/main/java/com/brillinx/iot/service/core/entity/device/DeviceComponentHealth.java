package com.brillinx.iot.service.core.entity.device;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 12/13/16.
 */
public class DeviceComponentHealth extends Entity{

    // the device which the deivce component belongs to
    private String deviceId;
    // the device model
    private String deviceModelId;
    private String deviceModelName;
    // the device component
    private String deviceComponentId;
    private String deviceComponentName;

    // the component health status: good or bad
    private String componentHealthStatus;
    private String componentHealthDescription;

    public DeviceComponentHealth(String id, String deviceId, String deviceModelId, String deviceModelName, String deviceComponentId, String deviceComponentName, String componentHealthStatus, String componentHealthDescription) {
        super(id);
        this.deviceId = deviceId;
        this.deviceModelId = deviceModelId;
        this.deviceModelName = deviceModelName;
        this.deviceComponentId = deviceComponentId;
        this.deviceComponentName = deviceComponentName;
        this.componentHealthStatus = componentHealthStatus;
        this.componentHealthDescription = componentHealthDescription;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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

    public String getDeviceComponentId() {
        return deviceComponentId;
    }

    public void setDeviceComponentId(String deviceComponentId) {
        this.deviceComponentId = deviceComponentId;
    }

    public String getDeviceComponentName() {
        return deviceComponentName;
    }

    public void setDeviceComponentName(String deviceComponentName) {
        this.deviceComponentName = deviceComponentName;
    }

    public String getComponentHealthStatus() {
        return componentHealthStatus;
    }

    public void setComponentHealthStatus(String componentHealthStatus) {
        this.componentHealthStatus = componentHealthStatus;
    }

    public String getComponentHealthDescription() {
        return componentHealthDescription;
    }

    public void setComponentHealthDescription(String componentHealthDescription) {
        this.componentHealthDescription = componentHealthDescription;
    }
}
