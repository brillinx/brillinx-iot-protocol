package com.brillinx.iot.service.core.entity.storage;

/**
 * Created by kaizhao on 10/15/16.
 */
public class StorageInfo {

    // from the storage information
    private String storageId;
    private String storageType;

    private String ip;
    private Integer port;
    private String userName;
    private String password;
    private String databaseName;
    private String encoding;

    // for data point storage
    private String deviceDatapointTablename;
    // for location tracking storage
    private String deviceTrackingTablename;
    // for the parsed data table
    private String batchDataTablename;

    public StorageInfo(String storageId, String storageType, String ip, Integer port, String userName, String password, String databaseName, String encoding, String deviceDatapointTablename, String deviceTrackingTablename) {
        this.storageId = storageId;
        this.storageType = storageType;
        this.ip = ip;
        this.port = port;
        this.userName = userName;
        this.password = password;
        this.databaseName = databaseName;
        this.encoding = encoding;
        this.deviceDatapointTablename = deviceDatapointTablename;
        this.deviceTrackingTablename = deviceTrackingTablename;
    }

    public StorageInfo(String storageId, String storageType, String ip, Integer port, String userName, String password, String databaseName, String encoding, String batchDataTablename) {
        this.storageId = storageId;
        this.storageType = storageType;
        this.ip = ip;
        this.port = port;
        this.userName = userName;
        this.password = password;
        this.databaseName = databaseName;
        this.encoding = encoding;
        this.deviceDatapointTablename = "";
        this.deviceTrackingTablename = "";
        this.batchDataTablename = batchDataTablename;
    }

    public StorageInfo(String storageId, String storageType, String ip, Integer port, String userName, String password, String databaseName, String encoding, String deviceDatapointTablename, String deviceTrackingTablename, String batchDataTablename) {
        this.storageId = storageId;
        this.storageType = storageType;
        this.ip = ip;
        this.port = port;
        this.userName = userName;
        this.password = password;
        this.databaseName = databaseName;
        this.encoding = encoding;
        this.deviceDatapointTablename = deviceDatapointTablename;
        this.deviceTrackingTablename = deviceTrackingTablename;
        this.batchDataTablename = batchDataTablename;
    }


    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getDeviceDatapointTablename() {
        return deviceDatapointTablename;
    }

    public void setDeviceDatapointTablename(String deviceDatapointTablename) {
        this.deviceDatapointTablename = deviceDatapointTablename;
    }

    public String getDeviceTrackingTablename() {
        return deviceTrackingTablename;
    }

    public void setDeviceTrackingTablename(String deviceTrackingTablename) {
        this.deviceTrackingTablename = deviceTrackingTablename;
    }

    public String getBatchDataTablename() {
        return batchDataTablename;
    }

    public void setBatchDataTablename(String batchDataTablename) {
        this.batchDataTablename = batchDataTablename;
    }
}

