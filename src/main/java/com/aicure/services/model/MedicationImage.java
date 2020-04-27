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
 * MedicationImage details
 **/
public class MedicationImage {
    /**
     * ID of medication image
     */
    @com.google.gson.annotations.SerializedName("medication_image_id")
    private String medicationImageId = null;
    /**
     * Priority, 0 is the highest priority
     */
    @com.google.gson.annotations.SerializedName("priority")
    private Integer priority = null;
    /**
     * Location of medication image
     */
    @com.google.gson.annotations.SerializedName("uri")
    private String uri = null;
    /**
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("tag")
    private String tag = null;

    /**
     * ID of medication image
     *
     * @return medicationImageId
     **/
    public String getMedicationImageId() {
        return medicationImageId;
    }

    /**
     * Sets the value of medicationImageId.
     *
     * @param medicationImageId the new value
     */
    public void setMedicationImageId(String medicationImageId) {
        this.medicationImageId = medicationImageId;
    }

    /**
     * Priority, 0 is the highest priority
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

    /**
     * Location of medication image
     *
     * @return uri
     **/
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of uri.
     *
     * @param uri the new value
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Serialized object or any notes
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
     * Serialized object or any notes
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

}
