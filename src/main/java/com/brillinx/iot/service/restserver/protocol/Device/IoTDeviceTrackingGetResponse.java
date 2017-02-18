package com.brillinx.iot.service.restserver.protocol.Device;

import com.brillinx.iot.service.core.entity.device.DeviceTracking;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 12/18/16.
 *
 * the time range [startTime, endTime] for the device tracking map
 */
public class IoTDeviceTrackingGetResponse extends IoTResponse{

    private Integer startTime;
    private Integer endTime;
    private DeviceTracking[] values;


    public IoTDeviceTrackingGetResponse(Integer startTime, Integer endTime, DeviceTracking[] values) {
        super(IoTResponseId.DeviceTrackingResponse_Id);
        this.startTime = startTime;
        this.endTime = endTime;
        this.values = values;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public DeviceTracking[] getValues() {
        return values;
    }

    public void setValues(DeviceTracking[] values) {
        this.values = values;
    }
}
