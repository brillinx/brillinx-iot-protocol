package com.brillinx.iot.service.restserver.protocol.stats;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 11/12/16.
 */
public class IoTResourceUsagePerUserRequest extends IoTRequest{
    public IoTResourceUsagePerUserRequest() {
        super(IoTRequestId.ResourceUsagePerUserReq_Id);
    }
}
