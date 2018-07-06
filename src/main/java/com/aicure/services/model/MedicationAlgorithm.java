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

import com.aicure.services.model.AlgorithmModel;
import java.util.*;

/**
 * MedicationAlgorithm details
 **/
public class MedicationAlgorithm {
    /**
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * ID of medication
     */
    @com.google.gson.annotations.SerializedName("medication_id")
    private String medicationId = null;
    /**
     * ID of medication
     */
    @com.google.gson.annotations.SerializedName("models")
    private List<AlgorithmModel> models = null;
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
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("tag")
    private String tag = null;

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
     * ID of medication
     *
     * @return medicationId
     **/
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * Sets the value of medicationId.
     *
     * @param medicationId the new value
     */
    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    /**
     * ID of medication
     *
     * @return models
     **/
    public List<AlgorithmModel> getModels() {
        return models;
    }

    /**
     * Sets the value of models.
     *
     * @param models the new value
     */
    public void setModels(List<AlgorithmModel> models) {
        this.models = models;
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
