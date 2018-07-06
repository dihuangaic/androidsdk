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


public class CompletedActionSchedule {
    @com.google.gson.annotations.SerializedName("schedule_window_start")
    private String scheduleWindowStart = null;
    @com.google.gson.annotations.SerializedName("schedule_window_end")
    private String scheduleWindowEnd = null;
    /**
     * whether or not the patient completed the action schedule
     */
    @com.google.gson.annotations.SerializedName("completed")
    private Boolean completed = null;

    /**
     * Gets scheduleWindowStart
     *
     * @return scheduleWindowStart
     **/
    public String getScheduleWindowStart() {
        return scheduleWindowStart;
    }

    /**
     * Sets the value of scheduleWindowStart.
     *
     * @param scheduleWindowStart the new value
     */
    public void setScheduleWindowStart(String scheduleWindowStart) {
        this.scheduleWindowStart = scheduleWindowStart;
    }

    /**
     * Gets scheduleWindowEnd
     *
     * @return scheduleWindowEnd
     **/
    public String getScheduleWindowEnd() {
        return scheduleWindowEnd;
    }

    /**
     * Sets the value of scheduleWindowEnd.
     *
     * @param scheduleWindowEnd the new value
     */
    public void setScheduleWindowEnd(String scheduleWindowEnd) {
        this.scheduleWindowEnd = scheduleWindowEnd;
    }

    /**
     * whether or not the patient completed the action schedule
     *
     * @return completed
     **/
    public Boolean getCompleted() {
        return completed;
    }

    /**
     * Sets the value of completed.
     *
     * @param completed the new value
     */
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

}
