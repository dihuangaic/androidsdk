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
import java.util.Map;
import com.aicure.services.model.MedicationImage;
import com.aicure.services.model.Policy;

/**
 * medication details
 **/
public class Medication {
    /**
     * medication id, NOT required when create, required when update
     */
    @com.google.gson.annotations.SerializedName("medication_id")
    private String medicationId = null;
    /**
     * trial, uuid
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * Medication common name
     */
    @com.google.gson.annotations.SerializedName("common_name")
    private String commonName = null;
    /**
     * Medication common display name
     */
    @com.google.gson.annotations.SerializedName("common_display_name")
    private String commonDisplayName = null;
    /**
     * medication name
     */
    @com.google.gson.annotations.SerializedName("name")
    private String name = null;
    /**
     * medication type
     */
    @com.google.gson.annotations.SerializedName("type")
    private String type = null;
    /**
     * medication color
     */
    @com.google.gson.annotations.SerializedName("color")
    private String color = null;
    /**
     * medication shape
     */
    @com.google.gson.annotations.SerializedName("shape")
    private String shape = null;
    /**
     * amount
     */
    @com.google.gson.annotations.SerializedName("amount")
    private Double amount = null;
    /**
     * max_per_dose for different questionnaire_supports of participant, Map[String,Integer]
     */
    @com.google.gson.annotations.SerializedName("max_per_dose")
    private Map<String, Integer> maxPerDose = null;
    /**
     * category
     */
    @com.google.gson.annotations.SerializedName("category")
    private String category = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * tag
     */
    @com.google.gson.annotations.SerializedName("tag")
    private String tag = null;
    /**
     * policy
     */
    @com.google.gson.annotations.SerializedName("policy")
    private Policy policy = null;
    /**
     * List of medication algorithm-models
     */
    @com.google.gson.annotations.SerializedName("models")
    private List<AlgorithmModel> models = null;
    /**
     * ID of bottle of medication
     */
    @com.google.gson.annotations.SerializedName("bottle_id")
    private String bottleId = null;
    /**
     * manufacturer of medication
     */
    @com.google.gson.annotations.SerializedName("manufacturer")
    private String manufacturer = null;
    /**
     * List of medication images
     */
    @com.google.gson.annotations.SerializedName("images")
    private List<MedicationImage> images = null;
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
     * medication id, NOT required when create, required when update
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
     * trial, uuid
     *
     * @return trial
     **/
    public String getTrial() {
        return trial;
    }

    /**
     * Sets the value of trial.
     *
     * @param trial the new value
     */
    public void setTrial(String trial) {
        this.trial = trial;
    }

    /**
     * Medication common name
     *
     * @return commonName
     **/
    public String getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of commonName.
     *
     * @param commonName the new value
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * Medication common display name
     *
     * @return commonDisplayName
     **/
    public String getCommonDisplayName() {
        return commonDisplayName;
    }

    /**
     * Sets the value of commonDisplayName.
     *
     * @param commonDisplayName the new value
     */
    public void setCommonDisplayName(String commonDisplayName) {
        this.commonDisplayName = commonDisplayName;
    }

    /**
     * medication name
     *
     * @return name
     **/
    public String getName() {
        return name;
    }

    /**
     * Sets the value of name.
     *
     * @param name the new value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * medication type
     *
     * @return type
     **/
    public String getType() {
        return type;
    }

    /**
     * Sets the value of type.
     *
     * @param type the new value
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * medication color
     *
     * @return color
     **/
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of color.
     *
     * @param color the new value
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * medication shape
     *
     * @return shape
     **/
    public String getShape() {
        return shape;
    }

    /**
     * Sets the value of shape.
     *
     * @param shape the new value
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * amount
     *
     * @return amount
     **/
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of amount.
     *
     * @param amount the new value
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * max_per_dose for different questionnaire_supports of participant, Map[String,Integer]
     *
     * @return maxPerDose
     **/
    public Map<String, Integer> getMaxPerDose() {
        return maxPerDose;
    }

    /**
     * Sets the value of maxPerDose.
     *
     * @param maxPerDose the new value
     */
    public void setMaxPerDose(Map<String, Integer> maxPerDose) {
        this.maxPerDose = maxPerDose;
    }

    /**
     * category
     *
     * @return category
     **/
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of category.
     *
     * @param category the new value
     */
    public void setCategory(String category) {
        this.category = category;
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
     * tag
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

    /**
     * policy
     *
     * @return policy
     **/
    public Policy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of policy.
     *
     * @param policy the new value
     */
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * List of medication algorithm-models
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
     * ID of bottle of medication
     *
     * @return bottleId
     **/
    public String getBottleId() {
        return bottleId;
    }

    /**
     * Sets the value of bottleId.
     *
     * @param bottleId the new value
     */
    public void setBottleId(String bottleId) {
        this.bottleId = bottleId;
    }

    /**
     * manufacturer of medication
     *
     * @return manufacturer
     **/
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of manufacturer.
     *
     * @param manufacturer the new value
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * List of medication images
     *
     * @return images
     **/
    public List<MedicationImage> getImages() {
        return images;
    }

    /**
     * Sets the value of images.
     *
     * @param images the new value
     */
    public void setImages(List<MedicationImage> images) {
        this.images = images;
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

}
