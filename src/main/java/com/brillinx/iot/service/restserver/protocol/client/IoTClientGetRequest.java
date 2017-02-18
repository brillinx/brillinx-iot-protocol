package com.brillinx.iot.service.restserver.protocol.client;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 2/5/17.
 */
public class IoTClientGetRequest extends IoTRequest{
    public IoTClientGetRequest() {
        super(IoTRequestId.ClientGetReq_Id);
    }
}
