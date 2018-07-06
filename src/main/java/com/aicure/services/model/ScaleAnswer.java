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
import com.aicure.services.model.ContinuousDataFormat;
import com.aicure.services.model.DiscreteDataFormat;
import java.util.*;
import com.aicure.services.model.ScaleAnswerNextQuestion;
import com.aicure.services.model.ScaleAnswerTriggerAction;
import com.aicure.services.model.ScaleRepeatCondition;
import com.aicure.services.model.TextLanguageSupportUnit;

/**
 * ScaleAnswer details
 **/
public class ScaleAnswer {
    /**
     * start description
     */
    @com.google.gson.annotations.SerializedName("start")
    private ContentUnit start = null;
    /**
     * end description
     */
    @com.google.gson.annotations.SerializedName("end")
    private ContentUnit end = null;
    /**
     * continuous_data_format, either continuous_data_format or discrete_data_format
     */
    @com.google.gson.annotations.SerializedName("continuous_data_format")
    private ContinuousDataFormat continuousDataFormat = null;
    /**
     * discrete_data_format, either continuous_data_format or discrete_data_format
     */
    @com.google.gson.annotations.SerializedName("discrete_data_format")
    private DiscreteDataFormat discreteDataFormat = null;
    /**
     * actions with conditions, check ScaleAnswerTriggerAction
     */
    @com.google.gson.annotations.SerializedName("actions")
    private List<ScaleAnswerTriggerAction> actions = null;
    /**
     * if not match any next question conditions, both of next_question_id_no_match_conditions and next_question_id_with_conditions are null means no more questions after this one
     */
    @com.google.gson.annotations.SerializedName("next_question_id_no_match_conditions")
    private String nextQuestionIdNoMatchConditions = null;
    /**
     * next questions with conditions, check ScaleAnswerNextQuestion, both of next_question_id_no_match_conditions and next_question_id_with_conditions are null means no more questions after this one
     */
    @com.google.gson.annotations.SerializedName("next_question_id_with_conditions")
    private List<ScaleAnswerNextQuestion> nextQuestionIdWithConditions = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * additional information required besides the scale answer
     */
    @com.google.gson.annotations.SerializedName("additional_info_required")
    private AdditionalInfo additionalInfoRequired = null;
    /**
     * repeat with conditions, check ScaleRepeatCondition for how to repeat
     */
    @com.google.gson.annotations.SerializedName("repeats_with_conditions")
    private List<ScaleRepeatCondition> repeatsWithConditions = null;
    /**
     * more text descriptions
     */
    @com.google.gson.annotations.SerializedName("additional_descriptions")
    private List<List<TextLanguageSupportUnit>> additionalDescriptions = null;
    /**
     * For example, if set precision as 4 digits for double then the output of 9.99995 must look as 10.0000
     */
    @com.google.gson.annotations.SerializedName("precision_digits")
    private Integer precisionDigits = null;
    @com.google.gson.annotations.SerializedName("aiqscres")
    private String aiqscres = null;
    @com.google.gson.annotations.SerializedName("aiqsnum")
    private String aiqsnum = null;

    /**
     * start description
     *
     * @return start
     **/
    public ContentUnit getStart() {
        return start;
    }

    /**
     * Sets the value of start.
     *
     * @param start the new value
     */
    public void setStart(ContentUnit start) {
        this.start = start;
    }

    /**
     * end description
     *
     * @return end
     **/
    public ContentUnit getEnd() {
        return end;
    }

    /**
     * Sets the value of end.
     *
     * @param end the new value
     */
    public void setEnd(ContentUnit end) {
        this.end = end;
    }

    /**
     * continuous_data_format, either continuous_data_format or discrete_data_format
     *
     * @return continuousDataFormat
     **/
    public ContinuousDataFormat getContinuousDataFormat() {
        return continuousDataFormat;
    }

    /**
     * Sets the value of continuousDataFormat.
     *
     * @param continuousDataFormat the new value
     */
    public void setContinuousDataFormat(ContinuousDataFormat continuousDataFormat) {
        this.continuousDataFormat = continuousDataFormat;
    }

    /**
     * discrete_data_format, either continuous_data_format or discrete_data_format
     *
     * @return discreteDataFormat
     **/
    public DiscreteDataFormat getDiscreteDataFormat() {
        return discreteDataFormat;
    }

    /**
     * Sets the value of discreteDataFormat.
     *
     * @param discreteDataFormat the new value
     */
    public void setDiscreteDataFormat(DiscreteDataFormat discreteDataFormat) {
        this.discreteDataFormat = discreteDataFormat;
    }

    /**
     * actions with conditions, check ScaleAnswerTriggerAction
     *
     * @return actions
     **/
    public List<ScaleAnswerTriggerAction> getActions() {
        return actions;
    }

    /**
     * Sets the value of actions.
     *
     * @param actions the new value
     */
    public void setActions(List<ScaleAnswerTriggerAction> actions) {
        this.actions = actions;
    }

    /**
     * if not match any next question conditions, both of next_question_id_no_match_conditions and next_question_id_with_conditions are null means no more questions after this one
     *
     * @return nextQuestionIdNoMatchConditions
     **/
    public String getNextQuestionIdNoMatchConditions() {
        return nextQuestionIdNoMatchConditions;
    }

    /**
     * Sets the value of nextQuestionIdNoMatchConditions.
     *
     * @param nextQuestionIdNoMatchConditions the new value
     */
    public void setNextQuestionIdNoMatchConditions(String nextQuestionIdNoMatchConditions) {
        this.nextQuestionIdNoMatchConditions = nextQuestionIdNoMatchConditions;
    }

    /**
     * next questions with conditions, check ScaleAnswerNextQuestion, both of next_question_id_no_match_conditions and next_question_id_with_conditions are null means no more questions after this one
     *
     * @return nextQuestionIdWithConditions
     **/
    public List<ScaleAnswerNextQuestion> getNextQuestionIdWithConditions() {
        return nextQuestionIdWithConditions;
    }

    /**
     * Sets the value of nextQuestionIdWithConditions.
     *
     * @param nextQuestionIdWithConditions the new value
     */
    public void setNextQuestionIdWithConditions(List<ScaleAnswerNextQuestion> nextQuestionIdWithConditions) {
        this.nextQuestionIdWithConditions = nextQuestionIdWithConditions;
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
     * additional information required besides the scale answer
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
     * repeat with conditions, check ScaleRepeatCondition for how to repeat
     *
     * @return repeatsWithConditions
     **/
    public List<ScaleRepeatCondition> getRepeatsWithConditions() {
        return repeatsWithConditions;
    }

    /**
     * Sets the value of repeatsWithConditions.
     *
     * @param repeatsWithConditions the new value
     */
    public void setRepeatsWithConditions(List<ScaleRepeatCondition> repeatsWithConditions) {
        this.repeatsWithConditions = repeatsWithConditions;
    }

    /**
     * more text descriptions
     *
     * @return additionalDescriptions
     **/
    public List<List<TextLanguageSupportUnit>> getAdditionalDescriptions() {
        return additionalDescriptions;
    }

    /**
     * Sets the value of additionalDescriptions.
     *
     * @param additionalDescriptions the new value
     */
    public void setAdditionalDescriptions(List<List<TextLanguageSupportUnit>> additionalDescriptions) {
        this.additionalDescriptions = additionalDescriptions;
    }

    /**
     * For example, if set precision as 4 digits for double then the output of 9.99995 must look as 10.0000
     *
     * @return precisionDigits
     **/
    public Integer getPrecisionDigits() {
        return precisionDigits;
    }

    /**
     * Sets the value of precisionDigits.
     *
     * @param precisionDigits the new value
     */
    public void setPrecisionDigits(Integer precisionDigits) {
        this.precisionDigits = precisionDigits;
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
