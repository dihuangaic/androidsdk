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

import com.aicure.services.model.ContentUnit;
import java.util.*;
import com.aicure.services.model.TextLanguageSupportUnit;

/**
 * QuestionPage details
 **/
public class QuestionPage {
    /**
     * title
     */
    @com.google.gson.annotations.SerializedName("title")
    private TextLanguageSupportUnit title = null;
    /**
     * notes
     */
    @com.google.gson.annotations.SerializedName("notes")
    private List<TextLanguageSupportUnit> notes = null;
    /**
     * question_ids in this page
     */
    @com.google.gson.annotations.SerializedName("question_ids")
    private List<String> questionIds = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * start question id
     */
    @com.google.gson.annotations.SerializedName("start_question_id")
    private String startQuestionId = null;
    /**
     * title_description
     */
    @com.google.gson.annotations.SerializedName("title_description")
    private ContentUnit titleDescription = null;

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
     * notes
     *
     * @return notes
     **/
    public List<TextLanguageSupportUnit> getNotes() {
        return notes;
    }

    /**
     * Sets the value of notes.
     *
     * @param notes the new value
     */
    public void setNotes(List<TextLanguageSupportUnit> notes) {
        this.notes = notes;
    }

    /**
     * question_ids in this page
     *
     * @return questionIds
     **/
    public List<String> getQuestionIds() {
        return questionIds;
    }

    /**
     * Sets the value of questionIds.
     *
     * @param questionIds the new value
     */
    public void setQuestionIds(List<String> questionIds) {
        this.questionIds = questionIds;
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
     * start question id
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
     * title_description
     *
     * @return titleDescription
     **/
    public ContentUnit getTitleDescription() {
        return titleDescription;
    }

    /**
     * Sets the value of titleDescription.
     *
     * @param titleDescription the new value
     */
    public void setTitleDescription(ContentUnit titleDescription) {
        this.titleDescription = titleDescription;
    }

}
