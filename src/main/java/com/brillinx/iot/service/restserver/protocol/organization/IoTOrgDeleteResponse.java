package com.brillinx.iot.service.restserver.protocol.organization;

import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTOrgDeleteResponse extends IoTResponse{
    public IoTOrgDeleteResponse() {
        super(IoTResponseId.OrgDeleteResponse_Id);
    }
}
