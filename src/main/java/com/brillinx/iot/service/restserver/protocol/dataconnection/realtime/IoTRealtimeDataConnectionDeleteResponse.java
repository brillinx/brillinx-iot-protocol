package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionDeleteResponse extends IoTResponse{
    public IoTRealtimeDataConnectionDeleteResponse() {
        super(IoTResponseId.RealtimeDataConnectDeleteResponse_Id);
    }
}
