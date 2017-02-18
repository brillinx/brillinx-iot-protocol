package com.brillinx.iot.service.restserver.protocol.dataconnection.batch;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/21.
 */
public class IoTBatchDataConnectionDeleteResponse extends IoTResponse{
    public IoTBatchDataConnectionDeleteResponse() {
        super(IoTResponseId.BatchDataConnectDeleteResponse_Id);
    }
}
