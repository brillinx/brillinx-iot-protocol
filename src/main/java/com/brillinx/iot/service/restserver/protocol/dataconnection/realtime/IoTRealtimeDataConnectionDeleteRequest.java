package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionDeleteRequest extends IoTRequest {
    public IoTRealtimeDataConnectionDeleteRequest() {
        super(IoTRequestId.RealtimeDataConnectDeleteReq_Id);
    }
}
