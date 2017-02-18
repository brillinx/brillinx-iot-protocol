package com.brillinx.iot.service.restserver.protocol.space;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTSpaceDeleteRequest extends IoTRequest{
    public IoTSpaceDeleteRequest() {
        super(IoTRequestId.SpaceDeleteReq_Id);
    }
}
