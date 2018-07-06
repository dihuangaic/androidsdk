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
 * RepeatInfo details
 **/
public class RepeatInfo {
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * max_repeats, null means unlimited
     */
    @com.google.gson.annotations.SerializedName("max_repeats")
    private Integer maxRepeats = null;
    /**
     * allow_repeat_out_time_window
     */
    @com.google.gson.annotations.SerializedName("allow_repeat_out_time_window")
    private Boolean allowRepeatOutTimeWindow = null;
    /**
     * seconds_before_next_repeat
     */
    @com.google.gson.annotations.SerializedName("seconds_before_next_repeat")
    private Integer secondsBeforeNextRepeat = null;

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
     * max_repeats, null means unlimited
     *
     * @return maxRepeats
     **/
    public Integer getMaxRepeats() {
        return maxRepeats;
    }

    /**
     * Sets the value of maxRepeats.
     *
     * @param maxRepeats the new value
     */
    public void setMaxRepeats(Integer maxRepeats) {
        this.maxRepeats = maxRepeats;
    }

    /**
     * allow_repeat_out_time_window
     *
     * @return allowRepeatOutTimeWindow
     **/
    public Boolean getAllowRepeatOutTimeWindow() {
        return allowRepeatOutTimeWindow;
    }

    /**
     * Sets the value of allowRepeatOutTimeWindow.
     *
     * @param allowRepeatOutTimeWindow the new value
     */
    public void setAllowRepeatOutTimeWindow(Boolean allowRepeatOutTimeWindow) {
        this.allowRepeatOutTimeWindow = allowRepeatOutTimeWindow;
    }

    /**
     * seconds_before_next_repeat
     *
     * @return secondsBeforeNextRepeat
     **/
    public Integer getSecondsBeforeNextRepeat() {
        return secondsBeforeNextRepeat;
    }

    /**
     * Sets the value of secondsBeforeNextRepeat.
     *
     * @param secondsBeforeNextRepeat the new value
     */
    public void setSecondsBeforeNextRepeat(Integer secondsBeforeNextRepeat) {
        this.secondsBeforeNextRepeat = secondsBeforeNextRepeat;
    }

}
