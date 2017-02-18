package com.brillinx.iot.service.core.entity.devicemodel;

import com.brillinx.iot.service.core.entity.Entity;

import java.util.Vector;

/**
 * Created by Kai on 2016/7/14.
 */
public class DeviceModelPropertyValueRange extends Entity {

    public static String ContinousValueRangeType = "CVR";
    public static String DiscreteValueRangeType = "DVR";

    private String valueRangeType;
    private Vector<String> discreteValues = new Vector<String>();
    private float minValue;
    private float maxValue;


    public DeviceModelPropertyValueRange(String id, Vector<String> discreteValues) {
        super(id);
        this.valueRangeType = DiscreteValueRangeType;
        this.discreteValues = discreteValues;
    }

    public DeviceModelPropertyValueRange(String id, float minValue, float maxValue) {
        super(id);
        this.valueRangeType = ContinousValueRangeType;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public DeviceModelPropertyValueRange(String id) {
        super(id);
    }

    public String getValueRangeType() {
        return valueRangeType;
    }

    public void setValueRangeType(String valueRangeType) {
        this.valueRangeType = valueRangeType;
    }

    public Vector<String> getDiscreteValues() {
        return discreteValues;
    }

    public void setDiscreteValues(Vector<String> discreteValues) {
        this.discreteValues = discreteValues;
    }

    public float getMinValue() {
        return minValue;
    }

    public void setMinValue(float minValue) {
        this.minValue = minValue;
    }

    public float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }
}
