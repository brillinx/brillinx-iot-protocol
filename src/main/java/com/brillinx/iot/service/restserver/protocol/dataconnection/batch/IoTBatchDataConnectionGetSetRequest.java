package com.brillinx.iot.service.restserver.protocol.dataconnection.batch;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by Kai on 2016/7/21.
 */
public class IoTBatchDataConnectionGetSetRequest extends IoTRequest {
    public IoTBatchDataConnectionGetSetRequest() {
        super(IoTRequestId.BatchDataConnectGetSetReq_Id);
    }
}
