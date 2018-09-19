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
import com.aicure.services.model.QuestionnaireActionScheduleUpdateParams;

/**
 * ActionScheduleUpdateParams details
 **/
public class ActionScheduleUpdateParams {
    /**
     * init date time to update action schedule, might be overwrite by earliest_available_date 
     */
    @com.google.gson.annotations.SerializedName("init_update_date_time")
    private String initUpdateDateTime = null;
    /**
     * action schedule update category, can only be one of take_medication and questionnaire
     */
    @com.google.gson.annotations.SerializedName("update_category")
    private ActionScheduleUpdateCategory updateCategory = null;
    /**
     * params for updating questionnaire action schedule, required ONLY when update_category == questionnaire
     */
    @com.google.gson.annotations.SerializedName("questionnaire_action_schedule_update_params")
    private QuestionnaireActionScheduleUpdateParams questionnaireActionScheduleUpdateParams = null;

    /**
     * init date time to update action schedule, might be overwrite by earliest_available_date 
     *
     * @return initUpdateDateTime
     **/
    public String getInitUpdateDateTime() {
        return initUpdateDateTime;
    }

    /**
     * Sets the value of initUpdateDateTime.
     *
     * @param initUpdateDateTime the new value
     */
    public void setInitUpdateDateTime(String initUpdateDateTime) {
        this.initUpdateDateTime = initUpdateDateTime;
    }

    /**
     * action schedule update category, can only be one of take_medication and questionnaire
     *
     * @return updateCategory
     **/
    public ActionScheduleUpdateCategory getUpdateCategory() {
        return updateCategory;
    }

    /**
     * Sets the value of updateCategory.
     *
     * @param updateCategory the new value
     */
    public void setUpdateCategory(ActionScheduleUpdateCategory updateCategory) {
        this.updateCategory = updateCategory;
    }

    /**
     * params for updating questionnaire action schedule, required ONLY when update_category == questionnaire
     *
     * @return questionnaireActionScheduleUpdateParams
     **/
    public QuestionnaireActionScheduleUpdateParams getQuestionnaireActionScheduleUpdateParams() {
        return questionnaireActionScheduleUpdateParams;
    }

    /**
     * Sets the value of questionnaireActionScheduleUpdateParams.
     *
     * @param questionnaireActionScheduleUpdateParams the new value
     */
    public void setQuestionnaireActionScheduleUpdateParams(QuestionnaireActionScheduleUpdateParams questionnaireActionScheduleUpdateParams) {
        this.questionnaireActionScheduleUpdateParams = questionnaireActionScheduleUpdateParams;
    }

}
