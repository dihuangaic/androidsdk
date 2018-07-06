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

import com.aicure.services.model.AdditionalInfo;
import com.aicure.services.model.ContentUnit;
import com.aicure.services.model.RepeatInfo;

/**
 * OptionAnswer details
 **/
public class OptionAnswer {
    /**
     * option details
     */
    @com.google.gson.annotations.SerializedName("answer")
    private ContentUnit answer = null;
    /**
     * any additional information other than the option
     */
    @com.google.gson.annotations.SerializedName("additional_info_required")
    private AdditionalInfo additionalInfoRequired = null;
    /**
     * next question, if null no next question when choose this option, questionnaire ends here
     */
    @com.google.gson.annotations.SerializedName("next_question_id")
    private String nextQuestionId = null;
    /**
     * this option will trigger an action with type trigger_action_type
     */
    @com.google.gson.annotations.SerializedName("trigger_action_type")
    private String triggerActionType = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * how to repeat if choose this option
     */
    @com.google.gson.annotations.SerializedName("repeat_info")
    private RepeatInfo repeatInfo = null;
    @com.google.gson.annotations.SerializedName("aiqscres")
    private String aiqscres = null;
    @com.google.gson.annotations.SerializedName("aiqsnum")
    private String aiqsnum = null;

    /**
     * option details
     *
     * @return answer
     **/
    public ContentUnit getAnswer() {
        return answer;
    }

    /**
     * Sets the value of answer.
     *
     * @param answer the new value
     */
    public void setAnswer(ContentUnit answer) {
        this.answer = answer;
    }

    /**
     * any additional information other than the option
     *
     * @return additionalInfoRequired
     **/
    public AdditionalInfo getAdditionalInfoRequired() {
        return additionalInfoRequired;
    }

    /**
     * Sets the value of additionalInfoRequired.
     *
     * @param additionalInfoRequired the new value
     */
    public void setAdditionalInfoRequired(AdditionalInfo additionalInfoRequired) {
        this.additionalInfoRequired = additionalInfoRequired;
    }

    /**
     * next question, if null no next question when choose this option, questionnaire ends here
     *
     * @return nextQuestionId
     **/
    public String getNextQuestionId() {
        return nextQuestionId;
    }

    /**
     * Sets the value of nextQuestionId.
     *
     * @param nextQuestionId the new value
     */
    public void setNextQuestionId(String nextQuestionId) {
        this.nextQuestionId = nextQuestionId;
    }

    /**
     * this option will trigger an action with type trigger_action_type
     *
     * @return triggerActionType
     **/
    public String getTriggerActionType() {
        return triggerActionType;
    }

    /**
     * Sets the value of triggerActionType.
     *
     * @param triggerActionType the new value
     */
    public void setTriggerActionType(String triggerActionType) {
        this.triggerActionType = triggerActionType;
    }

    /**
     * description
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
     * how to repeat if choose this option
     *
     * @return repeatInfo
     **/
    public RepeatInfo getRepeatInfo() {
        return repeatInfo;
    }

    /**
     * Sets the value of repeatInfo.
     *
     * @param repeatInfo the new value
     */
    public void setRepeatInfo(RepeatInfo repeatInfo) {
        this.repeatInfo = repeatInfo;
    }

    /**
     * Gets aiqscres
     *
     * @return aiqscres
     **/
    public String getAiqscres() {
        return aiqscres;
    }

    /**
     * Sets the value of aiqscres.
     *
     * @param aiqscres the new value
     */
    public void setAiqscres(String aiqscres) {
        this.aiqscres = aiqscres;
    }

    /**
     * Gets aiqsnum
     *
     * @return aiqsnum
     **/
    public String getAiqsnum() {
        return aiqsnum;
    }

    /**
     * Sets the value of aiqsnum.
     *
     * @param aiqsnum the new value
     */
    public void setAiqsnum(String aiqsnum) {
        this.aiqsnum = aiqsnum;
    }

}
