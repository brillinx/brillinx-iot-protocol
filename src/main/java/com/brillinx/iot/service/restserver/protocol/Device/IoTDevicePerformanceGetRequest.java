package com.brillinx.iot.service.restserver.protocol.Device;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 12/13/16.
 */
public class IoTDevicePerformanceGetRequest extends IoTRequest{
    public IoTDevicePerformanceGetRequest() {
        super(IoTRequestId.DevicePerformanceGetRequest_Id);
    }
}
