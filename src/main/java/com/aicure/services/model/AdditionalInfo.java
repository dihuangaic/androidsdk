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
 * AdditionalInfo details
 **/
public class AdditionalInfo {
    /**
     * additional_text flag
     */
    @com.google.gson.annotations.SerializedName("additional_text")
    private Boolean additionalText = null;
    /**
     * additional_video flag
     */
    @com.google.gson.annotations.SerializedName("additional_video")
    private Boolean additionalVideo = null;
    /**
     * additional_audio flag
     */
    @com.google.gson.annotations.SerializedName("additional_audio")
    private Boolean additionalAudio = null;
    /**
     * additional_image flag
     */
    @com.google.gson.annotations.SerializedName("additional_image")
    private Boolean additionalImage = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * additional_text flag
     *
     * @return additionalText
     **/
    public Boolean getAdditionalText() {
        return additionalText;
    }

    /**
     * Sets the value of additionalText.
     *
     * @param additionalText the new value
     */
    public void setAdditionalText(Boolean additionalText) {
        this.additionalText = additionalText;
    }

    /**
     * additional_video flag
     *
     * @return additionalVideo
     **/
    public Boolean getAdditionalVideo() {
        return additionalVideo;
    }

    /**
     * Sets the value of additionalVideo.
     *
     * @param additionalVideo the new value
     */
    public void setAdditionalVideo(Boolean additionalVideo) {
        this.additionalVideo = additionalVideo;
    }

    /**
     * additional_audio flag
     *
     * @return additionalAudio
     **/
    public Boolean getAdditionalAudio() {
        return additionalAudio;
    }

    /**
     * Sets the value of additionalAudio.
     *
     * @param additionalAudio the new value
     */
    public void setAdditionalAudio(Boolean additionalAudio) {
        this.additionalAudio = additionalAudio;
    }

    /**
     * additional_image flag
     *
     * @return additionalImage
     **/
    public Boolean getAdditionalImage() {
        return additionalImage;
    }

    /**
     * Sets the value of additionalImage.
     *
     * @param additionalImage the new value
     */
    public void setAdditionalImage(Boolean additionalImage) {
        this.additionalImage = additionalImage;
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
