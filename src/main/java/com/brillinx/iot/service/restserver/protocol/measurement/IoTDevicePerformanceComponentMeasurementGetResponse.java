package com.brillinx.iot.service.restserver.protocol.measurement;

import com.brillinx.iot.service.core.entity.device.DeviceComponentSingleValueMeasurement;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 12/18/16.
 */
public class IoTDevicePerformanceComponentMeasurementGetResponse extends IoTResponse{


    private DeviceComponentSingleValueMeasurement[] values;

    public IoTDevicePerformanceComponentMeasurementGetResponse(DeviceComponentSingleValueMeasurement[] values) {
        super(IoTResponseId.DeviceDeploymentMapPerUserResponse_Id);
        this.values = values;
    }

    public DeviceComponentSingleValueMeasurement[] getValues() {
        return values;
    }

    public void setValues(DeviceComponentSingleValueMeasurement[] values) {
        this.values = values;
    }
}
