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
 * FileLanguageSupportUnit details
 **/
public class FileLanguageSupportUnit {
    /**
     * file_id of english version, query File Service to get the actual file
     */
    @com.google.gson.annotations.SerializedName("file_id")
    private String fileId = null;
    /**
     * translation_key, provide translation key to a language service, you will get a dto contains a map of files [language : file_id]
     */
    @com.google.gson.annotations.SerializedName("translation_key")
    private String translationKey = null;
    /**
     * file_type
     */
    @com.google.gson.annotations.SerializedName("file_type")
    private String fileType = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * file_uuid
     */
    @com.google.gson.annotations.SerializedName("file_uuid")
    private String fileUuid = null;

    /**
     * file_id of english version, query File Service to get the actual file
     *
     * @return fileId
     **/
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets the value of fileId.
     *
     * @param fileId the new value
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * translation_key, provide translation key to a language service, you will get a dto contains a map of files [language : file_id]
     *
     * @return translationKey
     **/
    public String getTranslationKey() {
        return translationKey;
    }

    /**
     * Sets the value of translationKey.
     *
     * @param translationKey the new value
     */
    public void setTranslationKey(String translationKey) {
        this.translationKey = translationKey;
    }

    /**
     * file_type
     *
     * @return fileType
     **/
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of fileType.
     *
     * @param fileType the new value
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
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
     * file_uuid
     *
     * @return fileUuid
     **/
    public String getFileUuid() {
        return fileUuid;
    }

    /**
     * Sets the value of fileUuid.
     *
     * @param fileUuid the new value
     */
    public void setFileUuid(String fileUuid) {
        this.fileUuid = fileUuid;
    }

}
