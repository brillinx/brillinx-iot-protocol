package com.brillinx.iot.service.restserver.protocol;

/**
 * Created by Kai on 2016/7/12.
 */
public class IoTRequestId {

    public static Integer UserLoginReq_Id = 1;

    // user
    public static Integer UserCreationReq_Id = 2;
    public static Integer UserGetReq_Id = 3;
    public static Integer UserDeleteReq_Id = 4;

    // device model
    public static Integer UserModelCreationReq_Id = 11;
    public static Integer UserModelGetSetReq_Id = 12;
    public static Integer UserModelGetReq_Id = 13;
    public static Integer UserModelUpdateReq_Id = 14;
    public static Integer UserModelDeleteReq_Id = 15;

    // batch data connection
    public static Integer BatchDataConnectCreateReq_Id = 21;
    public static Integer BatchDataConnectGetSetReq_Id = 22;
    public static Integer BatchDataConnectGetReq_Id = 23;
    public static Integer BatchDataConnectUpdateReq_Id = 24;
    public static Integer BatchDataConnectDeleteReq_Id = 25;
    public static Integer BatchDataConnectProgressReq_Id = 26;


    // realtime data connection
    public static Integer RealtimeDataConnectCreateReq_Id = 31;
    public static Integer RealtimeDataConnectGetSetReq_Id = 32;
    public static Integer RealtimeDataConnectGetReq_Id = 33;
    public static Integer RealtimeDataConnectUpdateReq_Id = 34;
    public static Integer RealtimeDataConnectDeleteReq_Id = 35;
    public static Integer RealtimeDataConnectProgressReq_Id = 36;

    // realtime data connection info
    public static Integer RealtimeDataConnectInfoGetReq_Id = 41;

    // deivce
    public static Integer DeviceCreateReq_Id = 51;
    public static Integer DeviceGetSetReq_Id = 52;
    public static Integer DeviceGetReq_Id = 53;
    public static Integer DeviceUpdateReq_Id = 54;
    public static Integer DeviceDeleteReq_Id = 55;
    public static Integer DeviceTrackingReq_Id = 56;


    // statistics
    public static Integer ResourceUsagePerUserReq_Id = 100;


    // history summary
    // for historical storage usage summary
    public static Integer HistoryStoragePerUserRequest_Id = 200;

    // the device deployment map
    public static Integer DeviceDeploymentMapPerUserRequest_Id = 201;


    // the device performance
    public static Integer DevicePerformanceGetRequest_Id = 202;


    // the device performance for certain component's measurement
    public static Integer DevicePerformanceComponentMeasurementGetRequest_Id = 203;


    // device event: warnning
    public static Integer DeviceWarningGetReq_Id = 310;
    public static Integer DeviceWarningSetGetReq_Id = 311;

    // client
    public static Integer ClientCreateReq_Id = 400;
    public static Integer ClientGetReq_Id = 401;
    public static Integer ClientDeleteReq_Id = 402;

    // organization
    public static Integer OrgCreateReq_Id = 500;
    public static Integer OrgGetReq_Id = 501;
    public static Integer OrgDeleteReq_Id = 502;

    // space
    public static Integer SpaceCreateReq_Id = 600;
    public static Integer SpaceGetReq_Id = 601;
    public static Integer SpaceDeleteReq_Id = 602;



}
