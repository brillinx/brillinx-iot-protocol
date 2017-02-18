package com.brillinx.iot.service.core.entity.storage;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 10/22/16.
 */
public class DatabaseStoragePoolEntry extends Entity{


    // which type of database
    private String databaseType;

    // database jdbc type
    private String jdbcDriverClass;
    private String hostname;
    private Integer port;
    private String username;
    private String password;
    private String databaseName;
    private String encoding;


    // management info
    // geo location, region
    private String geoLocationGuid;
    // when the entry is created
    private Integer createdDate;
    private Integer lastUpdatedDate;
    // total storage capacity in GB
    private Integer totalCapacityGB;
    // used
    private Integer usedCapacityGB;


    public DatabaseStoragePoolEntry() {
    }

    public DatabaseStoragePoolEntry(String id, String databaseType, String jdbcDriverClass, String hostname, Integer port, String username, String password, String databaseName, String encoding, String geoLocationGuid, Integer createdDate, Integer lastUpdatedDate, Integer totalCapacityGB, Integer usedCapacityGB) {
        super(id);
        this.databaseType = databaseType;
        this.jdbcDriverClass = jdbcDriverClass;
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
        this.databaseName = databaseName;
        this.encoding = encoding;
        this.geoLocationGuid = geoLocationGuid;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.totalCapacityGB = totalCapacityGB;
        this.usedCapacityGB = usedCapacityGB;
    }


    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabase_type(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getJdbcDriverClass() {
        return jdbcDriverClass;
    }

    public void setJdbcDriverClass(String jdbcDriverClass) {
        this.jdbcDriverClass = jdbcDriverClass;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getGeoLocationGuid() {
        return geoLocationGuid;
    }

    public void setGeoLocationGuid(String geoLocationGuid) {
        this.geoLocationGuid = geoLocationGuid;
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

    public Integer getTotalCapacityGB() {
        return totalCapacityGB;
    }

    public void setTotalCapacityGB(Integer totalCapacityGB) {
        this.totalCapacityGB = totalCapacityGB;
    }

    public Integer getUsedCapacityGB() {
        return usedCapacityGB;
    }

    public void setUsedCapacityGB(Integer usedCapacityGB) {
        this.usedCapacityGB = usedCapacityGB;
    }
}
