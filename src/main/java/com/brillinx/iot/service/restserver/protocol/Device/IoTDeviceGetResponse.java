package com.brillinx.iot.service.restserver.protocol.Device;

import com.brillinx.iot.service.core.entity.device.Device;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

import java.util.Vector;

/**
 * Created by kaizhao on 12/11/16.
 */
public class IoTDeviceGetResponse extends IoTResponse{

    private Device device;

    public IoTDeviceGetResponse(Device device) {
        super(IoTResponseId.DeviceGetResponse_Id);
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
