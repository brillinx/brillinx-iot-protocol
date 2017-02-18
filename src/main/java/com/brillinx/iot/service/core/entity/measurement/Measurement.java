package com.brillinx.iot.service.core.entity.measurement;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 12/18/16.
 *
 * The Measurement is used to measure all kind of machine or device's status.
 */
public class Measurement extends Entity{

    private String measurementName;
    private String measurementCategory;

    private String measurementDescription;

    private Integer createdTime;

    public Measurement(String id, String measurementName, String measurementCategory, String measurementDescription, Integer createdTime) {
        super(id);
        this.measurementName = measurementName;
        this.measurementCategory = measurementCategory;
        this.measurementDescription = measurementDescription;
        this.createdTime = createdTime;
    }

    public String getMeasurementName() {
        return measurementName;
    }

    public void setMeasurementName(String measurementName) {
        this.measurementName = measurementName;
    }

    public String getMeasurementCategory() {
        return measurementCategory;
    }

    public void setMeasurementCategory(String measurementCategory) {
        this.measurementCategory = measurementCategory;
    }

    public String getMeasurementDescription() {
        return measurementDescription;
    }

    public void setMeasurementDescription(String measurementDescription) {
        this.measurementDescription = measurementDescription;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }
}
