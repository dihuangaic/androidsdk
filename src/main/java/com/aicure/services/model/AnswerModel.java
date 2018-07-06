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

import com.aicure.services.model.AnswerDisplay;
import com.aicure.services.model.FreeAnswer;
import java.util.*;
import com.aicure.services.model.OptionAnswer;
import com.aicure.services.model.ScaleAnswer;

/**
 * AnswerModel details
 **/
public class AnswerModel {
    /**
     * answer_displays, how to display answer options/format
     */
    @com.google.gson.annotations.SerializedName("answer_displays")
    private List<AnswerDisplay> answerDisplays = null;
    /**
     * allow_multiple_answers
     */
    @com.google.gson.annotations.SerializedName("allow_multiple_answers")
    private Boolean allowMultipleAnswers = null;
    /**
     * option_answers
     */
    @com.google.gson.annotations.SerializedName("option_answers")
    private List<OptionAnswer> optionAnswers = null;
    /**
     * scale_answer
     */
    @com.google.gson.annotations.SerializedName("scale_answer")
    private ScaleAnswer scaleAnswer = null;
    /**
     * free_answer
     */
    @com.google.gson.annotations.SerializedName("free_answer")
    private FreeAnswer freeAnswer = null;
    /**
     * allow_override_aiq_tags_data_export
     */
    @com.google.gson.annotations.SerializedName("allow_override_aiq_tags_data_export")
    private Boolean allowOverrideAiqTagsDataExport = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * answer_displays, how to display answer options/format
     *
     * @return answerDisplays
     **/
    public List<AnswerDisplay> getAnswerDisplays() {
        return answerDisplays;
    }

    /**
     * Sets the value of answerDisplays.
     *
     * @param answerDisplays the new value
     */
    public void setAnswerDisplays(List<AnswerDisplay> answerDisplays) {
        this.answerDisplays = answerDisplays;
    }

    /**
     * allow_multiple_answers
     *
     * @return allowMultipleAnswers
     **/
    public Boolean getAllowMultipleAnswers() {
        return allowMultipleAnswers;
    }

    /**
     * Sets the value of allowMultipleAnswers.
     *
     * @param allowMultipleAnswers the new value
     */
    public void setAllowMultipleAnswers(Boolean allowMultipleAnswers) {
        this.allowMultipleAnswers = allowMultipleAnswers;
    }

    /**
     * option_answers
     *
     * @return optionAnswers
     **/
    public List<OptionAnswer> getOptionAnswers() {
        return optionAnswers;
    }

    /**
     * Sets the value of optionAnswers.
     *
     * @param optionAnswers the new value
     */
    public void setOptionAnswers(List<OptionAnswer> optionAnswers) {
        this.optionAnswers = optionAnswers;
    }

    /**
     * scale_answer
     *
     * @return scaleAnswer
     **/
    public ScaleAnswer getScaleAnswer() {
        return scaleAnswer;
    }

    /**
     * Sets the value of scaleAnswer.
     *
     * @param scaleAnswer the new value
     */
    public void setScaleAnswer(ScaleAnswer scaleAnswer) {
        this.scaleAnswer = scaleAnswer;
    }

    /**
     * free_answer
     *
     * @return freeAnswer
     **/
    public FreeAnswer getFreeAnswer() {
        return freeAnswer;
    }

    /**
     * Sets the value of freeAnswer.
     *
     * @param freeAnswer the new value
     */
    public void setFreeAnswer(FreeAnswer freeAnswer) {
        this.freeAnswer = freeAnswer;
    }

    /**
     * allow_override_aiq_tags_data_export
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

}
