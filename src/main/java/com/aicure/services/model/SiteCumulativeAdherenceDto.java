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


public class SiteCumulativeAdherenceDto {
    @com.google.gson.annotations.SerializedName("studyUuid")
    private String studyUuid = null;
    @com.google.gson.annotations.SerializedName("siteUuid")
    private String siteUuid = null;
    @com.google.gson.annotations.SerializedName("adherenceType")
    private String adherenceType = null;
    @com.google.gson.annotations.SerializedName("adherenceLevel")
    private String adherenceLevel = null;
    @com.google.gson.annotations.SerializedName("calculationType")
    private String calculationType = null;
    @com.google.gson.annotations.SerializedName("adherence")
    private Double adherence = null;

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
     * Gets adherenceType
     *
     * @return adherenceType
     **/
    public String getAdherenceType() {
        return adherenceType;
    }

    /**
     * Sets the value of adherenceType.
     *
     * @param adherenceType the new value
     */
    public void setAdherenceType(String adherenceType) {
        this.adherenceType = adherenceType;
    }

    /**
     * Gets adherenceLevel
     *
     * @return adherenceLevel
     **/
    public String getAdherenceLevel() {
        return adherenceLevel;
    }

    /**
     * Sets the value of adherenceLevel.
     *
     * @param adherenceLevel the new value
     */
    public void setAdherenceLevel(String adherenceLevel) {
        this.adherenceLevel = adherenceLevel;
    }

    /**
     * Gets calculationType
     *
     * @return calculationType
     **/
    public String getCalculationType() {
        return calculationType;
    }

    /**
     * Sets the value of calculationType.
     *
     * @param calculationType the new value
     */
    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }

    /**
     * Gets adherence
     *
     * @return adherence
     **/
    public Double getAdherence() {
        return adherence;
    }

    /**
     * Sets the value of adherence.
     *
     * @param adherence the new value
     */
    public void setAdherence(Double adherence) {
        this.adherence = adherence;
    }

}
