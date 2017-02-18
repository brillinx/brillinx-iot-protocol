package com.brillinx.iot.service.core.entity.receiver;

/**
 * Created by kaizhao on 10/22/16.
 * ReceiverInfo, the entry in Receiver Pool
 */
public class ReceiverInfo {

    private String receiverGuid;
    // what's the type of receiver
    private String receiverType;
    private String receiverStatus;
    // receiver parameters for restexpress
    private String restexpressBaseUrl;
    private Integer restexpressExecutorThreadPoolSize;
    private Integer restexpressPort;

    private String geoLocationGUID;
    // when the entry is created
    private Integer createdDate;
    private Integer lastUpdatedDate;

    // post_token_url_template VARCHAR(1024)
    private String postTokenUrlTemplate;
    //post_datapoint_url_tempalte VARCHAR(1024)
    private String postDataPointUrlTemplate;

    public ReceiverInfo(String receiverGuid, String receiverType, String receiverStatus, String restexpressBaseUrl, Integer restexpressExecutorThreadPoolSize, Integer restexpressPort, String geoLocationGUID, Integer createdDate, Integer lastUpdatedDate, String postTokenUrlTemplate, String postDataPointUrlTemplate) {
        this.receiverGuid = receiverGuid;
        this.receiverType = receiverType;
        this.receiverStatus = receiverStatus;
        this.restexpressBaseUrl = restexpressBaseUrl;
        this.restexpressExecutorThreadPoolSize = restexpressExecutorThreadPoolSize;
        this.restexpressPort = restexpressPort;
        this.geoLocationGUID = geoLocationGUID;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.postTokenUrlTemplate = postTokenUrlTemplate;
        this.postDataPointUrlTemplate = postDataPointUrlTemplate;
    }

    public String getReceiverGuid() {
        return receiverGuid;
    }

    public void setReceiverGuid(String receiverGuid) {
        this.receiverGuid = receiverGuid;
    }

    public String getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(String receiverType) {
        this.receiverType = receiverType;
    }

    public String getReceiverStatus() {
        return receiverStatus;
    }

    public void setReceiverStatus(String receiverStatus) {
        this.receiverStatus = receiverStatus;
    }

    public String getRestexpressBaseUrl() {
        return restexpressBaseUrl;
    }

    public void setRestexpressBaseUrl(String restexpressBaseUrl) {
        this.restexpressBaseUrl = restexpressBaseUrl;
    }

    public Integer getRestexpressExecutorThreadPoolSize() {
        return restexpressExecutorThreadPoolSize;
    }

    public void setRestexpressExecutorThreadPoolSize(Integer restexpressExecutorThreadPoolSize) {
        this.restexpressExecutorThreadPoolSize = restexpressExecutorThreadPoolSize;
    }

    public Integer getRestexpressPort() {
        return restexpressPort;
    }

    public void setRestexpressPort(Integer restexpressPort) {
        this.restexpressPort = restexpressPort;
    }

    public String getGeoLocationGUID() {
        return geoLocationGUID;
    }

    public void setGeoLocationGUID(String geoLocationGUID) {
        this.geoLocationGUID = geoLocationGUID;
    }

    public Integer getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Integer lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getPostTokenUrlTemplate() {
        return postTokenUrlTemplate;
    }

    public void setPostTokenUrlTemplate(String postTokenUrlTemplate) {
        this.postTokenUrlTemplate = postTokenUrlTemplate;
    }

    public String getPostDataPointUrlTemplate() {
        return postDataPointUrlTemplate;
    }

    public void setPostDataPointUrlTemplate(String postDataPointUrlTemplate) {
        this.postDataPointUrlTemplate = postDataPointUrlTemplate;
    }
}

