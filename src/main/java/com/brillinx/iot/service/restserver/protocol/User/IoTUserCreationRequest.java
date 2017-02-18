package com.brillinx.iot.service.restserver.protocol.User;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by Kai on 2016/7/19.
 * the user creation should be a kind of offline work,creation under certaion unqiue id of org and space
 */
public class IoTUserCreationRequest extends IoTRequest {

    private String userName;
    private String userEmail;
    private String encryptedPassword;


    public IoTUserCreationRequest() {
        super(IoTRequestId.UserCreationReq_Id);
    }

    public IoTUserCreationRequest(String userName, String userEmail, String encryptedPassword, String organizationId, String spaceId) {
        super(IoTRequestId.UserCreationReq_Id, organizationId, spaceId);
        this.userName = userName;
        this.userEmail = userEmail;
        this.encryptedPassword = encryptedPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

}
