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

import com.aicure.services.model.FileLanguageSupportUnit;
import java.util.*;
import com.aicure.services.model.TextLanguageSupportUnit;

/**
 * ContentUnit details
 **/
public class ContentUnit {
    /**
     * files, check FileLanguageSupportUnit
     */
    @com.google.gson.annotations.SerializedName("files")
    private List<FileLanguageSupportUnit> files = null;
    /**
     * text, check TextLanguageSupportUnit
     */
    @com.google.gson.annotations.SerializedName("text")
    private TextLanguageSupportUnit text = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * files, check FileLanguageSupportUnit
     *
     * @return files
     **/
    public List<FileLanguageSupportUnit> getFiles() {
        return files;
    }

    /**
     * Sets the value of files.
     *
     * @param files the new value
     */
    public void setFiles(List<FileLanguageSupportUnit> files) {
        this.files = files;
    }

    /**
     * text, check TextLanguageSupportUnit
     *
     * @return text
     **/
    public TextLanguageSupportUnit getText() {
        return text;
    }

    /**
     * Sets the value of text.
     *
     * @param text the new value
     */
    public void setText(TextLanguageSupportUnit text) {
        this.text = text;
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
