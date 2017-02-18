package com.brillinx.iot.service.restserver.protocol.event;

import com.brillinx.iot.service.core.entity.event.Warning;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 12/18/16.
 */
public class IoTDeviceWarningGetResponse extends IoTResponse{

    private Warning warning;

    public IoTDeviceWarningGetResponse(Warning warning) {
        super(IoTResponseId.DeviceWarningGetResponse_Id);
        this.warning = warning;
    }

    public Warning getWarning() {
        return warning;
    }

    public void setWarning(Warning warning) {
        this.warning = warning;
    }
}
