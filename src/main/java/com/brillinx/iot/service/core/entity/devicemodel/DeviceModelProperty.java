package com.brillinx.iot.service.core.entity.devicemodel;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by Kai on 2016/7/14.
 */
public class DeviceModelProperty extends Entity{

    private Integer seqNo;
    private String deviceModelId;
    private String propertyName;
    private String propertyComments;
    private String propertyValueRangeId;

    public DeviceModelProperty() {
    }

    public DeviceModelProperty(String id) {
        super(id);
    }

    public DeviceModelProperty(String id, Integer seqNo, String deviceModelId, String propertyName, String propertyComments, String propertyValueRangeId) {
        super(id);
        this.seqNo = seqNo;
        this.deviceModelId = deviceModelId;
        this.propertyName = propertyName;
        this.propertyComments = propertyComments;
        this.propertyValueRangeId = propertyValueRangeId;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyComments() {
        return propertyComments;
    }

    public void setPropertyComments(String propertyComments) {
        this.propertyComments = propertyComments;
    }

    public String getPropertyValueRangeId() {
        return propertyValueRangeId;
    }

    public void setPropertyValueRangeId(String propertyValueRangeId) {
        this.propertyValueRangeId = propertyValueRangeId;
    }
}
