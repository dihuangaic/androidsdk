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
 * QuestionnaireStatusAnswer
 **/
public class QuestionnaireStatusAnswer {
    @com.google.gson.annotations.SerializedName("answer_key")
    private String answerKey = null;
    @com.google.gson.annotations.SerializedName("blobfile_uri")
    private String blobfileUri = null;
    @com.google.gson.annotations.SerializedName("freeform_text")
    private String freeformText = null;

    /**
     * Gets answerKey
     *
     * @return answerKey
     **/
    public String getAnswerKey() {
        return answerKey;
    }

    /**
     * Sets the value of answerKey.
     *
     * @param answerKey the new value
     */
    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }

    /**
     * Gets blobfileUri
     *
     * @return blobfileUri
     **/
    public String getBlobfileUri() {
        return blobfileUri;
    }

    /**
     * Sets the value of blobfileUri.
     *
     * @param blobfileUri the new value
     */
    public void setBlobfileUri(String blobfileUri) {
        this.blobfileUri = blobfileUri;
    }

    /**
     * Gets freeformText
     *
     * @return freeformText
     **/
    public String getFreeformText() {
        return freeformText;
    }

    /**
     * Sets the value of freeformText.
     *
     * @param freeformText the new value
     */
    public void setFreeformText(String freeformText) {
        this.freeformText = freeformText;
    }

}
