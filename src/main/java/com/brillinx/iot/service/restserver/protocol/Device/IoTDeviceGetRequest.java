package com.brillinx.iot.service.restserver.protocol.Device;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 12/11/16.
 */
public class IoTDeviceGetRequest extends IoTRequest{
    public IoTDeviceGetRequest() {
        super(IoTRequestId.DeviceGetReq_Id);
    }
}
