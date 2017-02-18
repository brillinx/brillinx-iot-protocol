package com.brillinx.iot.service.restserver.protocol.DeviceModel;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTDeviceModelCreationResponse extends IoTResponse{

    private String deviceModelId;

    public IoTDeviceModelCreationResponse() {
        super(IoTResponseId.UserModelCreationResp_Id);
    }

    public IoTDeviceModelCreationResponse(String deviceModelId) {
        super(IoTResponseId.UserModelCreationResp_Id);
        this.deviceModelId = deviceModelId;
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
    }
}
