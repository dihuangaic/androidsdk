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
import com.aicure.services.model.QuestionnaireStatusEntry;

public class QuestionnaireStatus {
    @com.google.gson.annotations.SerializedName("status_type")
    private String statusType = null;
    @com.google.gson.annotations.SerializedName("entries")
    private List<QuestionnaireStatusEntry> entries = null;

    /**
     * Gets statusType
     *
     * @return statusType
     **/
    public String getStatusType() {
        return statusType;
    }

    /**
     * Sets the value of statusType.
     *
     * @param statusType the new value
     */
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /**
     * Gets entries
     *
     * @return entries
     **/
    public List<QuestionnaireStatusEntry> getEntries() {
        return entries;
    }

    /**
     * Sets the value of entries.
     *
     * @param entries the new value
     */
    public void setEntries(List<QuestionnaireStatusEntry> entries) {
        this.entries = entries;
    }

}
