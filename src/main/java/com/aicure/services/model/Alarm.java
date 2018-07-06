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

/**
 * Alarm details
 **/
public class Alarm {
    /**
     * action schedule id
     */
    @com.google.gson.annotations.SerializedName("action_schedule_id")
    private String actionScheduleId = null;
    /**
     * alarm offsets by minutes from start of time window
     */
    @com.google.gson.annotations.SerializedName("alarm_offsets")
    private List<Integer> alarmOffsets = null;
    /**
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * tag
     */
    @com.google.gson.annotations.SerializedName("tag")
    private String tag = null;
    /**
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    /**
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;

    /**
     * action schedule id
     *
     * @return actionScheduleId
     **/
    public String getActionScheduleId() {
        return actionScheduleId;
    }

    /**
     * Sets the value of actionScheduleId.
     *
     * @param actionScheduleId the new value
     */
    public void setActionScheduleId(String actionScheduleId) {
        this.actionScheduleId = actionScheduleId;
    }

    /**
     * alarm offsets by minutes from start of time window
     *
     * @return alarmOffsets
     **/
    public List<Integer> getAlarmOffsets() {
        return alarmOffsets;
    }

    /**
     * Sets the value of alarmOffsets.
     *
     * @param alarmOffsets the new value
     */
    public void setAlarmOffsets(List<Integer> alarmOffsets) {
        this.alarmOffsets = alarmOffsets;
    }

    /**
     * Serialized object or any notes
     *
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of description.
     *
     * @param description the new value
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * tag
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
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
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
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
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
