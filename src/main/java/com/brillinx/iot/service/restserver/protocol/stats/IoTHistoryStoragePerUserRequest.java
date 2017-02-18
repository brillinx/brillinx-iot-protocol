package com.brillinx.iot.service.restserver.protocol.stats;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

import java.util.Vector;

/**
 * Created by kaizhao on 12/4/16.
 * to support http://www.highcharts.com/demo/line-time-series
 * with data:
 * ([
 [Date.UTC(2013,5,2),0.7695],
 [Date.UTC(2013,5,3),0.7648],
 [Date.UTC(2013,5,4),0.7645],
 [Date.UTC(2013,5,5),0.7638],
 [Date.UTC(2013,5,6),0.7549],
 [Date.UTC(2013,5,7),0.7562],
 [Date.UTC(2013,5,9),0.7574],
 [Date.UTC(2013,5,10),0.7543],
 [Date.UTC(2013,5,11),0.7510],
 [Date.UTC(2013,5,12),0.7498]}
 */
public class IoTHistoryStoragePerUserRequest extends IoTRequest{

    public IoTHistoryStoragePerUserRequest() {
        super(IoTRequestId.HistoryStoragePerUserRequest_Id);
    }
}
