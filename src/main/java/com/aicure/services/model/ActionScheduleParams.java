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

import com.aicure.services.model.ActionScheduleTerminationParams;
import com.aicure.services.model.ActionScheduleUpdateParams;

/**
 * ActionScheduleParams details
 **/
public class ActionScheduleParams {
    /**
     * params for action schedule terminate
     */
    @com.google.gson.annotations.SerializedName("termination_params")
    private ActionScheduleTerminationParams terminationParams = null;
    /**
     * params for action schedule update
     */
    @com.google.gson.annotations.SerializedName("update_params")
    private ActionScheduleUpdateParams updateParams = null;

    /**
     * params for action schedule terminate
     *
     * @return terminationParams
     **/
    public ActionScheduleTerminationParams getTerminationParams() {
        return terminationParams;
    }

    /**
     * Sets the value of terminationParams.
     *
     * @param terminationParams the new value
     */
    public void setTerminationParams(ActionScheduleTerminationParams terminationParams) {
        this.terminationParams = terminationParams;
    }

    /**
     * params for action schedule update
     *
     * @return updateParams
     **/
    public ActionScheduleUpdateParams getUpdateParams() {
        return updateParams;
    }

    /**
     * Sets the value of updateParams.
     *
     * @param updateParams the new value
     */
    public void setUpdateParams(ActionScheduleUpdateParams updateParams) {
        this.updateParams = updateParams;
    }

}
