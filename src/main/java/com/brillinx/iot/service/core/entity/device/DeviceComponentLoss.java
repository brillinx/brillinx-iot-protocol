package com.brillinx.iot.service.core.entity.device;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 12/11/16.
 */
public class DeviceComponentLoss extends Entity {

    // the device which the deivce component belongs to
    private String deviceId;
    // the device model
    private String deviceModelId;
    private String deviceModelName;
    // the device component
    private String deviceComponentId;
    private String deviceComponentName;

    private String measurementName;
    private String fullScore;
    private String currentScore;
    // above, currentScore <= fullScore
    private String measurementDescription;


    public DeviceComponentLoss(String id, String deviceId, String deviceModelId, String deviceModelName, String deviceComponentId, String deviceComponentName, String measurementName, String fullScore, String currentScore, String measurementDescription) {
        super(id);
        this.deviceId = deviceId;
        this.deviceModelId = deviceModelId;
        this.deviceModelName = deviceModelName;
        this.deviceComponentId = deviceComponentId;
        this.deviceComponentName = deviceComponentName;
        this.measurementName = measurementName;
        this.fullScore = fullScore;
        this.currentScore = currentScore;
        this.measurementDescription = measurementDescription;
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

    public String getMeasurementName() {
        return measurementName;
    }

    public void setMeasurementName(String measurementName) {
        this.measurementName = measurementName;
    }

    public String getFullScore() {
        return fullScore;
    }

    public void setFullScore(String fullScore) {
        this.fullScore = fullScore;
    }

    public String getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(String currentScore) {
        this.currentScore = currentScore;
    }

    public String getMeasurementDescription() {
        return measurementDescription;
    }

    public void setMeasurementDescription(String measurementDescription) {
        this.measurementDescription = measurementDescription;
    }
}
