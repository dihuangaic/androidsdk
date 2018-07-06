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
import com.aicure.services.model.QuestionnaireStatusAnswer;

/**
 * QuestionnaireStatusEntryValue
 **/
public class QuestionnaireStatusEntryValue {
    @com.google.gson.annotations.SerializedName("questionnaire_id")
    private String questionnaireId = null;
    @com.google.gson.annotations.SerializedName("question_key")
    private String questionKey = null;
    @com.google.gson.annotations.SerializedName("answers")
    private List<QuestionnaireStatusAnswer> answers = null;
    @com.google.gson.annotations.SerializedName("source")
    private String source = null;
    @com.google.gson.annotations.SerializedName("created_by")
    private String createdBy = null;
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    @com.google.gson.annotations.SerializedName("updated_by")
    private String updatedBy = null;
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;

    /**
     * Gets questionnaireId
     *
     * @return questionnaireId
     **/
    public String getQuestionnaireId() {
        return questionnaireId;
    }

    /**
     * Sets the value of questionnaireId.
     *
     * @param questionnaireId the new value
     */
    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    /**
     * Gets questionKey
     *
     * @return questionKey
     **/
    public String getQuestionKey() {
        return questionKey;
    }

    /**
     * Sets the value of questionKey.
     *
     * @param questionKey the new value
     */
    public void setQuestionKey(String questionKey) {
        this.questionKey = questionKey;
    }

    /**
     * Gets answers
     *
     * @return answers
     **/
    public List<QuestionnaireStatusAnswer> getAnswers() {
        return answers;
    }

    /**
     * Sets the value of answers.
     *
     * @param answers the new value
     */
    public void setAnswers(List<QuestionnaireStatusAnswer> answers) {
        this.answers = answers;
    }

    /**
     * Gets source
     *
     * @return source
     **/
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of source.
     *
     * @param source the new value
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Gets createdBy
     *
     * @return createdBy
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of createdBy.
     *
     * @param createdBy the new value
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets createdAt
     *
     * @return createdAt
     **/
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of createdAt.
     *
     * @param createdAt the new value
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets updatedBy
     *
     * @return updatedBy
     **/
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of updatedBy.
     *
     * @param updatedBy the new value
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * Gets updatedAt
     *
     * @return updatedAt
     **/
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of updatedAt.
     *
     * @param updatedAt the new value
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
