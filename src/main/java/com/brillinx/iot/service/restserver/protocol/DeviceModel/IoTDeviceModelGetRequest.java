package com.brillinx.iot.service.restserver.protocol.DeviceModel;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTDeviceModelGetRequest extends IoTRequest {
    public IoTDeviceModelGetRequest() {
        super(IoTRequestId.UserModelGetReq_Id);
    }

}
