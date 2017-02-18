package com.brillinx.iot.service.restserver.protocol.event;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 12/18/16.
 */
public class IoTDeviceWarningGetRequest extends IoTRequest{
    public IoTDeviceWarningGetRequest() {
        super(IoTRequestId.DeviceWarningGetReq_Id);
    }
}
