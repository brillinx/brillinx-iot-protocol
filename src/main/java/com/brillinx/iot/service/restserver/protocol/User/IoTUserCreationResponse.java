package com.brillinx.iot.service.restserver.protocol.User;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/19.
 */
public class IoTUserCreationResponse extends IoTResponse {

    public IoTUserCreationResponse() {
        super(IoTResponseId.UserCreationResp_Id);
    }

    public IoTUserCreationResponse(Integer bSuccess, String errorMessage) {
        super(IoTResponseId.UserCreationResp_Id, bSuccess, errorMessage);
    }
}
