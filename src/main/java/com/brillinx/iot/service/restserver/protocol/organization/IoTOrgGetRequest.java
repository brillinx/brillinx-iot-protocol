package com.brillinx.iot.service.restserver.protocol.organization;

import com.brillinx.iot.service.core.entity.user.Organization;
import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTOrgGetRequest extends IoTRequest{

    public IoTOrgGetRequest() {
        super(IoTRequestId.OrgGetReq_Id);
    }
}
