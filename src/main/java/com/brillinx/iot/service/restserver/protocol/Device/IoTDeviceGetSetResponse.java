package com.brillinx.iot.service.restserver.protocol.Device;

import com.brillinx.iot.service.core.entity.device.Device;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

import java.util.Vector;

/**
 * Created by kaizhao on 12/11/16.
 */
public class IoTDeviceGetSetResponse extends IoTResponse{
    private Vector<Device> devices;

    public IoTDeviceGetSetResponse(Vector<Device> devices) {
        super(IoTResponseId.DeviceGetSetResponse_Id);
        this.devices = devices;
    }

    public Vector<Device> getDevices() {
        return devices;
    }

    public void setDevices(Vector<Device> devices) {
        this.devices = devices;
    }
}
