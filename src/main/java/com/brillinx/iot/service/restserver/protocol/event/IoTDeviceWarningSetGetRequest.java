package com.brillinx.iot.service.restserver.protocol.event;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 12/18/16.
 */
public class IoTDeviceWarningSetGetRequest extends IoTRequest {
    public IoTDeviceWarningSetGetRequest() {
        super(IoTRequestId.DeviceWarningSetGetReq_Id);
    }
}
