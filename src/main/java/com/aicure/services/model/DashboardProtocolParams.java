/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.aicure.services.model;


/**
 * DashboardProtocolParams details
 **/
public class DashboardProtocolParams {
    /**
     * id of the file contains dashboard update params stored at S3
     */
    @com.google.gson.annotations.SerializedName("update_body_file_id")
    private String updateBodyFileId = null;
    /**
     * id of the file contains dashboard rollback params stored at S3
     */
    @com.google.gson.annotations.SerializedName("rollback_body_file_id")
    private String rollbackBodyFileId = null;
    /**
     * endpoint of dashboard update
     */
    @com.google.gson.annotations.SerializedName("dashboard_update_endpoint")
    private String dashboardUpdateEndpoint = null;
    /**
     * endpoint of dashboard rollback
     */
    @com.google.gson.annotations.SerializedName("dashboard_rollback_endpoint")
    private String dashboardRollbackEndpoint = null;
    /**
     * client_url as a key to fetch Dashboard API Token
     */
    @com.google.gson.annotations.SerializedName("client_url")
    private String clientUrl = null;

    /**
     * id of the file contains dashboard update params stored at S3
     *
     * @return updateBodyFileId
     **/
    public String getUpdateBodyFileId() {
        return updateBodyFileId;
    }

    /**
     * Sets the value of updateBodyFileId.
     *
     * @param updateBodyFileId the new value
     */
    public void setUpdateBodyFileId(String updateBodyFileId) {
        this.updateBodyFileId = updateBodyFileId;
    }

    /**
     * id of the file contains dashboard rollback params stored at S3
     *
     * @return rollbackBodyFileId
     **/
    public String getRollbackBodyFileId() {
        return rollbackBodyFileId;
    }

    /**
     * Sets the value of rollbackBodyFileId.
     *
     * @param rollbackBodyFileId the new value
     */
    public void setRollbackBodyFileId(String rollbackBodyFileId) {
        this.rollbackBodyFileId = rollbackBodyFileId;
    }

    /**
     * endpoint of dashboard update
     *
     * @return dashboardUpdateEndpoint
     **/
    public String getDashboardUpdateEndpoint() {
        return dashboardUpdateEndpoint;
    }

    /**
     * Sets the value of dashboardUpdateEndpoint.
     *
     * @param dashboardUpdateEndpoint the new value
     */
    public void setDashboardUpdateEndpoint(String dashboardUpdateEndpoint) {
        this.dashboardUpdateEndpoint = dashboardUpdateEndpoint;
    }

    /**
     * endpoint of dashboard rollback
     *
     * @return dashboardRollbackEndpoint
     **/
    public String getDashboardRollbackEndpoint() {
        return dashboardRollbackEndpoint;
    }

    /**
     * Sets the value of dashboardRollbackEndpoint.
     *
     * @param dashboardRollbackEndpoint the new value
     */
    public void setDashboardRollbackEndpoint(String dashboardRollbackEndpoint) {
        this.dashboardRollbackEndpoint = dashboardRollbackEndpoint;
    }

    /**
     * client_url as a key to fetch Dashboard API Token
     *
     * @return clientUrl
     **/
    public String getClientUrl() {
        return clientUrl;
    }

    /**
     * Sets the value of clientUrl.
     *
     * @param clientUrl the new value
     */
    public void setClientUrl(String clientUrl) {
        this.clientUrl = clientUrl;
    }

}
