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


/**
 * QuestionnaireInfo details
 **/
public class QuestionnaireInfo {
    /**
     * questionnaire id
     */
    @com.google.gson.annotations.SerializedName("questionnaire_id")
    private String questionnaireId = null;
    /**
     * questionnaire name
     */
    @com.google.gson.annotations.SerializedName("questionnaire_name")
    private String questionnaireName = null;

    /**
     * questionnaire id
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
     * questionnaire name
     *
     * @return questionnaireName
     **/
    public String getQuestionnaireName() {
        return questionnaireName;
    }

    /**
     * Sets the value of questionnaireName.
     *
     * @param questionnaireName the new value
     */
    public void setQuestionnaireName(String questionnaireName) {
        this.questionnaireName = questionnaireName;
    }

}
