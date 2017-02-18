package com.brillinx.iot.service.core.entity.device;

import com.brillinx.iot.service.core.entity.Entity;

/**
 * Created by kaizhao on 12/11/16.
 */
public class DeviceComponent extends Entity{

    // the name of the component
    private String componentName;

    // text description of the component
    private String componentDescription;

    // repair cycle in product manual
    private Integer maintenanceCycleByDay;

    public DeviceComponent(String id, String componentName, String componentDescription, Integer maintenanceCycleByDay) {
        super(id);
        this.componentName = componentName;
        this.componentDescription = componentDescription;
        this.maintenanceCycleByDay = maintenanceCycleByDay;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentDescription() {
        return componentDescription;
    }

    public void setComponentDescription(String componentDescription) {
        this.componentDescription = componentDescription;
    }

    public Integer getMaintenanceCycleByDay() {
        return maintenanceCycleByDay;
    }

    public void setMaintenanceCycleByDay(Integer maintenanceCycleByDay) {
        this.maintenanceCycleByDay = maintenanceCycleByDay;
    }
}
