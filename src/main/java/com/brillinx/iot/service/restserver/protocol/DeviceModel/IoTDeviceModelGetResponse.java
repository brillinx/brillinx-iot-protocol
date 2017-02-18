package com.brillinx.iot.service.restserver.protocol.DeviceModel;

import com.brillinx.iot.service.core.entity.devicemodel.DeviceModel;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTDeviceModelGetResponse extends IoTResponse{

    private DeviceModel deviceModel;

    public IoTDeviceModelGetResponse() {
        super(IoTResponseId.UserModelGetResp_Id);
    }

    public IoTDeviceModelGetResponse( DeviceModel deviceModel) {
        super(IoTResponseId.UserModelGetResp_Id);
        this.deviceModel = deviceModel;
    }

    public IoTDeviceModelGetResponse(Integer bSuccess, String errorMessage) {
        super(IoTResponseId.UserModelGetResp_Id, bSuccess, errorMessage);
    }

    public DeviceModel getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(DeviceModel deviceModel) {
        this.deviceModel = deviceModel;
    }
}
