package com.brillinx.iot.service.restserver.protocol.UserLogin;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by Kai on 2016/7/12.
 */
public class IoTUserLoginRequest extends IoTRequest {

    private String userName;
    private String encryptedPassword;

    public IoTUserLoginRequest() {
        super(IoTRequestId.UserLoginReq_Id);
    }


    public IoTUserLoginRequest(String userName, String encryptedPassword) {
        super(IoTRequestId.UserLoginReq_Id);
        this.userName = userName;
        this.encryptedPassword = encryptedPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
}
