package com.brillinx.iot.service.restserver.protocol.Device;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 12/18/16.
 *
 * get the device tracking map
 */
public class IoTDeviceTrackingGetRequest extends IoTRequest {
    public IoTDeviceTrackingGetRequest() {
        super(IoTRequestId.DeviceTrackingReq_Id);
    }
}
