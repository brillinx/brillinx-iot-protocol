package com.brillinx.iot.service.restserver.protocol.space;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTSpaceCreateResponse extends IoTResponse{
    public IoTSpaceCreateResponse() {
        super(IoTResponseId.SpaceCreateResponse_Id);
    }
}
