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

import com.aicure.services.model.Layout;
import java.util.*;
import com.aicure.services.model.Policy;
import com.aicure.services.model.Question;
import com.aicure.services.model.TextLanguageSupportUnit;

/**
 * Questionnaire details
 **/
public class Questionnaire {
    /**
     * id, not required when create, required when update
     */
    @com.google.gson.annotations.SerializedName("questionnaire_id")
    private String questionnaireId = null;
    /**
     * trial uuid
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * start_question_id, first question
     */
    @com.google.gson.annotations.SerializedName("start_question_id")
    private String startQuestionId = null;
    /**
     * notes
     */
    @com.google.gson.annotations.SerializedName("notes")
    private List<String> notes = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * tag
     */
    @com.google.gson.annotations.SerializedName("tag")
    private String tag = null;
    /**
     * policy
     */
    @com.google.gson.annotations.SerializedName("policy")
    private Policy policy = null;
    /**
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    /**
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;
    /**
     * name
     */
    @com.google.gson.annotations.SerializedName("name")
    private String name = null;
    /**
     * Layout
     */
    @com.google.gson.annotations.SerializedName("layout")
    private Layout layout = null;
    /**
     * questions
     */
    @com.google.gson.annotations.SerializedName("questions")
    private List<Question> questions = null;
    /**
     * title
     */
    @com.google.gson.annotations.SerializedName("title")
    private TextLanguageSupportUnit title = null;
    /**
     * status
     */
    @com.google.gson.annotations.SerializedName("active_status")
    private String activeStatus = null;
    /**
     * mode
     */
    @com.google.gson.annotations.SerializedName("mode")
    private String mode = null;
    @com.google.gson.annotations.SerializedName("aiqscat")
    private String aiqscat = null;
    /**
     * priority
     */
    @com.google.gson.annotations.SerializedName("priority")
    private Integer priority = null;

    /**
     * id, not required when create, required when update
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
     * start_question_id, first question
     *
     * @return startQuestionId
     **/
    public String getStartQuestionId() {
        return startQuestionId;
    }

    /**
     * Sets the value of startQuestionId.
     *
     * @param startQuestionId the new value
     */
    public void setStartQuestionId(String startQuestionId) {
        this.startQuestionId = startQuestionId;
    }

    /**
     * notes
     *
     * @return notes
     **/
    public List<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of notes.
     *
     * @param notes the new value
     */
    public void setNotes(List<String> notes) {
        this.notes = notes;
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
     * tag
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
     * policy
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
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
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
     * yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
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
     * name
     *
     * @return name
     **/
    public String getName() {
        return name;
    }

    /**
     * Sets the value of name.
     *
     * @param name the new value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Layout
     *
     * @return layout
     **/
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of layout.
     *
     * @param layout the new value
     */
    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    /**
     * questions
     *
     * @return questions
     **/
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * Sets the value of questions.
     *
     * @param questions the new value
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    /**
     * title
     *
     * @return title
     **/
    public TextLanguageSupportUnit getTitle() {
        return title;
    }

    /**
     * Sets the value of title.
     *
     * @param title the new value
     */
    public void setTitle(TextLanguageSupportUnit title) {
        this.title = title;
    }

    /**
     * status
     *
     * @return activeStatus
     **/
    public String getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of activeStatus.
     *
     * @param activeStatus the new value
     */
    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    /**
     * mode
     *
     * @return mode
     **/
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of mode.
     *
     * @param mode the new value
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Gets aiqscat
     *
     * @return aiqscat
     **/
    public String getAiqscat() {
        return aiqscat;
    }

    /**
     * Sets the value of aiqscat.
     *
     * @param aiqscat the new value
     */
    public void setAiqscat(String aiqscat) {
        this.aiqscat = aiqscat;
    }

    /**
     * priority
     *
     * @return priority
     **/
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of priority.
     *
     * @param priority the new value
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

}
