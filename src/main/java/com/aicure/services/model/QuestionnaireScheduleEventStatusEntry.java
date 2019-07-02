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
import com.aicure.services.model.QuestionnaireDetails;
import com.aicure.services.model.ScheduleEventTargetDateStatus;

/**
 * QuestionnaireScheduleEventStatusEntry details
 **/
public class QuestionnaireScheduleEventStatusEntry {
    /**
     * action schedule id
     */
    @com.google.gson.annotations.SerializedName("action_schedule_id")
    private String actionScheduleId = null;
    /**
     * action schedule type
     */
    @com.google.gson.annotations.SerializedName("action_type")
    private String actionType = null;
    /**
     * action schedule tag
     */
    @com.google.gson.annotations.SerializedName("action_schedule_tag")
    private String actionScheduleTag = null;
    /**
     * status of target dates
     */
    @com.google.gson.annotations.SerializedName("target_date_status_list")
    private List<ScheduleEventTargetDateStatus> targetDateStatusList = null;
    /**
     * questionnaire details
     */
    @com.google.gson.annotations.SerializedName("questionnaire_details")
    private List<QuestionnaireDetails> questionnaireDetails = null;

    /**
     * action schedule id
     *
     * @return actionScheduleId
     **/
    public String getActionScheduleId() {
        return actionScheduleId;
    }

    /**
     * Sets the value of actionScheduleId.
     *
     * @param actionScheduleId the new value
     */
    public void setActionScheduleId(String actionScheduleId) {
        this.actionScheduleId = actionScheduleId;
    }

    /**
     * action schedule type
     *
     * @return actionType
     **/
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of actionType.
     *
     * @param actionType the new value
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * action schedule tag
     *
     * @return actionScheduleTag
     **/
    public String getActionScheduleTag() {
        return actionScheduleTag;
    }

    /**
     * Sets the value of actionScheduleTag.
     *
     * @param actionScheduleTag the new value
     */
    public void setActionScheduleTag(String actionScheduleTag) {
        this.actionScheduleTag = actionScheduleTag;
    }

    /**
     * status of target dates
     *
     * @return targetDateStatusList
     **/
    public List<ScheduleEventTargetDateStatus> getTargetDateStatusList() {
        return targetDateStatusList;
    }

    /**
     * Sets the value of targetDateStatusList.
     *
     * @param targetDateStatusList the new value
     */
    public void setTargetDateStatusList(List<ScheduleEventTargetDateStatus> targetDateStatusList) {
        this.targetDateStatusList = targetDateStatusList;
    }

    /**
     * questionnaire details
     *
     * @return questionnaireDetails
     **/
    public List<QuestionnaireDetails> getQuestionnaireDetails() {
        return questionnaireDetails;
    }

    /**
     * Sets the value of questionnaireDetails.
     *
     * @param questionnaireDetails the new value
     */
    public void setQuestionnaireDetails(List<QuestionnaireDetails> questionnaireDetails) {
        this.questionnaireDetails = questionnaireDetails;
    }

}
