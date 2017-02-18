package com.brillinx.iot.service.web;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 11/2/16.
 * dashboard of summary for a specific user under certain client.
 */
public class DashboardSummary extends Entity{

    private String userId;
    private String userName;

    private String clientId;
    private String clientName;

    private String orgId;
    private String orgName;

    private String spaceId;
    private String spaceName;

    // the device count
    private Integer deviceCount;

    // error count so far
    private Integer errorCount;

    // warning count so far
    private Integer warningCount;

    // service count so far
    private Integer serviceCount;

    // application so far
    private Integer applicationCount;

    // when the summary is generated
    private Integer generatedTimestamp;


    public DashboardSummary(String id, String userId, String userName, String clientId, String clientName, String orgId, String orgName, String spaceId, String spaceName, Integer deviceCount, Integer errorCount, Integer warningCount, Integer serviceCount, Integer applicationCount, Integer generatedTimestamp) {
        super(id);
        this.userId = userId;
        this.userName = userName;
        this.clientId = clientId;
        this.clientName = clientName;
        this.orgId = orgId;
        this.orgName = orgName;
        this.spaceId = spaceId;
        this.spaceName = spaceName;
        this.deviceCount = deviceCount;
        this.errorCount = errorCount;
        this.warningCount = warningCount;
        this.serviceCount = serviceCount;
        this.applicationCount = applicationCount;
        this.generatedTimestamp = generatedTimestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public Integer getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(Integer deviceCount) {
        this.deviceCount = deviceCount;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    public Integer getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
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

    public Integer getGeneratedTimestamp() {
        return generatedTimestamp;
    }

    public void setGeneratedTimestamp(Integer generatedTimestamp) {
        this.generatedTimestamp = generatedTimestamp;
    }
}
