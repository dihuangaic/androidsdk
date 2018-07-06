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
 * Pill details
 **/
public class Pill {
    /**
     * The # of the pill for this medication indicated by medication_id
     */
    @com.google.gson.annotations.SerializedName("pill_id")
    private Integer pillId = null;
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
     * The # of the pill for this medication indicated by medication_id
     *
     * @return pillId
     **/
    public Integer getPillId() {
        return pillId;
    }

    /**
     * Sets the value of pillId.
     *
     * @param pillId the new value
     */
    public void setPillId(Integer pillId) {
        this.pillId = pillId;
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

}
