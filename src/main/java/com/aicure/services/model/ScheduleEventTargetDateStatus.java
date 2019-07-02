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

import java.util.Date;

public class ScheduleEventTargetDateStatus {
    /**
     * target date to take action schedule
     */
    @com.google.gson.annotations.SerializedName("target_date")
    private String targetDate = null;
    /**
     * schedule status, based on event_statuses
     */
    @com.google.gson.annotations.SerializedName("event_status")
    private String eventStatus = null;
    /**
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;, only REQUIRED when event_status == complete
     */
    @com.google.gson.annotations.SerializedName("complete_at")
    private Date completeAt = null;
    /**
     * tzid
     */
    @com.google.gson.annotations.SerializedName("tzid")
    private String tzid = null;

    /**
     * target date to take action schedule
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
     * schedule status, based on event_statuses
     *
     * @return eventStatus
     **/
    public String getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of eventStatus.
     *
     * @param eventStatus the new value
     */
    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;, only REQUIRED when event_status == complete
     *
     * @return completeAt
     **/
    public Date getCompleteAt() {
        return completeAt;
    }

    /**
     * Sets the value of completeAt.
     *
     * @param completeAt the new value
     */
    public void setCompleteAt(Date completeAt) {
        this.completeAt = completeAt;
    }

    /**
     * tzid
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

}
