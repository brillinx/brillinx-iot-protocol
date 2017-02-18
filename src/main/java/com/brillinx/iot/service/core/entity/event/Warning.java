package com.brillinx.iot.service.core.entity.event;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 12/18/16.
 */
public class Warning extends Entity{

    private String warningCode;

    private String deviceId;

    private String warningName;

    private String warningStatus;

    private String warningDescription;

    private Integer createTime;

    private Integer closeTime;


    public Warning(String id, String warningCode, String deviceId, String warningName, String warningStatus, String warningDescription, Integer createTime, Integer closeTime) {
        super(id);
        this.warningCode = warningCode;
        this.deviceId = deviceId;
        this.warningName = warningName;
        this.warningStatus = warningStatus;
        this.warningDescription = warningDescription;
        this.createTime = createTime;
        this.closeTime = closeTime;
    }

    public String getWarningCode() {
        return warningCode;
    }

    public void setWarningCode(String warningCode) {
        this.warningCode = warningCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getWarningName() {
        return warningName;
    }

    public void setWarningName(String warningName) {
        this.warningName = warningName;
    }

    public String getWarningStatus() {
        return warningStatus;
    }

    public void setWarningStatus(String warningStatus) {
        this.warningStatus = warningStatus;
    }

    public String getWarningDescription() {
        return warningDescription;
    }

    public void setWarningDescription(String warningDescription) {
        this.warningDescription = warningDescription;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }
}
