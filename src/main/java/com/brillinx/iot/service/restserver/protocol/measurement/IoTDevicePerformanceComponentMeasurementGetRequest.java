package com.brillinx.iot.service.restserver.protocol.measurement;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 12/18/16.
 */
public class IoTDevicePerformanceComponentMeasurementGetRequest extends IoTRequest{

    public IoTDevicePerformanceComponentMeasurementGetRequest() {
        super(IoTRequestId.DevicePerformanceComponentMeasurementGetRequest_Id);
    }
}
