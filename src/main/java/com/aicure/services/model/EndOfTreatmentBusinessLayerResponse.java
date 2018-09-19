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

import com.aicure.services.model.ActionSchedule;
import java.util.*;

/**
 * EndOfTreatmentBusinessLayerResponse details
 **/
public class EndOfTreatmentBusinessLayerResponse {
    /**
     * updated_action_schedules
     */
    @com.google.gson.annotations.SerializedName("updated_action_schedules")
    private List<ActionSchedule> updatedActionSchedules = null;

    /**
     * updated_action_schedules
     *
     * @return updatedActionSchedules
     **/
    public List<ActionSchedule> getUpdatedActionSchedules() {
        return updatedActionSchedules;
    }

    /**
     * Sets the value of updatedActionSchedules.
     *
     * @param updatedActionSchedules the new value
     */
    public void setUpdatedActionSchedules(List<ActionSchedule> updatedActionSchedules) {
        this.updatedActionSchedules = updatedActionSchedules;
    }

}
