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

import com.aicure.services.model.ProtectionLevelFrequenciesDto;

public class EncountersByProtectionLevelDto {
    @com.google.gson.annotations.SerializedName("allActivities")
    private ProtectionLevelFrequenciesDto allActivities = null;
    @com.google.gson.annotations.SerializedName("analWithCondom")
    private ProtectionLevelFrequenciesDto analWithCondom = null;
    @com.google.gson.annotations.SerializedName("analNoCondom")
    private ProtectionLevelFrequenciesDto analNoCondom = null;

    /**
     * Gets allActivities
     *
     * @return allActivities
     **/
    public ProtectionLevelFrequenciesDto getAllActivities() {
        return allActivities;
    }

    /**
     * Sets the value of allActivities.
     *
     * @param allActivities the new value
     */
    public void setAllActivities(ProtectionLevelFrequenciesDto allActivities) {
        this.allActivities = allActivities;
    }

    /**
     * Gets analWithCondom
     *
     * @return analWithCondom
     **/
    public ProtectionLevelFrequenciesDto getAnalWithCondom() {
        return analWithCondom;
    }

    /**
     * Sets the value of analWithCondom.
     *
     * @param analWithCondom the new value
     */
    public void setAnalWithCondom(ProtectionLevelFrequenciesDto analWithCondom) {
        this.analWithCondom = analWithCondom;
    }

    /**
     * Gets analNoCondom
     *
     * @return analNoCondom
     **/
    public ProtectionLevelFrequenciesDto getAnalNoCondom() {
        return analNoCondom;
    }

    /**
     * Sets the value of analNoCondom.
     *
     * @param analNoCondom the new value
     */
    public void setAnalNoCondom(ProtectionLevelFrequenciesDto analNoCondom) {
        this.analNoCondom = analNoCondom;
    }

}
