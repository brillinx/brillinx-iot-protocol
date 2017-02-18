package com.brillinx.iot.service.utils;

import java.util.UUID;

/**
 * Created by kaizhao on 10/22/16.
 */
public class GlobalIdGenerator {

    // use UUID
    public static String get()
    {
        return UUID.randomUUID().toString();
    }
}
