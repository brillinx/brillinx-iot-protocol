package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionGetRequest  extends IoTRequest {
    public IoTRealtimeDataConnectionGetRequest() {
        super(IoTResponseId.RealtimeDataConnectGetResponse_Id);
    }
}
