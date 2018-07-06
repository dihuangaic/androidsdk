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

import com.aicure.services.model.AnswerModel;
import com.aicure.services.model.ContentUnit;

/**
 * Question details
 **/
public class Question {
    /**
     * question_id, pre defined, used to define the order of questions to be asked
     */
    @com.google.gson.annotations.SerializedName("question_id")
    private String questionId = null;
    /**
     * actual question, check ContentUnit
     */
    @com.google.gson.annotations.SerializedName("question")
    private ContentUnit question = null;
    /**
     * answer_model, check AnswerModel
     */
    @com.google.gson.annotations.SerializedName("answer_model")
    private AnswerModel answerModel = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * allow_override_aiq_tags_data_export flag
     */
    @com.google.gson.annotations.SerializedName("allow_override_aiq_tags_data_export")
    private Boolean allowOverrideAiqTagsDataExport = null;
    /**
     * secondary_note
     */
    @com.google.gson.annotations.SerializedName("secondary_note")
    private ContentUnit secondaryNote = null;
    @com.google.gson.annotations.SerializedName("aiqstscd")
    private String aiqstscd = null;

    /**
     * question_id, pre defined, used to define the order of questions to be asked
     *
     * @return questionId
     **/
    public String getQuestionId() {
        return questionId;
    }

    /**
     * Sets the value of questionId.
     *
     * @param questionId the new value
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * actual question, check ContentUnit
     *
     * @return question
     **/
    public ContentUnit getQuestion() {
        return question;
    }

    /**
     * Sets the value of question.
     *
     * @param question the new value
     */
    public void setQuestion(ContentUnit question) {
        this.question = question;
    }

    /**
     * answer_model, check AnswerModel
     *
     * @return answerModel
     **/
    public AnswerModel getAnswerModel() {
        return answerModel;
    }

    /**
     * Sets the value of answerModel.
     *
     * @param answerModel the new value
     */
    public void setAnswerModel(AnswerModel answerModel) {
        this.answerModel = answerModel;
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
     * allow_override_aiq_tags_data_export flag
     *
     * @return allowOverrideAiqTagsDataExport
     **/
    public Boolean getAllowOverrideAiqTagsDataExport() {
        return allowOverrideAiqTagsDataExport;
    }

    /**
     * Sets the value of allowOverrideAiqTagsDataExport.
     *
     * @param allowOverrideAiqTagsDataExport the new value
     */
    public void setAllowOverrideAiqTagsDataExport(Boolean allowOverrideAiqTagsDataExport) {
        this.allowOverrideAiqTagsDataExport = allowOverrideAiqTagsDataExport;
    }

    /**
     * secondary_note
     *
     * @return secondaryNote
     **/
    public ContentUnit getSecondaryNote() {
        return secondaryNote;
    }

    /**
     * Sets the value of secondaryNote.
     *
     * @param secondaryNote the new value
     */
    public void setSecondaryNote(ContentUnit secondaryNote) {
        this.secondaryNote = secondaryNote;
    }

    /**
     * Gets aiqstscd
     *
     * @return aiqstscd
     **/
    public String getAiqstscd() {
        return aiqstscd;
    }

    /**
     * Sets the value of aiqstscd.
     *
     * @param aiqstscd the new value
     */
    public void setAiqstscd(String aiqstscd) {
        this.aiqstscd = aiqstscd;
    }

}
