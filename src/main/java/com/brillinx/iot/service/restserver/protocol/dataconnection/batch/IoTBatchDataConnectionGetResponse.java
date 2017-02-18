package com.brillinx.iot.service.restserver.protocol.dataconnection.batch;

import com.brillinx.iot.service.core.entity.dataconnection.batch.BatchDataConnection;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;

/**
 * Created by Kai on 2016/7/21.
 */
public class IoTBatchDataConnectionGetResponse extends IoTResponse{
    private BatchDataConnection batchDataConnection;

    public IoTBatchDataConnectionGetResponse(BatchDataConnection batchDataConnection) {
        super(IoTRequestId.BatchDataConnectGetReq_Id);
        this.batchDataConnection = batchDataConnection;
    }

    public BatchDataConnection getBatchDataConnection() {
        return batchDataConnection;
    }

    public void setBatchDataConnection(BatchDataConnection batchDataConnection) {
        this.batchDataConnection = batchDataConnection;
    }
}
