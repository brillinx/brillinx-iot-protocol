package com.brillinx.iot.service.core.entity.device;

/**
 * Created by kaizhao on 12/18/16.
 *
 * single value measurement for a device
 */
public class DeviceComponentSingleValueMeasurement {

    private String deviceComponentId;
    private String measurementId;

    private Integer time;
    private Float value;

    public DeviceComponentSingleValueMeasurement(String deviceComponentId, String measurementId, Integer time, Float value) {
        this.deviceComponentId = deviceComponentId;
        this.measurementId = measurementId;
        this.time = time;
        this.value = value;
    }

    public String getDeviceComponentId() {
        return deviceComponentId;
    }

    public void setDeviceComponentId(String deviceComponentId) {
        this.deviceComponentId = deviceComponentId;
    }

    public String getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(String measurementId) {
        this.measurementId = measurementId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
