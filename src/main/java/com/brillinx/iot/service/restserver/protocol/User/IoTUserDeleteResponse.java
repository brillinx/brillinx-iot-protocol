package com.brillinx.iot.service.restserver.protocol.User;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTUserDeleteResponse extends IoTResponse {

    public IoTUserDeleteResponse() {
        super(IoTResponseId.UserDeleteResp_Id);
    }

    public IoTUserDeleteResponse(Integer bSuccess, String errorMessage) {
        super(IoTResponseId.UserDeleteResp_Id, bSuccess, errorMessage);
    }
}
