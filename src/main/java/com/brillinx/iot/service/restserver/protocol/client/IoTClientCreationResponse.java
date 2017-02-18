package com.brillinx.iot.service.restserver.protocol.client;

import com.brillinx.iot.service.core.entity.client.ClientInfo;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 2/5/17.
 */
public class IoTClientCreationResponse extends IoTResponse {

    private ClientInfo clientInfo;

    public IoTClientCreationResponse(ClientInfo clientInfo) {
        super(IoTResponseId.ClientCreateResponse_Id);
        this.clientInfo = clientInfo;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }
}
