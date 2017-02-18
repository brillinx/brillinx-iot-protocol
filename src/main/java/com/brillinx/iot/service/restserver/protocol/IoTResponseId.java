package com.brillinx.iot.service.restserver.protocol;

/**
 * Created by Kai on 2016/7/12.
 */
public class IoTResponseId {

    public static Integer UserLoginResp_Id = 10000;

    // user
    public static Integer UserCreationResp_Id = 10001;
    public static Integer UserGetResp_Id = 10002;
    public static Integer UserDeleteResp_Id = 10003;

    // device model
    public static Integer UserModelCreationResp_Id = 10011;
    public static Integer UserModelGetSetResp_Id = 10012;
    public static Integer UserModelGetResp_Id = 10013;
    public static Integer UserModelUpdateResp_Id = 10014;
    public static Integer UserModelDeleteResp_Id = 10015;

    // batch data connection
    public static Integer BatchDataConnectCreateResponse_Id = 10021;
    public static Integer BatchDataConnectGetSetResponse_Id = 10022;
    public static Integer BatchDataConnectGetResponse_Id = 10023;
    public static Integer BatchDataConnectUpdateResponse_Id = 10024;
    public static Integer BatchDataConnectDeleteResponse_Id = 10025;
    public static Integer BatchDataConnectProgressResponse_Id = 10026;

    // realtime data connection
    public static Integer RealtimeDataConnectCreateResponse_Id = 10031;
    public static Integer RealtimeDataConnectGetSetResponse_Id = 10032;
    public static Integer RealtimeDataConnectGetResponse_Id = 10033;
    public static Integer RealtimeDataConnectUpdateResponse_Id = 10034;
    public static Integer RealtimeDataConnectDeleteResponse_Id = 10035;
    public static Integer RealtimeDataConnectProgressResponse_Id = 10036;

    // realtime data connection info
    public static Integer RealtimeDataConnectInfoGetResponse_Id = 10041;

    // deivce
    public static Integer DeviceCreateResponse_Id = 10051;
    public static Integer DeviceGetSetResponse_Id = 10052;
    public static Integer DeviceGetResponse_Id = 10053;
    public static Integer DeviceUpdateResponse_Id = 10054;
    public static Integer DeviceDeleteResponse_Id = 10055;
    public static Integer DeviceTrackingResponse_Id = 10056;

    // statistics
    public static Integer ResourceUsagePerUserResponse_Id = 10100;


    // history summary
    // for historical storage usage summary
    public static Integer HistoryStoragePerUserResponse_Id = 10200;

    // the device deployment map
    public static Integer DeviceDeploymentMapPerUserResponse_Id = 10201;

    // the device performance
    public static Integer DevicePerformanceGetResponse_Id = 10202;


    // the device performance for certain component's measurement
    public static Integer DevicePerformanceComponentMeasurementGetResponse_Id = 10203;


    // device event: warnning
    public static Integer DeviceWarningGetResponse_Id = 10310;
    public static Integer DeviceWarningSetGetResponse_Id = 10311;


    // client
    public static Integer ClientCreateResponse_Id = 10400;
    public static Integer ClientGetResponse_Id = 10401;
    public static Integer ClientDeleteResponse_Id = 10402;

    // organization
    public static Integer OrgCreateResponse_Id = 10500;
    public static Integer OrgGetResponse_Id = 10501;
    public static Integer OrgDeleteResponse_Id = 10502;

    // space
    public static Integer SpaceCreateResponse_Id = 10600;
    public static Integer SpaceGetResponse_Id = 10601;
    public static Integer SpaceDeleteResponse_Id = 10602;


}
