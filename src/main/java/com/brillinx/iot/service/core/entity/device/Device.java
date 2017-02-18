package com.brillinx.iot.service.core.entity.device;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by Kai on 2016/7/9.
 */
public class Device extends Entity {

    private String deviceModelId;
    private String devceiModelName;
    private String client_id; // reference clientinfo entity
    private Float last_latitude;
    private Float last_longitude;
    private Integer last_contact_time;

    public Device(String id, String deviceModelId, String devceiModelName, String client_id, Float last_latitude, Float last_longitude, Integer last_contact_time) {
        super(id);
        this.deviceModelId = deviceModelId;
        this.devceiModelName = devceiModelName;
        this.client_id = client_id;
        this.last_latitude = last_latitude;
        this.last_longitude = last_longitude;
        this.last_contact_time = last_contact_time;
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public String getDevceiModelName() {
        return devceiModelName;
    }

    public void setDevceiModelName(String devceiModelName) {
        this.devceiModelName = devceiModelName;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String user_id) {
        this.client_id = client_id;
    }


    public Float getLast_latitude() {
        return last_latitude;
    }

    public void setLast_latitude(Float last_latitude) {
        this.last_latitude = last_latitude;
    }

    public Float getLast_longitude() {
        return last_longitude;
    }

    public void setLast_longitude(Float last_longitude) {
        this.last_longitude = last_longitude;
    }

    public Integer getLast_contact_time() {
        return last_contact_time;
    }

    public void setLast_contact_time(Integer last_contact_time) {
        this.last_contact_time = last_contact_time;
    }
}
