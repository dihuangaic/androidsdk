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
 * Translation details
 **/
public class TranslationDetails {
    /**
     * translation_key_id
     */
    @com.google.gson.annotations.SerializedName("translation_key_id")
    private String translationKeyId = null;
    /**
     * language
     */
    @com.google.gson.annotations.SerializedName("language")
    private String language = null;
    /**
     * content_type
     */
    @com.google.gson.annotations.SerializedName("content_type")
    private String contentType = null;
    /**
     * content
     */
    @com.google.gson.annotations.SerializedName("content")
    private String content = null;
    /**
     * created_at, read only, will ignore if set in POST/PUT
     */
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    /**
     * updated_at, read only, will ignore if set in POST/PUT
     */
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;

    /**
     * translation_key_id
     *
     * @return translationKeyId
     **/
    public String getTranslationKeyId() {
        return translationKeyId;
    }

    /**
     * Sets the value of translationKeyId.
     *
     * @param translationKeyId the new value
     */
    public void setTranslationKeyId(String translationKeyId) {
        this.translationKeyId = translationKeyId;
    }

    /**
     * language
     *
     * @return language
     **/
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of language.
     *
     * @param language the new value
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * content_type
     *
     * @return contentType
     **/
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of contentType.
     *
     * @param contentType the new value
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * content
     *
     * @return content
     **/
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of content.
     *
     * @param content the new value
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * created_at, read only, will ignore if set in POST/PUT
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
     * updated_at, read only, will ignore if set in POST/PUT
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
