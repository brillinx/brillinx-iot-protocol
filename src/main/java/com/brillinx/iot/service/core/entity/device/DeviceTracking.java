package com.brillinx.iot.service.core.entity.device;

/**
 * Created by Kai on 2016/7/16.
 */
public class DeviceTracking {
    private String deviceId;
    private Integer track_time;
    private Float latitude;
    private Float longitude;

    public DeviceTracking(String deviceId, Integer track_time, Float latitude, Float longitude) {
        this.deviceId = deviceId;
        this.track_time = track_time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getTrack_time() {
        return track_time;
    }

    public void setTrack_time(Integer track_time) {
        this.track_time = track_time;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }
}
