package com.brillinx.iot.service.restserver.protocol.space;

import com.brillinx.iot.service.core.entity.user.Space;
import com.brillinx.iot.service.restserver.protocol.IoTResponse;
import com.brillinx.iot.service.restserver.protocol.IoTResponseId;

/**
 * Created by kaizhao on 2/11/17.
 */
public class IoTSpaceGetResponse extends IoTResponse{

    private Space space;


    public IoTSpaceGetResponse(Space space) {
        super(IoTResponseId.SpaceGetResponse_Id);
        this.space = space;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
}
