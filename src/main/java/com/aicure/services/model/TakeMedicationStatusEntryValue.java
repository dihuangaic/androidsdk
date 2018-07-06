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
 * TakeMedicationStatusEntryValue
 **/
public class TakeMedicationStatusEntryValue {
    @com.google.gson.annotations.SerializedName("start_datetime")
    private String startDatetime = null;
    @com.google.gson.annotations.SerializedName("medication_id")
    private String medicationId = null;
    @com.google.gson.annotations.SerializedName("classification")
    private String classification = null;
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    @com.google.gson.annotations.SerializedName("video_id")
    private String videoId = null;
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;
    @com.google.gson.annotations.SerializedName("created_by")
    private String createdBy = null;
    @com.google.gson.annotations.SerializedName("source")
    private String source = null;
    @com.google.gson.annotations.SerializedName("reason")
    private String reason = null;
    @com.google.gson.annotations.SerializedName("tag")
    private String tag = null;
    @com.google.gson.annotations.SerializedName("end_datetime")
    private String endDatetime = null;
    @com.google.gson.annotations.SerializedName("pill_id")
    private Integer pillId = null;
    @com.google.gson.annotations.SerializedName("updated_by")
    private String updatedBy = null;

    /**
     * Gets startDatetime
     *
     * @return startDatetime
     **/
    public String getStartDatetime() {
        return startDatetime;
    }

    /**
     * Sets the value of startDatetime.
     *
     * @param startDatetime the new value
     */
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Gets medicationId
     *
     * @return medicationId
     **/
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * Sets the value of medicationId.
     *
     * @param medicationId the new value
     */
    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    /**
     * Gets classification
     *
     * @return classification
     **/
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of classification.
     *
     * @param classification the new value
     */
    public void setClassification(String classification) {
        this.classification = classification;
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
     * Gets videoId
     *
     * @return videoId
     **/
    public String getVideoId() {
        return videoId;
    }

    /**
     * Sets the value of videoId.
     *
     * @param videoId the new value
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
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
     * Gets reason
     *
     * @return reason
     **/
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of reason.
     *
     * @param reason the new value
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Gets tag
     *
     * @return tag
     **/
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of tag.
     *
     * @param tag the new value
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Gets endDatetime
     *
     * @return endDatetime
     **/
    public String getEndDatetime() {
        return endDatetime;
    }

    /**
     * Sets the value of endDatetime.
     *
     * @param endDatetime the new value
     */
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Gets pillId
     *
     * @return pillId
     **/
    public Integer getPillId() {
        return pillId;
    }

    /**
     * Sets the value of pillId.
     *
     * @param pillId the new value
     */
    public void setPillId(Integer pillId) {
        this.pillId = pillId;
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

}
