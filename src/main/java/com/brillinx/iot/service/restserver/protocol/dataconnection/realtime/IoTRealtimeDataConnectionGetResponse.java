package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.core.entity.dataconnection.realtime.RealtimeDataConnection;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionGetResponse extends IoTResponse {
    private RealtimeDataConnection realtimeDataConnection = null;


    public IoTRealtimeDataConnectionGetResponse(RealtimeDataConnection realtimeDataConnection) {
        super(IoTResponseId.RealtimeDataConnectGetResponse_Id);
        this.realtimeDataConnection = realtimeDataConnection;
    }

    public RealtimeDataConnection getRealtimeDataConnection() {
        return realtimeDataConnection;
    }

    public void setRealtimeDataConnection(RealtimeDataConnection realtimeDataConnection) {
        this.realtimeDataConnection = realtimeDataConnection;
    }
}
