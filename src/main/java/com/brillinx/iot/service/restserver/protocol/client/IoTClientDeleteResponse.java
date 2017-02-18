package com.brillinx.iot.service.restserver.protocol.client;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 2/5/17.
 */
public class IoTClientDeleteResponse extends IoTResponse{
    public IoTClientDeleteResponse() {
        super(IoTResponseId.ClientDeleteResponse_Id);
    }
}
