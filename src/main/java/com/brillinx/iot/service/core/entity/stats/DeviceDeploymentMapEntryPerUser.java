package com.brillinx.iot.service.core.entity.stats;

/**
 * Created by kaizhao on 12/10/16.
 * to support http://echarts.baidu.com/echarts2/doc/example/map15.html
 */
public class DeviceDeploymentMapEntryPerUser {

    private String name;
    private Float value;
    private Float[] geoCoord;

    public DeviceDeploymentMapEntryPerUser(String name, Float value, Float[] geoCoord) {
        this.name = name;
        this.value = value;
        this.geoCoord = geoCoord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Float[] getGeoCoord() {
        return geoCoord;
    }

    public void setGeoCoord(Float[] geoCoord) {
        this.geoCoord = geoCoord;
    }
}
