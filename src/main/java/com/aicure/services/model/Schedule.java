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
 * Schedule
 **/
public class Schedule {
    /**
     * window start of first occurrence, yyyy-MM-dd HH:mm:ss
     */
    @com.google.gson.annotations.SerializedName("window_start_first_occurrence")
    private String windowStartFirstOccurrence = null;
    /**
     * window end of first occurrence, yyyy-MM-dd HH:mm:ss
     */
    @com.google.gson.annotations.SerializedName("window_end_first_occurrence")
    private String windowEndFirstOccurrence = null;
    /**
     * window start of last occurrence, must provide either [window_start_last_occurrence, window_end_last_occurrence] or number_of_patterns, if both provided, [window_start_last_occurrence, window_end_last_occurrence] will override number_of_patterns, yyyy-MM-dd HH:mm:ss
     */
    @com.google.gson.annotations.SerializedName("window_start_last_occurrence")
    private String windowStartLastOccurrence = null;
    /**
     * window end of last occurrence, must provide either [window_start_last_occurrence, window_end_last_occurrence] or number_of_patterns, if both provided, [window_start_last_occurrence, window_end_last_occurrence] will override number_of_patterns, yyyy-MM-dd HH:mm:ss
     */
    @com.google.gson.annotations.SerializedName("window_end_last_occurrence")
    private String windowEndLastOccurrence = null;
    /**
     * interval between patterns, must &gt;= 1
     */
    @com.google.gson.annotations.SerializedName("interval")
    private Integer interval = null;
    /**
     * number of patterns, must provide either [window_start_last_occurrence, window_end_last_occurrence] or number_of_patterns, if both provided, [window_start_last_occurrence, window_end_last_occurrence] will override number_of_patterns, [-1 or any integer &gt;= 1]
     */
    @com.google.gson.annotations.SerializedName("number_of_patterns")
    private Integer numberOfPatterns = null;
    /**
     * days of week if repeat weekly, required ONLY if repeat mode is weekly, [SUN : 7, MON : 1, TUE : 2, WED : 3, THU : 4, FRI : 5, SAT : 6]
     */
    @com.google.gson.annotations.SerializedName("days")
    private List<Integer> days = null;
    /**
     * repeat mode
     */
    @com.google.gson.annotations.SerializedName("repeat_mode")
    private String repeatMode = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * iCal, not required, will generate when create/update
     */
    @com.google.gson.annotations.SerializedName("icalendar")
    private String icalendar = null;
    /**
     * enable to check if this schedule has any overlap with other schedules belonged to same user and with same action_type(ActionSchedule.action_type)
     */
    @com.google.gson.annotations.SerializedName("check_overlap_between_schedules")
    private Boolean checkOverlapBetweenSchedules = null;
    /**
     * enable to check overlap between occurrences in this schedule
     */
    @com.google.gson.annotations.SerializedName("check_overlap_between_occurrences_within_schedule")
    private Boolean checkOverlapBetweenOccurrencesWithinSchedule = null;

    /**
     * window start of first occurrence, yyyy-MM-dd HH:mm:ss
     *
     * @return windowStartFirstOccurrence
     **/
    public String getWindowStartFirstOccurrence() {
        return windowStartFirstOccurrence;
    }

    /**
     * Sets the value of windowStartFirstOccurrence.
     *
     * @param windowStartFirstOccurrence the new value
     */
    public void setWindowStartFirstOccurrence(String windowStartFirstOccurrence) {
        this.windowStartFirstOccurrence = windowStartFirstOccurrence;
    }

    /**
     * window end of first occurrence, yyyy-MM-dd HH:mm:ss
     *
     * @return windowEndFirstOccurrence
     **/
    public String getWindowEndFirstOccurrence() {
        return windowEndFirstOccurrence;
    }

    /**
     * Sets the value of windowEndFirstOccurrence.
     *
     * @param windowEndFirstOccurrence the new value
     */
    public void setWindowEndFirstOccurrence(String windowEndFirstOccurrence) {
        this.windowEndFirstOccurrence = windowEndFirstOccurrence;
    }

    /**
     * window start of last occurrence, must provide either [window_start_last_occurrence, window_end_last_occurrence] or number_of_patterns, if both provided, [window_start_last_occurrence, window_end_last_occurrence] will override number_of_patterns, yyyy-MM-dd HH:mm:ss
     *
     * @return windowStartLastOccurrence
     **/
    public String getWindowStartLastOccurrence() {
        return windowStartLastOccurrence;
    }

    /**
     * Sets the value of windowStartLastOccurrence.
     *
     * @param windowStartLastOccurrence the new value
     */
    public void setWindowStartLastOccurrence(String windowStartLastOccurrence) {
        this.windowStartLastOccurrence = windowStartLastOccurrence;
    }

    /**
     * window end of last occurrence, must provide either [window_start_last_occurrence, window_end_last_occurrence] or number_of_patterns, if both provided, [window_start_last_occurrence, window_end_last_occurrence] will override number_of_patterns, yyyy-MM-dd HH:mm:ss
     *
     * @return windowEndLastOccurrence
     **/
    public String getWindowEndLastOccurrence() {
        return windowEndLastOccurrence;
    }

    /**
     * Sets the value of windowEndLastOccurrence.
     *
     * @param windowEndLastOccurrence the new value
     */
    public void setWindowEndLastOccurrence(String windowEndLastOccurrence) {
        this.windowEndLastOccurrence = windowEndLastOccurrence;
    }

    /**
     * interval between patterns, must &gt;= 1
     *
     * @return interval
     **/
    public Integer getInterval() {
        return interval;
    }

    /**
     * Sets the value of interval.
     *
     * @param interval the new value
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * number of patterns, must provide either [window_start_last_occurrence, window_end_last_occurrence] or number_of_patterns, if both provided, [window_start_last_occurrence, window_end_last_occurrence] will override number_of_patterns, [-1 or any integer &gt;= 1]
     *
     * @return numberOfPatterns
     **/
    public Integer getNumberOfPatterns() {
        return numberOfPatterns;
    }

    /**
     * Sets the value of numberOfPatterns.
     *
     * @param numberOfPatterns the new value
     */
    public void setNumberOfPatterns(Integer numberOfPatterns) {
        this.numberOfPatterns = numberOfPatterns;
    }

    /**
     * days of week if repeat weekly, required ONLY if repeat mode is weekly, [SUN : 7, MON : 1, TUE : 2, WED : 3, THU : 4, FRI : 5, SAT : 6]
     *
     * @return days
     **/
    public List<Integer> getDays() {
        return days;
    }

    /**
     * Sets the value of days.
     *
     * @param days the new value
     */
    public void setDays(List<Integer> days) {
        this.days = days;
    }

    /**
     * repeat mode
     *
     * @return repeatMode
     **/
    public String getRepeatMode() {
        return repeatMode;
    }

    /**
     * Sets the value of repeatMode.
     *
     * @param repeatMode the new value
     */
    public void setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
    }

    /**
     * description
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
     * iCal, not required, will generate when create/update
     *
     * @return icalendar
     **/
    public String getIcalendar() {
        return icalendar;
    }

    /**
     * Sets the value of icalendar.
     *
     * @param icalendar the new value
     */
    public void setIcalendar(String icalendar) {
        this.icalendar = icalendar;
    }

    /**
     * enable to check if this schedule has any overlap with other schedules belonged to same user and with same action_type(ActionSchedule.action_type)
     *
     * @return checkOverlapBetweenSchedules
     **/
    public Boolean getCheckOverlapBetweenSchedules() {
        return checkOverlapBetweenSchedules;
    }

    /**
     * Sets the value of checkOverlapBetweenSchedules.
     *
     * @param checkOverlapBetweenSchedules the new value
     */
    public void setCheckOverlapBetweenSchedules(Boolean checkOverlapBetweenSchedules) {
        this.checkOverlapBetweenSchedules = checkOverlapBetweenSchedules;
    }

    /**
     * enable to check overlap between occurrences in this schedule
     *
     * @return checkOverlapBetweenOccurrencesWithinSchedule
     **/
    public Boolean getCheckOverlapBetweenOccurrencesWithinSchedule() {
        return checkOverlapBetweenOccurrencesWithinSchedule;
    }

    /**
     * Sets the value of checkOverlapBetweenOccurrencesWithinSchedule.
     *
     * @param checkOverlapBetweenOccurrencesWithinSchedule the new value
     */
    public void setCheckOverlapBetweenOccurrencesWithinSchedule(Boolean checkOverlapBetweenOccurrencesWithinSchedule) {
        this.checkOverlapBetweenOccurrencesWithinSchedule = checkOverlapBetweenOccurrencesWithinSchedule;
    }

}
