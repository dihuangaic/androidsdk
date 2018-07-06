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

/**
 * StepAction details
 **/
public class StepAction {
    /**
     * Name of step
     */
    @com.google.gson.annotations.SerializedName("step")
    private String step = null;
    /**
     * A couple of pills which will be involved in this step
     */
    @com.google.gson.annotations.SerializedName("pills")
    private List<Pill> pills = null;
    /**
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * Name of step
     *
     * @return step
     **/
    public String getStep() {
        return step;
    }

    /**
     * Sets the value of step.
     *
     * @param step the new value
     */
    public void setStep(String step) {
        this.step = step;
    }

    /**
     * A couple of pills which will be involved in this step
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
