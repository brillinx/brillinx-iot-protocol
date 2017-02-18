package com.brillinx.iot.service.core.entity.devicemodel;

import com.brillinx.iot.service.core.entity.Entity;
import com.google.gson.Gson;

import java.util.Vector;

/**
 * Created by Kai on 2016/7/9.
 */
public class DeviceModel extends Entity {

    private String iotUserId;
    private String deviceModelName;
    private String deviceModelComments;
    private Vector<DeviceModelProperty> deviceModelProperties = new Vector<DeviceModelProperty>();

    public DeviceModel() {
    }

    public DeviceModel(String id, String iotUserId, String deviceModelName, String deviceModelComments, Vector<DeviceModelProperty> deviceModelProperties) {
        super(id);
        this.iotUserId = iotUserId;
        this.deviceModelName = deviceModelName;
        this.deviceModelComments = deviceModelComments;
        this.deviceModelProperties = deviceModelProperties;
    }

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public Vector<DeviceModelProperty> getDeviceModelProperties() {
        return deviceModelProperties;
    }

    public void setDeviceModelProperties(Vector<DeviceModelProperty> deviceModelProperties) {
        this.deviceModelProperties = deviceModelProperties;
    }

    public String getIotUserId() {
        return iotUserId;
    }

    public void setIotUserId(String iotUserId) {
        this.iotUserId = iotUserId;
    }

    public String getDeviceModelComments() {
        return deviceModelComments;
    }

    public void setDeviceModelComments(String deviceModelComments) {
        this.deviceModelComments = deviceModelComments;
    }

    public static void main(String[] args)
    {
        DeviceModelProperty dmp1 = new DeviceModelProperty("id",1,"dmid","pn","pc","sfsf");

        Vector<DeviceModelProperty> dmpv = new Vector<DeviceModelProperty>();
        dmpv.add(dmp1);

        DeviceModel dm = new DeviceModel("id","cid","dmname","dmcomments",dmpv);

        Gson gson  = new Gson();
        System.out.println(gson.toJson(dm));

    }
}
