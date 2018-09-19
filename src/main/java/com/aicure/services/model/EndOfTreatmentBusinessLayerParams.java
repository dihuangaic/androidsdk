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

/**
 * EndOfTreatmentBusinessLayerParams details
 **/
public class EndOfTreatmentBusinessLayerParams {
    /**
     * trial
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * user
     */
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;
    /**
     * user time zone
     */
    @com.google.gson.annotations.SerializedName("tzid")
    private String tzid = null;
    /**
     * end of treatment date time, &#39;yyyy-MM-dd&#39;
     */
    @com.google.gson.annotations.SerializedName("local_end_of_treatment_date")
    private String localEndOfTreatmentDate = null;
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
     * trial
     *
     * @return trial
     **/
    public String getTrial() {
        return trial;
    }

    /**
     * Sets the value of trial.
     *
     * @param trial the new value
     */
    public void setTrial(String trial) {
        this.trial = trial;
    }

    /**
     * user
     *
     * @return user
     **/
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of user.
     *
     * @param user the new value
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * user time zone
     *
     * @return tzid
     **/
    public String getTzid() {
        return tzid;
    }

    /**
     * Sets the value of tzid.
     *
     * @param tzid the new value
     */
    public void setTzid(String tzid) {
        this.tzid = tzid;
    }

    /**
     * end of treatment date time, &#39;yyyy-MM-dd&#39;
     *
     * @return localEndOfTreatmentDate
     **/
    public String getLocalEndOfTreatmentDate() {
        return localEndOfTreatmentDate;
    }

    /**
     * Sets the value of localEndOfTreatmentDate.
     *
     * @param localEndOfTreatmentDate the new value
     */
    public void setLocalEndOfTreatmentDate(String localEndOfTreatmentDate) {
        this.localEndOfTreatmentDate = localEndOfTreatmentDate;
    }

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

}
