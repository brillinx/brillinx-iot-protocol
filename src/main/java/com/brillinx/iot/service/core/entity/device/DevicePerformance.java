package com.brillinx.iot.service.core.entity.device;

import com.brillinx.iot.service.core.entity.Entity;

import java.util.Vector;

/**
 * Created by kaizhao on 12/11/16.
 */
public class DevicePerformance extends Entity{

    // the accumulated running hours since device alive
    private Integer accumulateRunningHours;

    // battery full percentage
    private Integer batteryFullPercentage;

    // latest communicate time
    private Integer latestCommunicateTime;

    // the device health evaluation result
    private String deviceHealthScore;

    // the component loss
    private Vector<DeviceComponentLoss> deviceComponentLosses;

    // the health for each component
    private Vector<DeviceComponentHealth> deviceComponentHealths;

    public DevicePerformance(String id, Integer accumulateRunningHours, Integer batteryFullPercentage, Integer latestCommunicateTime, String deviceHealthScore, Vector<DeviceComponentLoss> deviceComponentLosses, Vector<DeviceComponentHealth> deviceComponentHealths) {
        super(id);
        this.accumulateRunningHours = accumulateRunningHours;
        this.batteryFullPercentage = batteryFullPercentage;
        this.latestCommunicateTime = latestCommunicateTime;
        this.deviceHealthScore = deviceHealthScore;
        this.deviceComponentLosses = deviceComponentLosses;
        this.deviceComponentHealths = deviceComponentHealths;
    }

    public Integer getAccumulateRunningHours() {
        return accumulateRunningHours;
    }

    public void setAccumulateRunningHours(Integer accumulateRunningHours) {
        this.accumulateRunningHours = accumulateRunningHours;
    }

    public Integer getBatteryFullPercentage() {
        return batteryFullPercentage;
    }

    public void setBatteryFullPercentage(Integer batteryFullPercentage) {
        this.batteryFullPercentage = batteryFullPercentage;
    }

    public Integer getLatestCommunicateTime() {
        return latestCommunicateTime;
    }

    public void setLatestCommunicateTime(Integer latestCommunicateTime) {
        this.latestCommunicateTime = latestCommunicateTime;
    }

    public String getDeviceHealthScore() {
        return deviceHealthScore;
    }

    public void setDeviceHealthScore(String deviceHealthScore) {
        this.deviceHealthScore = deviceHealthScore;
    }

    public Vector<DeviceComponentLoss> getDeviceComponentLosses() {
        return deviceComponentLosses;
    }

    public void setDeviceComponentLosses(Vector<DeviceComponentLoss> deviceComponentLosses) {
        this.deviceComponentLosses = deviceComponentLosses;
    }

    public Vector<DeviceComponentHealth> getDeviceComponentHealths() {
        return deviceComponentHealths;
    }

    public void setDeviceComponentHealths(Vector<DeviceComponentHealth> deviceComponentHealths) {
        this.deviceComponentHealths = deviceComponentHealths;
    }
}
