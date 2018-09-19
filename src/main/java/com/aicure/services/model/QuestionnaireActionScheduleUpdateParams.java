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
import com.aicure.services.model.QuestionnaireScheduleType;
import com.aicure.services.model.ScheduleUpdateParams;

/**
 * QuestionnaireActionScheduleUpdateParams details
 **/
public class QuestionnaireActionScheduleUpdateParams {
    /**
     * type of questionnaire schedule, independent_from_dose/end_treatment
     */
    @com.google.gson.annotations.SerializedName("questionnaire_schedule_type")
    private QuestionnaireScheduleType questionnaireScheduleType = null;
    /**
     * list of questionnaire ids
     */
    @com.google.gson.annotations.SerializedName("questionnaire_ids")
    private List<String> questionnaireIds = null;
    /**
     * list of schedule update params
     */
    @com.google.gson.annotations.SerializedName("schedule_update_params_list")
    private List<ScheduleUpdateParams> scheduleUpdateParamsList = null;

    /**
     * type of questionnaire schedule, independent_from_dose/end_treatment
     *
     * @return questionnaireScheduleType
     **/
    public QuestionnaireScheduleType getQuestionnaireScheduleType() {
        return questionnaireScheduleType;
    }

    /**
     * Sets the value of questionnaireScheduleType.
     *
     * @param questionnaireScheduleType the new value
     */
    public void setQuestionnaireScheduleType(QuestionnaireScheduleType questionnaireScheduleType) {
        this.questionnaireScheduleType = questionnaireScheduleType;
    }

    /**
     * list of questionnaire ids
     *
     * @return questionnaireIds
     **/
    public List<String> getQuestionnaireIds() {
        return questionnaireIds;
    }

    /**
     * Sets the value of questionnaireIds.
     *
     * @param questionnaireIds the new value
     */
    public void setQuestionnaireIds(List<String> questionnaireIds) {
        this.questionnaireIds = questionnaireIds;
    }

    /**
     * list of schedule update params
     *
     * @return scheduleUpdateParamsList
     **/
    public List<ScheduleUpdateParams> getScheduleUpdateParamsList() {
        return scheduleUpdateParamsList;
    }

    /**
     * Sets the value of scheduleUpdateParamsList.
     *
     * @param scheduleUpdateParamsList the new value
     */
    public void setScheduleUpdateParamsList(List<ScheduleUpdateParams> scheduleUpdateParamsList) {
        this.scheduleUpdateParamsList = scheduleUpdateParamsList;
    }

}
