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

public class SiteInterventionSummaryDto {
    @com.google.gson.annotations.SerializedName("studyUuid")
    private String studyUuid = null;
    @com.google.gson.annotations.SerializedName("siteUuid")
    private String siteUuid = null;
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
     * Gets siteUuid
     *
     * @return siteUuid
     **/
    public String getSiteUuid() {
        return siteUuid;
    }

    /**
     * Sets the value of siteUuid.
     *
     * @param siteUuid the new value
     */
    public void setSiteUuid(String siteUuid) {
        this.siteUuid = siteUuid;
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
