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

import com.aicure.services.model.ActionScheduleUpdateCategory;

/**
 * ActionScheduleTerminationParams details
 **/
public class ActionScheduleTerminationParams {
    /**
     * init date to terminate action schedules, might be overwrite by earliest_available_date
     */
    @com.google.gson.annotations.SerializedName("init_date")
    private String initDate = null;
    /**
     * action schedule terminate category, take_medication/questionnaire/all
     */
    @com.google.gson.annotations.SerializedName("category")
    private ActionScheduleUpdateCategory category = null;

    /**
     * init date to terminate action schedules, might be overwrite by earliest_available_date
     *
     * @return initDate
     **/
    public String getInitDate() {
        return initDate;
    }

    /**
     * Sets the value of initDate.
     *
     * @param initDate the new value
     */
    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    /**
     * action schedule terminate category, take_medication/questionnaire/all
     *
     * @return category
     **/
    public ActionScheduleUpdateCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of category.
     *
     * @param category the new value
     */
    public void setCategory(ActionScheduleUpdateCategory category) {
        this.category = category;
    }

}
