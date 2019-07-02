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
 * SegmentQuestionnaireActionScheduleUpdate details
 **/
public class SegmentQuestionnaireActionScheduleUpdate {
    /**
     * current_segment_qnn_ids
     */
    @com.google.gson.annotations.SerializedName("current_segment_qnn_ids")
    private List<String> currentSegmentQnnIds = null;
    /**
     * init_current_segment_end_datetime
     */
    @com.google.gson.annotations.SerializedName("init_current_segment_end_datetime")
    private String initCurrentSegmentEndDatetime = null;
    /**
     * init_next_segment_start_datetime
     */
    @com.google.gson.annotations.SerializedName("init_next_segment_start_datetime")
    private String initNextSegmentStartDatetime = null;
    /**
     * next_segment_qnn_ids
     */
    @com.google.gson.annotations.SerializedName("next_segment_qnn_ids")
    private List<String> nextSegmentQnnIds = null;
    /**
     * init_next_segment_end_date
     */
    @com.google.gson.annotations.SerializedName("init_next_segment_end_date")
    private String initNextSegmentEndDate = null;
    /**
     * tzid
     */
    @com.google.gson.annotations.SerializedName("tzid")
    private String tzid = null;

    /**
     * current_segment_qnn_ids
     *
     * @return currentSegmentQnnIds
     **/
    public List<String> getCurrentSegmentQnnIds() {
        return currentSegmentQnnIds;
    }

    /**
     * Sets the value of currentSegmentQnnIds.
     *
     * @param currentSegmentQnnIds the new value
     */
    public void setCurrentSegmentQnnIds(List<String> currentSegmentQnnIds) {
        this.currentSegmentQnnIds = currentSegmentQnnIds;
    }

    /**
     * init_current_segment_end_datetime
     *
     * @return initCurrentSegmentEndDatetime
     **/
    public String getInitCurrentSegmentEndDatetime() {
        return initCurrentSegmentEndDatetime;
    }

    /**
     * Sets the value of initCurrentSegmentEndDatetime.
     *
     * @param initCurrentSegmentEndDatetime the new value
     */
    public void setInitCurrentSegmentEndDatetime(String initCurrentSegmentEndDatetime) {
        this.initCurrentSegmentEndDatetime = initCurrentSegmentEndDatetime;
    }

    /**
     * init_next_segment_start_datetime
     *
     * @return initNextSegmentStartDatetime
     **/
    public String getInitNextSegmentStartDatetime() {
        return initNextSegmentStartDatetime;
    }

    /**
     * Sets the value of initNextSegmentStartDatetime.
     *
     * @param initNextSegmentStartDatetime the new value
     */
    public void setInitNextSegmentStartDatetime(String initNextSegmentStartDatetime) {
        this.initNextSegmentStartDatetime = initNextSegmentStartDatetime;
    }

    /**
     * next_segment_qnn_ids
     *
     * @return nextSegmentQnnIds
     **/
    public List<String> getNextSegmentQnnIds() {
        return nextSegmentQnnIds;
    }

    /**
     * Sets the value of nextSegmentQnnIds.
     *
     * @param nextSegmentQnnIds the new value
     */
    public void setNextSegmentQnnIds(List<String> nextSegmentQnnIds) {
        this.nextSegmentQnnIds = nextSegmentQnnIds;
    }

    /**
     * init_next_segment_end_date
     *
     * @return initNextSegmentEndDate
     **/
    public String getInitNextSegmentEndDate() {
        return initNextSegmentEndDate;
    }

    /**
     * Sets the value of initNextSegmentEndDate.
     *
     * @param initNextSegmentEndDate the new value
     */
    public void setInitNextSegmentEndDate(String initNextSegmentEndDate) {
        this.initNextSegmentEndDate = initNextSegmentEndDate;
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
