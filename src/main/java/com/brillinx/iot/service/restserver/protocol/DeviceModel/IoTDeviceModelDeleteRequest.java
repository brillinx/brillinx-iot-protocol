package com.brillinx.iot.service.restserver.protocol.DeviceModel;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTDeviceModelDeleteRequest extends IoTRequest {

    public IoTDeviceModelDeleteRequest() {
        super(IoTRequestId.UserModelDeleteReq_Id);
    }
}
