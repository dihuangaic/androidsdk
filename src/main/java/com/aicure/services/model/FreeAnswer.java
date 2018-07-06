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

import com.aicure.services.model.RepeatInfo;

/**
 * FreeAnswer details
 **/
public class FreeAnswer {
    /**
     * next_question_id_answered, if null no next question after answer this one, questionnaire ends here
     */
    @com.google.gson.annotations.SerializedName("next_question_id_answered")
    private String nextQuestionIdAnswered = null;
    /**
     * next_question_id_not_answered, if null means no next question if choose not to answer this question, questionnaire ends here
     */
    @com.google.gson.annotations.SerializedName("next_question_id_not_answered")
    private String nextQuestionIdNotAnswered = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * repeat if not answered
     */
    @com.google.gson.annotations.SerializedName("repeat_not_answered")
    private RepeatInfo repeatNotAnswered = null;
    /**
     * action_if_not_answered
     */
    @com.google.gson.annotations.SerializedName("action_if_not_answered")
    private String actionIfNotAnswered = null;
    @com.google.gson.annotations.SerializedName("aiqscres")
    private String aiqscres = null;
    @com.google.gson.annotations.SerializedName("aiqsnum")
    private String aiqsnum = null;

    /**
     * next_question_id_answered, if null no next question after answer this one, questionnaire ends here
     *
     * @return nextQuestionIdAnswered
     **/
    public String getNextQuestionIdAnswered() {
        return nextQuestionIdAnswered;
    }

    /**
     * Sets the value of nextQuestionIdAnswered.
     *
     * @param nextQuestionIdAnswered the new value
     */
    public void setNextQuestionIdAnswered(String nextQuestionIdAnswered) {
        this.nextQuestionIdAnswered = nextQuestionIdAnswered;
    }

    /**
     * next_question_id_not_answered, if null means no next question if choose not to answer this question, questionnaire ends here
     *
     * @return nextQuestionIdNotAnswered
     **/
    public String getNextQuestionIdNotAnswered() {
        return nextQuestionIdNotAnswered;
    }

    /**
     * Sets the value of nextQuestionIdNotAnswered.
     *
     * @param nextQuestionIdNotAnswered the new value
     */
    public void setNextQuestionIdNotAnswered(String nextQuestionIdNotAnswered) {
        this.nextQuestionIdNotAnswered = nextQuestionIdNotAnswered;
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
     * repeat if not answered
     *
     * @return repeatNotAnswered
     **/
    public RepeatInfo getRepeatNotAnswered() {
        return repeatNotAnswered;
    }

    /**
     * Sets the value of repeatNotAnswered.
     *
     * @param repeatNotAnswered the new value
     */
    public void setRepeatNotAnswered(RepeatInfo repeatNotAnswered) {
        this.repeatNotAnswered = repeatNotAnswered;
    }

    /**
     * action_if_not_answered
     *
     * @return actionIfNotAnswered
     **/
    public String getActionIfNotAnswered() {
        return actionIfNotAnswered;
    }

    /**
     * Sets the value of actionIfNotAnswered.
     *
     * @param actionIfNotAnswered the new value
     */
    public void setActionIfNotAnswered(String actionIfNotAnswered) {
        this.actionIfNotAnswered = actionIfNotAnswered;
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
