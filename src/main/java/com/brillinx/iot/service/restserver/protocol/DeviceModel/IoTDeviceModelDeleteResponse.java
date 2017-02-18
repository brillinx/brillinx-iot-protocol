package com.brillinx.iot.service.restserver.protocol.DeviceModel;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTDeviceModelDeleteResponse extends IoTResponse{
    public IoTDeviceModelDeleteResponse() {
        super(IoTResponseId.UserModelDeleteResp_Id);
    }

    public IoTDeviceModelDeleteResponse(Integer bSuccess, String errorMessage) {
        super(IoTResponseId.UserModelDeleteResp_Id, bSuccess, errorMessage);
    }
}
