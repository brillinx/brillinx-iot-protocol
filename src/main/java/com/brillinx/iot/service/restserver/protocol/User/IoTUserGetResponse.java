package com.brillinx.iot.service.restserver.protocol.User;

import com.brillinx.iot.service.core.entity.user.User;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by Kai on 2016/7/20.
 */
public class IoTUserGetResponse extends IoTResponse {

    private User user;

    public IoTUserGetResponse(User user) {
        super(IoTResponseId.UserGetResp_Id);
        this.user = user;
    }

    public IoTUserGetResponse(Integer bSuccess, String errorMessage) {
        super(IoTResponseId.UserGetResp_Id, bSuccess, errorMessage);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
