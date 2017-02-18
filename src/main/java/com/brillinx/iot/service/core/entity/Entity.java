package com.brillinx.iot.service.core.entity;

/**
 * Created by Kai on 2016/7/14.
 */
public class Entity {
    private String id;

    public Entity(){
    }

    public Entity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
