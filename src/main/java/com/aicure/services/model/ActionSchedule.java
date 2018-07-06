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
import com.aicure.services.model.MedicationAction;
import com.aicure.services.model.Policy;
import com.aicure.services.model.QuestionnaireAction;
import com.aicure.services.model.Schedule;

/**
 * ActionSchedule details
 **/
public class ActionSchedule {
    /**
     * priority of this action schedule, the highest is 0
     */
    @com.google.gson.annotations.SerializedName("action_priority")
    private Integer actionPriority = null;
    /**
     * policy of this action schedule
     */
    @com.google.gson.annotations.SerializedName("policy")
    private Policy policy = null;
    /**
     * group of this action schedule
     */
    @com.google.gson.annotations.SerializedName("group")
    private String group = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * schedule detail
     */
    @com.google.gson.annotations.SerializedName("schedule")
    private Schedule schedule = null;
    /**
     * created_at, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    /**
     * trial uuid
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * updated_at, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;
    /**
     * questionnaires involved and defines the order of them unless enabled random order, required ONLY if action type == questionnaire and this action schedule is not WASHOUT
     */
    @com.google.gson.annotations.SerializedName("questionnaire_ids")
    private List<String> questionnaireIds = null;
    /**
     * tag of this action schedule
     */
    @com.google.gson.annotations.SerializedName("tag")
    private String tag = null;
    /**
     * action for questionnaires, required ONLY if action type == questionnaire and this action schedule is not WASHOUT
     */
    @com.google.gson.annotations.SerializedName("questionnaire_action")
    private QuestionnaireAction questionnaireAction = null;
    /**
     * action type
     */
    @com.google.gson.annotations.SerializedName("action_type")
    private String actionType = null;
    /**
     * id, not required when create, required when update, universally unique
     */
    @com.google.gson.annotations.SerializedName("action_schedule_id")
    private String actionScheduleId = null;
    /**
     * medication_action, required ONLY if action type == take_medication and this action schedule is not WASHOUT 
     */
    @com.google.gson.annotations.SerializedName("medication_action")
    private MedicationAction medicationAction = null;
    /**
     * medications involved, required ONLY if action type == take_medication and this action schedule is not WASHOUT 
     */
    @com.google.gson.annotations.SerializedName("medication_ids")
    private List<String> medicationIds = null;
    /**
     * user/patient UUID
     */
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;

    /**
     * priority of this action schedule, the highest is 0
     *
     * @return actionPriority
     **/
    public Integer getActionPriority() {
        return actionPriority;
    }

    /**
     * Sets the value of actionPriority.
     *
     * @param actionPriority the new value
     */
    public void setActionPriority(Integer actionPriority) {
        this.actionPriority = actionPriority;
    }

    /**
     * policy of this action schedule
     *
     * @return policy
     **/
    public Policy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of policy.
     *
     * @param policy the new value
     */
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * group of this action schedule
     *
     * @return group
     **/
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of group.
     *
     * @param group the new value
     */
    public void setGroup(String group) {
        this.group = group;
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
     * schedule detail
     *
     * @return schedule
     **/
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of schedule.
     *
     * @param schedule the new value
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * created_at, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
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
     * trial uuid
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
     * updated_at, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
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

    /**
     * questionnaires involved and defines the order of them unless enabled random order, required ONLY if action type == questionnaire and this action schedule is not WASHOUT
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
     * tag of this action schedule
     *
     * @return tag
     **/
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of tag.
     *
     * @param tag the new value
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * action for questionnaires, required ONLY if action type == questionnaire and this action schedule is not WASHOUT
     *
     * @return questionnaireAction
     **/
    public QuestionnaireAction getQuestionnaireAction() {
        return questionnaireAction;
    }

    /**
     * Sets the value of questionnaireAction.
     *
     * @param questionnaireAction the new value
     */
    public void setQuestionnaireAction(QuestionnaireAction questionnaireAction) {
        this.questionnaireAction = questionnaireAction;
    }

    /**
     * action type
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
     * id, not required when create, required when update, universally unique
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
     * medication_action, required ONLY if action type == take_medication and this action schedule is not WASHOUT 
     *
     * @return medicationAction
     **/
    public MedicationAction getMedicationAction() {
        return medicationAction;
    }

    /**
     * Sets the value of medicationAction.
     *
     * @param medicationAction the new value
     */
    public void setMedicationAction(MedicationAction medicationAction) {
        this.medicationAction = medicationAction;
    }

    /**
     * medications involved, required ONLY if action type == take_medication and this action schedule is not WASHOUT 
     *
     * @return medicationIds
     **/
    public List<String> getMedicationIds() {
        return medicationIds;
    }

    /**
     * Sets the value of medicationIds.
     *
     * @param medicationIds the new value
     */
    public void setMedicationIds(List<String> medicationIds) {
        this.medicationIds = medicationIds;
    }

    /**
     * user/patient UUID
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

}
