package com.brillinx.iot.service.restserver.protocol.stats;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 12/10/16.
 */
public class IoTDeviceDeploymentMapPerUserRequest extends IoTRequest{
    public IoTDeviceDeploymentMapPerUserRequest() {
        super(IoTRequestId.DeviceDeploymentMapPerUserRequest_Id);
    }
}
