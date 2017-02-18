package com.brillinx.iot.service.core.entity.stats;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 11/12/16.
 */
public class ResourceUsagePerUser extends Entity{

    private String userId;
    // stats collected time
    private Long collectTimestamp;
    // how many devices under this user
    private Integer deviceCount;
    // warining so far
    private Integer warningCount;
    // error so far
    private Integer errorCount;
    // service applied
    private Integer serviceCount;
    // application applied
    private Integer applicationCount;

    // other resources put at the below


    public ResourceUsagePerUser() {
    }

    public ResourceUsagePerUser(String id, String userId, Long collectTimestamp, Integer deviceCount, Integer warningCount, Integer errorCount, Integer serviceCount, Integer applicationCount) {
        super(id);
        this.userId = userId;
        this.collectTimestamp = collectTimestamp;
        this.deviceCount = deviceCount;
        this.warningCount = warningCount;
        this.errorCount = errorCount;
        this.serviceCount = serviceCount;
        this.applicationCount = applicationCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getCollectTimestamp() {
        return collectTimestamp;
    }

    public void setCollectTimestamp(Long collectTimestamp) {
        this.collectTimestamp = collectTimestamp;
    }

    public Integer getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
    }

    public Integer getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Integer getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
    }

    public Integer getApplicationCount() {
        return applicationCount;
    }

    public void setApplicationCount(Integer applicationCount) {
        this.applicationCount = applicationCount;
    }
}
