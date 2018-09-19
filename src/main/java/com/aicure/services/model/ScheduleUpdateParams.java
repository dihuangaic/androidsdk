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
 * ScheduleUpdateParams details
 **/
public class ScheduleUpdateParams {
    /**
     * start date
     */
    @com.google.gson.annotations.SerializedName("start_date")
    private String startDate = null;
    /**
     * end date
     */
    @com.google.gson.annotations.SerializedName("end_date")
    private String endDate = null;
    /**
     * days of the window crosses, 0 if window is not crossing days
     */
    @com.google.gson.annotations.SerializedName("crossing_days")
    private Integer crossingDays = null;

    /**
     * start date
     *
     * @return startDate
     **/
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of startDate.
     *
     * @param startDate the new value
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * end date
     *
     * @return endDate
     **/
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of endDate.
     *
     * @param endDate the new value
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * days of the window crosses, 0 if window is not crossing days
     *
     * @return crossingDays
     **/
    public Integer getCrossingDays() {
        return crossingDays;
    }

    /**
     * Sets the value of crossingDays.
     *
     * @param crossingDays the new value
     */
    public void setCrossingDays(Integer crossingDays) {
        this.crossingDays = crossingDays;
    }

}
