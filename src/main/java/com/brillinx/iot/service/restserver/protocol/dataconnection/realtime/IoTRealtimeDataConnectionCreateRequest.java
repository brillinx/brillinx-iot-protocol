package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionCreateRequest extends IoTRequest {

    // the data connection id given by the user
    private String realtimeDataConnectionId;
    // the device model id that user selected
    private String deviceModelId;
    // user comments on this connection
    private String realtimeDataConnectComments;


    public IoTRealtimeDataConnectionCreateRequest() {
        super(IoTRequestId.RealtimeDataConnectCreateReq_Id);
    }

    public IoTRealtimeDataConnectionCreateRequest(String realtimeDataConnectionId,
                                                  String deviceModelId,
                                                  String realtimeDataConnectComments)
    {
        super(IoTRequestId.RealtimeDataConnectCreateReq_Id);
        this.realtimeDataConnectionId = realtimeDataConnectionId;
        this.deviceModelId = deviceModelId;
        this.realtimeDataConnectComments = realtimeDataConnectComments;
    }

    public String getRealtimeDataConnectionId() {
        return realtimeDataConnectionId;
    }

    public void setRealtimeDataConnectionId(String realtimeDataConnectionId) {
        this.realtimeDataConnectionId = realtimeDataConnectionId;
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public String getRealtimeDataConnectComments() {
        return realtimeDataConnectComments;
    }

    public void setRealtimeDataConnectComments(String realtimeDataConnectComments) {
        this.realtimeDataConnectComments = realtimeDataConnectComments;
    }
}
