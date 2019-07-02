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


public class PatientXDayWeekdayAdherenceDto {
    @com.google.gson.annotations.SerializedName("studyUuid")
    private String studyUuid = null;
    @com.google.gson.annotations.SerializedName("patientUuid")
    private String patientUuid = null;
    @com.google.gson.annotations.SerializedName("adherenceType")
    private String adherenceType = null;
    @com.google.gson.annotations.SerializedName("adherenceLevel")
    private String adherenceLevel = null;
    @com.google.gson.annotations.SerializedName("calculationType")
    private String calculationType = null;
    @com.google.gson.annotations.SerializedName("dayOfWeek")
    private String dayOfWeek = null;
    @com.google.gson.annotations.SerializedName("dayCount")
    private Integer dayCount = null;
    @com.google.gson.annotations.SerializedName("adherence")
    private Double adherence = null;
    @com.google.gson.annotations.SerializedName("missingDay")
    private Boolean missingDay = null;
    @com.google.gson.annotations.SerializedName("awaitingMedications")
    private Boolean awaitingMedications = null;

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
     * Gets patientUuid
     *
     * @return patientUuid
     **/
    public String getPatientUuid() {
        return patientUuid;
    }

    /**
     * Sets the value of patientUuid.
     *
     * @param patientUuid the new value
     */
    public void setPatientUuid(String patientUuid) {
        this.patientUuid = patientUuid;
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
     * Gets dayOfWeek
     *
     * @return dayOfWeek
     **/
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of dayOfWeek.
     *
     * @param dayOfWeek the new value
     */
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * Gets dayCount
     *
     * @return dayCount
     **/
    public Integer getDayCount() {
        return dayCount;
    }

    /**
     * Sets the value of dayCount.
     *
     * @param dayCount the new value
     */
    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
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

    /**
     * Gets missingDay
     *
     * @return missingDay
     **/
    public Boolean getMissingDay() {
        return missingDay;
    }

    /**
     * Sets the value of missingDay.
     *
     * @param missingDay the new value
     */
    public void setMissingDay(Boolean missingDay) {
        this.missingDay = missingDay;
    }

    /**
     * Gets awaitingMedications
     *
     * @return awaitingMedications
     **/
    public Boolean getAwaitingMedications() {
        return awaitingMedications;
    }

    /**
     * Sets the value of awaitingMedications.
     *
     * @param awaitingMedications the new value
     */
    public void setAwaitingMedications(Boolean awaitingMedications) {
        this.awaitingMedications = awaitingMedications;
    }

}
