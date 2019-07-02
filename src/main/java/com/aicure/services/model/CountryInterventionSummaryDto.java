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

import com.aicure.services.model.InterventionSummaryWrapperDto;

public class CountryInterventionSummaryDto {
    @com.google.gson.annotations.SerializedName("studyUuid")
    private String studyUuid = null;
    @com.google.gson.annotations.SerializedName("countryCode")
    private String countryCode = null;
    @com.google.gson.annotations.SerializedName("interventionType")
    private String interventionType = null;
    @com.google.gson.annotations.SerializedName("summary")
    private InterventionSummaryWrapperDto summary = null;

    /**
     * Gets studyUuid
     *
     * @return studyUuid
     **/
    public String getStudyUuid() {
        return studyUuid;
    }

    /**
     * Sets the value of studyUuid.
     *
     * @param studyUuid the new value
     */
    public void setStudyUuid(String studyUuid) {
        this.studyUuid = studyUuid;
    }

    /**
     * Gets countryCode
     *
     * @return countryCode
     **/
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of countryCode.
     *
     * @param countryCode the new value
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Gets interventionType
     *
     * @return interventionType
     **/
    public String getInterventionType() {
        return interventionType;
    }

    /**
     * Sets the value of interventionType.
     *
     * @param interventionType the new value
     */
    public void setInterventionType(String interventionType) {
        this.interventionType = interventionType;
    }

    /**
     * Gets summary
     *
     * @return summary
     **/
    public InterventionSummaryWrapperDto getSummary() {
        return summary;
    }

    /**
     * Sets the value of summary.
     *
     * @param summary the new value
     */
    public void setSummary(InterventionSummaryWrapperDto summary) {
        this.summary = summary;
    }

}
