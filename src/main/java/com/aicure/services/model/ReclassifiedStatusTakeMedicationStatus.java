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

import com.aicure.services.model.TakeMedicationStatus;

public class ReclassifiedStatusTakeMedicationStatus {
    @com.google.gson.annotations.SerializedName("event_natural_key")
    private String eventNaturalKey = null;
    @com.google.gson.annotations.SerializedName("reclassifier")
    private String reclassifier = null;
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    @com.google.gson.annotations.SerializedName("reclassified_status")
    private TakeMedicationStatus reclassifiedStatus = null;

    /**
     * Gets eventNaturalKey
     *
     * @return eventNaturalKey
     **/
    public String getEventNaturalKey() {
        return eventNaturalKey;
    }

    /**
     * Sets the value of eventNaturalKey.
     *
     * @param eventNaturalKey the new value
     */
    public void setEventNaturalKey(String eventNaturalKey) {
        this.eventNaturalKey = eventNaturalKey;
    }

    /**
     * Gets reclassifier
     *
     * @return reclassifier
     **/
    public String getReclassifier() {
        return reclassifier;
    }

    /**
     * Sets the value of reclassifier.
     *
     * @param reclassifier the new value
     */
    public void setReclassifier(String reclassifier) {
        this.reclassifier = reclassifier;
    }

    /**
     * Gets createdAt
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
     * Gets reclassifiedStatus
     *
     * @return reclassifiedStatus
     **/
    public TakeMedicationStatus getReclassifiedStatus() {
        return reclassifiedStatus;
    }

    /**
     * Sets the value of reclassifiedStatus.
     *
     * @param reclassifiedStatus the new value
     */
    public void setReclassifiedStatus(TakeMedicationStatus reclassifiedStatus) {
        this.reclassifiedStatus = reclassifiedStatus;
    }

}
