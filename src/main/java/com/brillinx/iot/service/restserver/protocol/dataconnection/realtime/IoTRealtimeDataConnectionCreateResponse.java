package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionCreateResponse extends IoTResponse {
    private String realtimeDataConnectionId;
    public IoTRealtimeDataConnectionCreateResponse(String realtimeDataConnectionId) {
        super(IoTResponseId.RealtimeDataConnectCreateResponse_Id);
        this.realtimeDataConnectionId = realtimeDataConnectionId;
    }

    public String getRealtimeDataConnectionId() {
        return realtimeDataConnectionId;
    }

    public void setRealtimeDataConnectionId(String realtimeDataConnectionId) {
        this.realtimeDataConnectionId = realtimeDataConnectionId;
    }
}
