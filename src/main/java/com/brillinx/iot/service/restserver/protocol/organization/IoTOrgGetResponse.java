package com.brillinx.iot.service.restserver.protocol.organization;

import com.brillinx.iot.service.core.entity.user.Organization;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTOrgGetResponse extends IoTResponse{

    private Organization organization;

    public IoTOrgGetResponse(Organization organization) {
        super(IoTResponseId.OrgGetResponse_Id);
        this.organization = organization;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
