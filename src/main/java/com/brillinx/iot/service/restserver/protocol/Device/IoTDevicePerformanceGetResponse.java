package com.brillinx.iot.service.restserver.protocol.Device;

import com.brillinx.iot.service.core.entity.device.DevicePerformance;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 12/13/16.
 */
public class IoTDevicePerformanceGetResponse extends IoTResponse {

    private DevicePerformance devicePerformance;

    public IoTDevicePerformanceGetResponse(DevicePerformance devicePerformance) {
        super(IoTResponseId.DevicePerformanceGetResponse_Id);
        this.devicePerformance = devicePerformance;
    }

    public DevicePerformance getDevicePerformance() {
        return devicePerformance;
    }

    public void setDevicePerformance(DevicePerformance devicePerformance) {
        this.devicePerformance = devicePerformance;
    }
}
