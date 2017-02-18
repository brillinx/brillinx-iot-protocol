package com.brillinx.iot.service.core.entity.stats;

import java.util.Vector;

/**
 * Created by kaizhao on 12/10/16.
 * to support http://echarts.baidu.com/echarts2/doc/example/map15.html
 *
 data : (function(){
 var data = [];
 var len = 3000;
 var geoCoord
 while(len--) {
 geoCoord = placeList[len % placeList.length].geoCoord;
 data.push({
 name : placeList[len % placeList.length].name + len,
 value : 10,
 geoCoord : [
 geoCoord[0] + Math.random() * 5 - 2.5,
 geoCoord[1] + Math.random() * 3 - 1.5
 ]
 })
 }
 return data;
 })()
 */
public class DeviceDeploymentMapPerUser {

    private Vector<DeviceDeploymentMapEntryPerUser> data;

    public DeviceDeploymentMapPerUser(Vector<DeviceDeploymentMapEntryPerUser> data) {
        this.data = data;
    }

    public Vector<DeviceDeploymentMapEntryPerUser> getData() {
        return data;
    }

    public void setData(Vector<DeviceDeploymentMapEntryPerUser> data) {
        this.data = data;
    }
}


