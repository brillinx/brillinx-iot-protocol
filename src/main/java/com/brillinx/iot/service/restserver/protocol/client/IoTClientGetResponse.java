package com.brillinx.iot.service.restserver.protocol.client;

import com.brillinx.iot.service.core.entity.client.ClientInfo;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 2/5/17.
 */
public class IoTClientGetResponse extends IoTResponse{

    private ClientInfo clientInfo;

    public IoTClientGetResponse(ClientInfo clientInfo) {
        super(IoTResponseId.ClientGetResponse_Id);
        this.clientInfo = clientInfo;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }
}
