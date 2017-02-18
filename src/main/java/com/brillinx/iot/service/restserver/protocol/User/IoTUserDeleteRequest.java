package com.brillinx.iot.service.restserver.protocol.User;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTUserDeleteRequest extends IoTRequest{

    public IoTUserDeleteRequest() {
        super(IoTRequestId.UserDeleteReq_Id);
    }
}
