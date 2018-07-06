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

import com.aicure.services.model.ScaleAnswerCondition;

/**
 * ScaleAnswerTriggerAction details
 **/
public class ScaleAnswerTriggerAction {
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * condition of post action, check ScaleAnswerCondition
     */
    @com.google.gson.annotations.SerializedName("condition")
    private ScaleAnswerCondition condition = null;
    /**
     * trigger_action_type
     */
    @com.google.gson.annotations.SerializedName("trigger_action_type")
    private String triggerActionType = null;

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
     * condition of post action, check ScaleAnswerCondition
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
     * trigger_action_type
     *
     * @return triggerActionType
     **/
    public String getTriggerActionType() {
        return triggerActionType;
    }

    /**
     * Sets the value of triggerActionType.
     *
     * @param triggerActionType the new value
     */
    public void setTriggerActionType(String triggerActionType) {
        this.triggerActionType = triggerActionType;
    }

}
