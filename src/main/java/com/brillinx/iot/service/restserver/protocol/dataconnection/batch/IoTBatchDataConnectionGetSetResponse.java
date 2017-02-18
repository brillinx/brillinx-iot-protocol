package com.brillinx.iot.service.restserver.protocol.dataconnection.batch;

import com.brillinx.iot.service.core.entity.dataconnection.batch.BatchDataConnection;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

import java.util.Vector;

/**
 * Created by Kai on 2016/7/21.
 */
public class IoTBatchDataConnectionGetSetResponse extends IoTResponse {

    private Vector<BatchDataConnection> batchDataConnections;

    public IoTBatchDataConnectionGetSetResponse(Vector<BatchDataConnection> batchDataConnection) {
        super(IoTResponseId.BatchDataConnectGetSetResponse_Id);
        this.batchDataConnections = batchDataConnection;
    }

    public Vector<BatchDataConnection> getBatchDataConnections() {
        return batchDataConnections;
    }

    public void setBatchDataConnections(Vector<BatchDataConnection> batchDataConnections) {
        this.batchDataConnections = batchDataConnections;
    }
}
