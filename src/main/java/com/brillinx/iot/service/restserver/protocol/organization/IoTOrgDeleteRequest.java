package com.brillinx.iot.service.restserver.protocol.organization;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTOrgDeleteRequest extends IoTRequest{
    public IoTOrgDeleteRequest() {
        super(IoTRequestId.OrgDeleteReq_Id);
    }
}
