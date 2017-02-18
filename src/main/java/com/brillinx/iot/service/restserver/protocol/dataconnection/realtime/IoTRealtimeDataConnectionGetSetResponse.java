package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.core.entity.dataconnection.realtime.RealtimeDataConnection;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

import java.util.Vector;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionGetSetResponse extends IoTResponse {
    private Vector<RealtimeDataConnection> realtimeDataConnections = null;


    public IoTRealtimeDataConnectionGetSetResponse(Vector<RealtimeDataConnection> realtimeDataConnections) {
        super(IoTResponseId.RealtimeDataConnectGetSetResponse_Id);
        this.realtimeDataConnections = realtimeDataConnections;
    }

    public Vector<RealtimeDataConnection> getRealtimeDataConnections() {
        return realtimeDataConnections;
    }

    public void setRealtimeDataConnections(Vector<RealtimeDataConnection> realtimeDataConnections) {
        this.realtimeDataConnections = realtimeDataConnections;
    }
}
