package com.brillinx.iot.service.core.entity.stats;

import java.util.Vector;

/**
 * Created by kaizhao on 12/4/16.
 */
public class HistoryStoragePerUser {
    private Vector<String[]> data = new Vector<String[]>();

    public HistoryStoragePerUser(Vector<String[]> data) {
        this.data = data;
    }

    public Vector<String[]> getData() {
        return data;
    }

    public void setData(Vector<String[]> data) {
        this.data = data;
    }
}
