package com.brillinx.iot.service.core.entity.client;

/**
 * Created by kaizhao on 10/22/16.
 */
public class ClientConnectInfo {

    // region of the server allocated
    private String regionId;

    // global id for the client
    private String clientId;

    // the data connection created by the client for certain type of devices
    private String connectId;

    // there maybe multiple receivers for one connection.
    private String receiverId;


    public ClientConnectInfo() {
    }

    public ClientConnectInfo(String regionId, String clientId, String connectId, String receiverId) {
        this.regionId = regionId;
        this.clientId = clientId;
        this.connectId = connectId;
        this.receiverId = receiverId;
    }

    public String getKey()
    {
        String key = regionId + "_" + clientId  + "_" + connectId  + "_" + receiverId;
        return key;
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

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
}

