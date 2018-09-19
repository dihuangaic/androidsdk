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

import com.aicure.services.model.ActionScheduleParams;
import com.aicure.services.model.DashboardProtocolParams;
import com.aicure.services.model.ParamResourceStatusType;

/**
 * ProtocolParams details
 **/
public class ProtocolParams {
    /**
     * trial
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * user
     */
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;
    /**
     * audit_trail_id
     */
    @com.google.gson.annotations.SerializedName("audit_trail_id")
    private String auditTrailId = null;
    /**
     * user time zone
     */
    @com.google.gson.annotations.SerializedName("tzid")
    private String tzid = null;
    /**
     * params for dashboard protocol update/rollback
     */
    @com.google.gson.annotations.SerializedName("dashboard_protocol_params")
    private DashboardProtocolParams dashboardProtocolParams = null;
    /**
     * params for action schedule terminate/update
     */
    @com.google.gson.annotations.SerializedName("action_schedule_params")
    private ActionScheduleParams actionScheduleParams = null;
    /**
     * status of ParamResource
     */
    @com.google.gson.annotations.SerializedName("status")
    private ParamResourceStatusType status = null;
    /**
     * create time of this ProtocolParams
     */
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    /**
     * update time of this ProtocolParams
     */
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;

    /**
     * trial
     *
     * @return trial
     **/
    public String getTrial() {
        return trial;
    }

    /**
     * Sets the value of trial.
     *
     * @param trial the new value
     */
    public void setTrial(String trial) {
        this.trial = trial;
    }

    /**
     * user
     *
     * @return user
     **/
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of user.
     *
     * @param user the new value
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * audit_trail_id
     *
     * @return auditTrailId
     **/
    public String getAuditTrailId() {
        return auditTrailId;
    }

    /**
     * Sets the value of auditTrailId.
     *
     * @param auditTrailId the new value
     */
    public void setAuditTrailId(String auditTrailId) {
        this.auditTrailId = auditTrailId;
    }

    /**
     * user time zone
     *
     * @return tzid
     **/
    public String getTzid() {
        return tzid;
    }

    /**
     * Sets the value of tzid.
     *
     * @param tzid the new value
     */
    public void setTzid(String tzid) {
        this.tzid = tzid;
    }

    /**
     * params for dashboard protocol update/rollback
     *
     * @return dashboardProtocolParams
     **/
    public DashboardProtocolParams getDashboardProtocolParams() {
        return dashboardProtocolParams;
    }

    /**
     * Sets the value of dashboardProtocolParams.
     *
     * @param dashboardProtocolParams the new value
     */
    public void setDashboardProtocolParams(DashboardProtocolParams dashboardProtocolParams) {
        this.dashboardProtocolParams = dashboardProtocolParams;
    }

    /**
     * params for action schedule terminate/update
     *
     * @return actionScheduleParams
     **/
    public ActionScheduleParams getActionScheduleParams() {
        return actionScheduleParams;
    }

    /**
     * Sets the value of actionScheduleParams.
     *
     * @param actionScheduleParams the new value
     */
    public void setActionScheduleParams(ActionScheduleParams actionScheduleParams) {
        this.actionScheduleParams = actionScheduleParams;
    }

    /**
     * status of ParamResource
     *
     * @return status
     **/
    public ParamResourceStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of status.
     *
     * @param status the new value
     */
    public void setStatus(ParamResourceStatusType status) {
        this.status = status;
    }

    /**
     * create time of this ProtocolParams
     *
     * @return createdAt
     **/
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of createdAt.
     *
     * @param createdAt the new value
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * update time of this ProtocolParams
     *
     * @return updatedAt
     **/
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of updatedAt.
     *
     * @param updatedAt the new value
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
