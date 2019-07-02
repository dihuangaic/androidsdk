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
import com.aicure.services.model.QuestionnaireScheduleEventStatusEntry;

/**
 * ScheduleEventStatus details
 **/
public class ScheduleEventStatus {
    /**
     * trial id
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * patient id
     */
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;
    /**
     * status for each action schedule
     */
    @com.google.gson.annotations.SerializedName("entries")
    private List<QuestionnaireScheduleEventStatusEntry> entries = null;

    /**
     * trial id
     *
     * @return trial
     **/
    public String getTrial() {
        return trial;
    }

    /**
     * Sets the value of trial.
     *
     * @param trial the new value
     */
    public void setTrial(String trial) {
        this.trial = trial;
    }

    /**
     * patient id
     *
     * @return user
     **/
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of user.
     *
     * @param user the new value
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * status for each action schedule
     *
     * @return entries
     **/
    public List<QuestionnaireScheduleEventStatusEntry> getEntries() {
        return entries;
    }

    /**
     * Sets the value of entries.
     *
     * @param entries the new value
     */
    public void setEntries(List<QuestionnaireScheduleEventStatusEntry> entries) {
        this.entries = entries;
    }

}
