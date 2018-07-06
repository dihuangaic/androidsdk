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

import java.util.*;
import com.aicure.services.model.TakeMedicationStatusEntry;
import com.aicure.services.model.TakeMedicationStatusType;

public class TakeMedicationStatus {
    @com.google.gson.annotations.SerializedName("status_type")
    private TakeMedicationStatusType statusType = null;
    @com.google.gson.annotations.SerializedName("entries")
    private List<TakeMedicationStatusEntry> entries = null;

    /**
     * Gets statusType
     *
     * @return statusType
     **/
    public TakeMedicationStatusType getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of statusType.
     *
     * @param statusType the new value
     */
    public void setStatusType(TakeMedicationStatusType statusType) {
        this.statusType = statusType;
    }

    /**
     * Gets entries
     *
     * @return entries
     **/
    public List<TakeMedicationStatusEntry> getEntries() {
        return entries;
    }

    /**
     * Sets the value of entries.
     *
     * @param entries the new value
     */
    public void setEntries(List<TakeMedicationStatusEntry> entries) {
        this.entries = entries;
    }

}
