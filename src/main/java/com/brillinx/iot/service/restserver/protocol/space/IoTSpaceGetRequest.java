package com.brillinx.iot.service.restserver.protocol.space;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTSpaceGetRequest extends IoTRequest{
    public IoTSpaceGetRequest() {
        super(IoTRequestId.SpaceGetReq_Id);
    }
}
