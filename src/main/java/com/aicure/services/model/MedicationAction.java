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
import com.aicure.services.model.PillGroup;

/**
 * MedicationAction details
 **/
public class MedicationAction {
    /**
     * if allow random action
     */
    @com.google.gson.annotations.SerializedName("allow_random_action")
    private Boolean allowRandomAction = null;
    /**
     * a group of Pills which follow one specific sequence of steps
     */
    @com.google.gson.annotations.SerializedName("pill_groups")
    private List<PillGroup> pillGroups = null;
    /**
     * Serialized object or any notes for random action
     */
    @com.google.gson.annotations.SerializedName("additional_serialized_random_action")
    private String additionalSerializedRandomAction = null;
    /**
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * Number of Pills for this action
     */
    @com.google.gson.annotations.SerializedName("size")
    private Integer size = null;

    /**
     * if allow random action
     *
     * @return allowRandomAction
     **/
    public Boolean getAllowRandomAction() {
        return allowRandomAction;
    }

    /**
     * Sets the value of allowRandomAction.
     *
     * @param allowRandomAction the new value
     */
    public void setAllowRandomAction(Boolean allowRandomAction) {
        this.allowRandomAction = allowRandomAction;
    }

    /**
     * a group of Pills which follow one specific sequence of steps
     *
     * @return pillGroups
     **/
    public List<PillGroup> getPillGroups() {
        return pillGroups;
    }

    /**
     * Sets the value of pillGroups.
     *
     * @param pillGroups the new value
     */
    public void setPillGroups(List<PillGroup> pillGroups) {
        this.pillGroups = pillGroups;
    }

    /**
     * Serialized object or any notes for random action
     *
     * @return additionalSerializedRandomAction
     **/
    public String getAdditionalSerializedRandomAction() {
        return additionalSerializedRandomAction;
    }

    /**
     * Sets the value of additionalSerializedRandomAction.
     *
     * @param additionalSerializedRandomAction the new value
     */
    public void setAdditionalSerializedRandomAction(String additionalSerializedRandomAction) {
        this.additionalSerializedRandomAction = additionalSerializedRandomAction;
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

    /**
     * Number of Pills for this action
     *
     * @return size
     **/
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of size.
     *
     * @param size the new value
     */
    public void setSize(Integer size) {
        this.size = size;
    }

}
