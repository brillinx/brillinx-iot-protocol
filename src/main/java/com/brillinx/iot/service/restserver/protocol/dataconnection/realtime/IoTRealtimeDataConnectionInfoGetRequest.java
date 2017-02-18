package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.core.entity.dataconnection.realtime.RealtimeDataConnectionInfo;
import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionInfoGetRequest extends IoTRequest {

    public IoTRealtimeDataConnectionInfoGetRequest() {
        super(IoTRequestId.RealtimeDataConnectInfoGetReq_Id);
    }
}
