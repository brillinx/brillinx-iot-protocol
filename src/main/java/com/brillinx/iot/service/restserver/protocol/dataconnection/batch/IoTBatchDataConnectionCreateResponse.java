package com.brillinx.iot.service.restserver.protocol.dataconnection.batch;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/21.
 */
public class IoTBatchDataConnectionCreateResponse extends IoTResponse{
    private String batchDataConnectionId;

    public IoTBatchDataConnectionCreateResponse( String batchDataConnectionId) {
        super(IoTResponseId.BatchDataConnectCreateResponse_Id);
        this.batchDataConnectionId = batchDataConnectionId;
    }
}
