package com.brillinx.iot.service.core.entity.dataconnection.batch;

import com.brillinx.iot.service.core.entity.Entity;

/**`
 * Created by Kai on 2016/7/14.
 */
public class BatchDataConnection extends Entity {

    public static String DataConnectFileUploadSuccess = "upload sucess";
    public static String DataConnectFileUploadFailed = "upload failed";
    public static String DataConnectFileParseSuccess = "parse success";
    public static String DataConnectFileParseFailed = "parse failed";
    public static String DataConnectionErrorStatus = "error";
    public static String DataConnectionSuccessStatus = "success";

    private String batchDataConnectionName;
    private String deviceModelId;
    private String uploadFileName;
    private String uploadFileId;
    private Long uploadDate;
    private String batchDataConnectionComments;
    private String status;

    // how many data points are imported into persistent storage
    private Integer importDataPointCount;


    public BatchDataConnection(String id, String batchDataConnectionName, String deviceModelId, String uploadFileName, String uploadFileId,Long uploadDate, String batchDataConnectionComments, String status, Integer importDataPointCount) {
        super(id);
        this.batchDataConnectionName = batchDataConnectionName;
        this.deviceModelId = deviceModelId;
        this.uploadFileName = uploadFileName;
        this.uploadFileId = uploadFileId;
        this.uploadDate = uploadDate;
        this.batchDataConnectionComments = batchDataConnectionComments;
        this.status = status;
        this.importDataPointCount = importDataPointCount;
    }

    public String getBatchDataConnectionName() {
        return batchDataConnectionName;
    }

    public void setBatchDataConnectionName(String batchDataConnectionName) {
        this.batchDataConnectionName = batchDataConnectionName;
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
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

    public String getBatchDataConnectionComments() {
        return batchDataConnectionComments;
    }

    public void setBatchDataConnectionComments(String batchDataConnectionComments) {
        this.batchDataConnectionComments = batchDataConnectionComments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Long uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Integer getImportDataPointCount() {
        return importDataPointCount;
    }

    public void setImportDataPointCount(Integer importDataPointCount) {
        this.importDataPointCount = importDataPointCount;
    }
}
