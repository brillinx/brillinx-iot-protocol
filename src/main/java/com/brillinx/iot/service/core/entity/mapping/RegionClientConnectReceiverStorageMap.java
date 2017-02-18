package com.brillinx.iot.service.core.entity.mapping;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 10/23/16.
 *
 * client in region x would like setup a connection adn set the data to
 * certain receiver and store the data in certaion storage
 */
public class RegionClientConnectReceiverStorageMap extends Entity{
    private String regionId;
    private String clientId;
    private String connectId;
    private String receiver_guid;
    private String storageId;

    public RegionClientConnectReceiverStorageMap(String id, String regionId, String clientId, String connectId, String receiver_guid, String storageId) {
        super(id);
        this.regionId = regionId;
        this.clientId = clientId;
        this.connectId = connectId;
        this.receiver_guid = receiver_guid;
        this.storageId = storageId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getConnectId() {
        return connectId;
    }

    public void setConnectId(String connectId) {
        this.connectId = connectId;
    }

    public String getReceiver_guid() {
        return receiver_guid;
    }

    public void setReceiver_guid(String receiver_guid) {
        this.receiver_guid = receiver_guid;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }
}
