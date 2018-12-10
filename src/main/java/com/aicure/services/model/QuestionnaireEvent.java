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

import java.util.*;
import com.aicure.services.model.Policy;
import com.aicure.services.model.QuestionnaireStatus;
import com.aicure.services.model.ReclassifiedStatusTakeMedicationStatus;

public class QuestionnaireEvent {
    @com.google.gson.annotations.SerializedName("trial_id")
    private String trialId = null;
    @com.google.gson.annotations.SerializedName("patient_id")
    private String patientId = null;
    @com.google.gson.annotations.SerializedName("target_date")
    private String targetDate = null;
    @com.google.gson.annotations.SerializedName("site_id")
    private String siteId = null;
    @com.google.gson.annotations.SerializedName("source")
    private String source = null;
    @com.google.gson.annotations.SerializedName("schedule_id")
    private String scheduleId = null;
    @com.google.gson.annotations.SerializedName("dose_id")
    private String doseId = null;
    @com.google.gson.annotations.SerializedName("language")
    private String language = null;
    @com.google.gson.annotations.SerializedName("action_type")
    private String actionType = null;
    /**
     * event_type
     */
    @com.google.gson.annotations.SerializedName("event_type")
    private String eventType = null;
    @com.google.gson.annotations.SerializedName("tzid")
    private String tzid = null;
    @com.google.gson.annotations.SerializedName("tags")
    private List<String> tags = null;
    @com.google.gson.annotations.SerializedName("policy")
    private Policy policy = null;
    @com.google.gson.annotations.SerializedName("status")
    private QuestionnaireStatus status = null;
    @com.google.gson.annotations.SerializedName("reclassifications")
    private List<ReclassifiedStatusTakeMedicationStatus> reclassifications = null;
    @com.google.gson.annotations.SerializedName("created_by")
    private String createdBy = null;
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    @com.google.gson.annotations.SerializedName("updated_by")
    private String updatedBy = null;
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;

    /**
     * Gets trialId
     *
     * @return trialId
     **/
    public String getTrialId() {
        return trialId;
    }

    /**
     * Sets the value of trialId.
     *
     * @param trialId the new value
     */
    public void setTrialId(String trialId) {
        this.trialId = trialId;
    }

    /**
     * Gets patientId
     *
     * @return patientId
     **/
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of patientId.
     *
     * @param patientId the new value
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * Gets targetDate
     *
     * @return targetDate
     **/
    public String getTargetDate() {
        return targetDate;
    }

    /**
     * Sets the value of targetDate.
     *
     * @param targetDate the new value
     */
    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    /**
     * Gets siteId
     *
     * @return siteId
     **/
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of siteId.
     *
     * @param siteId the new value
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets source
     *
     * @return source
     **/
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of source.
     *
     * @param source the new value
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Gets scheduleId
     *
     * @return scheduleId
     **/
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of scheduleId.
     *
     * @param scheduleId the new value
     */
    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * Gets doseId
     *
     * @return doseId
     **/
    public String getDoseId() {
        return doseId;
    }

    /**
     * Sets the value of doseId.
     *
     * @param doseId the new value
     */
    public void setDoseId(String doseId) {
        this.doseId = doseId;
    }

    /**
     * Gets language
     *
     * @return language
     **/
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of language.
     *
     * @param language the new value
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Gets actionType
     *
     * @return actionType
     **/
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of actionType.
     *
     * @param actionType the new value
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * event_type
     *
     * @return eventType
     **/
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of eventType.
     *
     * @param eventType the new value
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * Gets tzid
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
     * Gets tags
     *
     * @return tags
     **/
    public List<String> getTags() {
        return tags;
    }

    /**
     * Sets the value of tags.
     *
     * @param tags the new value
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Gets policy
     *
     * @return policy
     **/
    public Policy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of policy.
     *
     * @param policy the new value
     */
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * Gets status
     *
     * @return status
     **/
    public QuestionnaireStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of status.
     *
     * @param status the new value
     */
    public void setStatus(QuestionnaireStatus status) {
        this.status = status;
    }

    /**
     * Gets reclassifications
     *
     * @return reclassifications
     **/
    public List<ReclassifiedStatusTakeMedicationStatus> getReclassifications() {
        return reclassifications;
    }

    /**
     * Sets the value of reclassifications.
     *
     * @param reclassifications the new value
     */
    public void setReclassifications(List<ReclassifiedStatusTakeMedicationStatus> reclassifications) {
        this.reclassifications = reclassifications;
    }

    /**
     * Gets createdBy
     *
     * @return createdBy
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of createdBy.
     *
     * @param createdBy the new value
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets createdAt
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
     * Gets updatedBy
     *
     * @return updatedBy
     **/
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of updatedBy.
     *
     * @param updatedBy the new value
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * Gets updatedAt
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
