package com.brillinx.iot.service.restserver.protocol.event;

import com.brillinx.iot.service.core.entity.event.Warning;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 12/18/16.
 */
public class IoTDeviceWarningSetGetResponse extends IoTResponse{

    private Warning[] warnings;

    public IoTDeviceWarningSetGetResponse(Warning[] warnings) {
        super(IoTResponseId.DeviceWarningSetGetResponse_Id);
        this.warnings = warnings;
    }

    public Warning[] getWarnings() {
        return warnings;
    }

    public void setWarnings(Warning[] warnings) {
        this.warnings = warnings;
    }
}
