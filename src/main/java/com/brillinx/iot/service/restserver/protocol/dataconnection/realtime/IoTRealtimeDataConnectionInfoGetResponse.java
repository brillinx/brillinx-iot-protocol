package com.brillinx.iot.service.restserver.protocol.dataconnection.realtime;

import com.brillinx.iot.service.core.entity.dataconnection.realtime.RealtimeDataConnectionInfo;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 10/12/16.
 */
public class IoTRealtimeDataConnectionInfoGetResponse extends IoTResponse {
    private RealtimeDataConnectionInfo realtimeDataConnectionInfo;


    public IoTRealtimeDataConnectionInfoGetResponse() {
        super(IoTResponseId.RealtimeDataConnectInfoGetResponse_Id);
    }

    public IoTRealtimeDataConnectionInfoGetResponse(RealtimeDataConnectionInfo realtimeDataConnectionInfo) {
        super(IoTResponseId.RealtimeDataConnectInfoGetResponse_Id);
        this.realtimeDataConnectionInfo = realtimeDataConnectionInfo;
    }


    public RealtimeDataConnectionInfo getRealtimeDataConnectionInfo() {
        return realtimeDataConnectionInfo;
    }

    public void setRealtimeDataConnectionInfo(RealtimeDataConnectionInfo realtimeDataConnectionInfo) {
        this.realtimeDataConnectionInfo = realtimeDataConnectionInfo;
    }
}
