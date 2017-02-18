package com.brillinx.iot.service.restserver.protocol.stats;

import com.brillinx.iot.service.core.entity.stats.ResourceUsagePerUser;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 11/12/16.
 */
public class IoTResourceUsagePerUserResponse extends IoTResponse{

    private ResourceUsagePerUser resourceUsagePerUser;

    public IoTResourceUsagePerUserResponse() {
        super(IoTResponseId.ResourceUsagePerUserResponse_Id);
    }

    public IoTResourceUsagePerUserResponse(ResourceUsagePerUser resourceUsagePerUser) {
        super(IoTResponseId.ResourceUsagePerUserResponse_Id);
        this.resourceUsagePerUser = resourceUsagePerUser;
    }

    public ResourceUsagePerUser getResourceUsagePerUser() {
        return resourceUsagePerUser;
    }

    public void setResourceUsagePerUser(ResourceUsagePerUser resourceUsagePerUser) {
        this.resourceUsagePerUser = resourceUsagePerUser;
    }
}
