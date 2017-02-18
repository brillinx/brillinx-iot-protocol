package com.brillinx.iot.service.restserver.protocol;

/**
 * Created by Kai on 2016/7/12.
 */
public class IoTResponse {

    private Integer responseId;
    private Integer bSuccess;
    private String errorMessage;

    public IoTResponse(Integer responseId) {
        this.responseId = responseId;
        bSuccess = 1;
    }

    public IoTResponse(Integer responseId, Integer bSuccess, String errorMessage) {
        this.responseId = responseId;
        this.bSuccess = bSuccess;
        this.errorMessage = errorMessage;
    }

    public Integer getResponseId() {
        return responseId;
    }

    public void setResponseId(Integer responseId) {
        this.responseId = responseId;
    }

    public Integer getbSuccess() {
        return bSuccess;
    }

    public void setbSuccess(Integer bSuccess) {
        this.bSuccess = bSuccess;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
