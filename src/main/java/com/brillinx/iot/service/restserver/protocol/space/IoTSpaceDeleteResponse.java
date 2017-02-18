package com.brillinx.iot.service.restserver.protocol.space;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTSpaceDeleteResponse extends IoTResponse{
    public IoTSpaceDeleteResponse() {
        super(IoTResponseId.SpaceDeleteResponse_Id);
    }
}
