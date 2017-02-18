package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionGetSetRequest extends IoTRequest {
    public IoTRealtimeDataConnectionGetSetRequest() {
        super(IoTRequestId.RealtimeDataConnectGetSetReq_Id);
    }
}
