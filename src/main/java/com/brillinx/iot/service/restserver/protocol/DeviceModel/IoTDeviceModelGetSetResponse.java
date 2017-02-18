package com.brillinx.iot.service.restserver.protocol.DeviceModel;

import com.brillinx.iot.service.core.entity.devicemodel.DeviceModel;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

import java.util.Vector;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTDeviceModelGetSetResponse extends IoTResponse {

    private Vector<DeviceModel> deviceModels = new Vector<DeviceModel>();

    public IoTDeviceModelGetSetResponse() {
        super(IoTResponseId.UserModelGetSetResp_Id);
    }

    public IoTDeviceModelGetSetResponse( Vector<DeviceModel> deviceModels) {
        super(IoTResponseId.UserModelGetSetResp_Id);
        this.deviceModels = deviceModels;
    }

    public IoTDeviceModelGetSetResponse(Integer bSuccess, String errorMessage) {
        super(IoTResponseId.UserModelGetSetResp_Id, bSuccess, errorMessage);
    }

    public Vector<DeviceModel> getDeviceModels() {
        return deviceModels;
    }

    public void setDeviceModels(Vector<DeviceModel> deviceModels) {
        this.deviceModels = deviceModels;
    }
}
