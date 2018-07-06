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

import com.aicure.services.model.RepeatInfo;
import com.aicure.services.model.ScaleAnswerCondition;

/**
 * ScaleRepeatCondition details
 **/
public class ScaleRepeatCondition {
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * condition of repeats, check ScaleAnswerCondition
     */
    @com.google.gson.annotations.SerializedName("condition")
    private ScaleAnswerCondition condition = null;
    /**
     * how to repeat, check RepeatInfo
     */
    @com.google.gson.annotations.SerializedName("repeat_info")
    private RepeatInfo repeatInfo = null;

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
     * condition of repeats, check ScaleAnswerCondition
     *
     * @return condition
     **/
    public ScaleAnswerCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of condition.
     *
     * @param condition the new value
     */
    public void setCondition(ScaleAnswerCondition condition) {
        this.condition = condition;
    }

    /**
     * how to repeat, check RepeatInfo
     *
     * @return repeatInfo
     **/
    public RepeatInfo getRepeatInfo() {
        return repeatInfo;
    }

    /**
     * Sets the value of repeatInfo.
     *
     * @param repeatInfo the new value
     */
    public void setRepeatInfo(RepeatInfo repeatInfo) {
        this.repeatInfo = repeatInfo;
    }

}
