package com.brillinx.iot.service.restserver.protocol.dataconnection.batch;

import com.brillinx.iot.service.restserver.protocol.IoTRequest;
import com.brillinx.iot.service.restserver.protocol.IoTRequestId;

/**
 * Created by Kai on 2016/7/21.
 */
public class IoTBatchDataConnectionCreateRequest extends IoTRequest {

    private String batchDataConnectionName;
    private String deviceModeId;
    private String uploadFileName;
    private String uploadFileId;
    private String batchDataConnectionComments;

    public IoTBatchDataConnectionCreateRequest() {
        super(IoTRequestId.BatchDataConnectCreateReq_Id);
    }

    public IoTBatchDataConnectionCreateRequest(String batchDataConnectionName, String deviceModeId, String uploadFileName, String uploadFileId, String batchDataConnectionComments) {
        super(IoTRequestId.BatchDataConnectCreateReq_Id);
        this.batchDataConnectionName = batchDataConnectionName;
        this.deviceModeId = deviceModeId;
        this.uploadFileName = uploadFileName;
        this.uploadFileId = uploadFileId;
        this.batchDataConnectionComments = batchDataConnectionComments;
    }

    public String getBatchDataConnectionName() {
        return batchDataConnectionName;
    }

    public void setBatchDataConnectionName(String batchDataConnectionName) {
        this.batchDataConnectionName = batchDataConnectionName;
    }

    public String getBatchDataConnectionComments() {
        return batchDataConnectionComments;
    }

    public void setBatchDataConnectionComments(String batchDataConnectionComments) {
        this.batchDataConnectionComments = batchDataConnectionComments;
    }

    public String getDeviceModeId() {
        return deviceModeId;
    }

    public void setDeviceModeId(String deviceModeId) {
        this.deviceModeId = deviceModeId;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadFileId() {
        return uploadFileId;
    }

    public void setUploadFileId(String uploadFileId) {
        this.uploadFileId = uploadFileId;
    }
}
