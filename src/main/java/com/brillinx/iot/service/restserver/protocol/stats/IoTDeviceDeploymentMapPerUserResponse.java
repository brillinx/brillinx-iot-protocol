package com.brillinx.iot.service.restserver.protocol.stats;

import com.brillinx.iot.service.core.entity.stats.DeviceDeploymentMapPerUser;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 12/10/16.
 */
public class IoTDeviceDeploymentMapPerUserResponse extends IoTResponse{

    private DeviceDeploymentMapPerUser deviceDeploymentMapPerUser;

    public IoTDeviceDeploymentMapPerUserResponse() {
        super(IoTResponseId.DeviceDeploymentMapPerUserResponse_Id);
    }

    public IoTDeviceDeploymentMapPerUserResponse(DeviceDeploymentMapPerUser deviceDeploymentMapPerUser) {
        super(IoTResponseId.DeviceDeploymentMapPerUserResponse_Id);
        this.deviceDeploymentMapPerUser = deviceDeploymentMapPerUser;
    }

    public DeviceDeploymentMapPerUser getDeviceDeploymentMapPerUser() {
        return deviceDeploymentMapPerUser;
    }

    public void setDeviceDeploymentMapPerUser(DeviceDeploymentMapPerUser deviceDeploymentMapPerUser) {
        this.deviceDeploymentMapPerUser = deviceDeploymentMapPerUser;
    }
}
