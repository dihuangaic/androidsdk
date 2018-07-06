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
import com.aicure.services.model.Pill;
import com.aicure.services.model.StepAction;

/**
 * PillGroup details
 **/
public class PillGroup {
    /**
     * A sequence of step actions
     */
    @com.google.gson.annotations.SerializedName("action_sequence")
    private List<StepAction> actionSequence = null;
    /**
     * A couple of pills in this pill group which follow one specific sequence of steps
     */
    @com.google.gson.annotations.SerializedName("pills")
    private List<Pill> pills = null;
    /**
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * A sequence of step actions
     *
     * @return actionSequence
     **/
    public List<StepAction> getActionSequence() {
        return actionSequence;
    }

    /**
     * Sets the value of actionSequence.
     *
     * @param actionSequence the new value
     */
    public void setActionSequence(List<StepAction> actionSequence) {
        this.actionSequence = actionSequence;
    }

    /**
     * A couple of pills in this pill group which follow one specific sequence of steps
     *
     * @return pills
     **/
    public List<Pill> getPills() {
        return pills;
    }

    /**
     * Sets the value of pills.
     *
     * @param pills the new value
     */
    public void setPills(List<Pill> pills) {
        this.pills = pills;
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

}
