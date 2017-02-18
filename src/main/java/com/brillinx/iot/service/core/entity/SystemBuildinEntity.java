package com.brillinx.iot.service.core.entity;

import com.brillinx.iot.service.core.entity.user.Organization;
import com.brillinx.iot.service.core.entity.user.Space;
import com.brillinx.iot.service.core.entity.user.User;

/**
 * Created by kaizhao on 7/17/16.
 */
public class SystemBuildinEntity {

    // following two are system build-in organizations before system installations

    public static Organization OrganizationAdminBuildin
            = new Organization("iot_system_org_admin","client_admin_id","Admin Organization","This is the system built organziation for admin",1);

    public static Organization OrganizationSystemBuildin
            = new Organization("iot_system_org_system","client_admin_id","System Organization","This is the system built organziation for system",2);


    // following two are system build-in spaces before system installations

    public static Space SpaceAdminBuildin
            = new Space("iot_system_space_admin","iot_system_org_admin","Admin Space","This is the system built space for admin",1);

    public static Space SpaceSystemBuildin
            = new Space("iot_system_space_system","iot_system_org_system","System Space","This is the system built space for system",2);


    //
    public static User UserAdminBuildin
            = new User("iot_user_admin","iot_system_org_admin","iot_system_space_admin","admin","admin@brillinx.com","epass",1);


}
