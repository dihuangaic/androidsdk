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
 * KitNum details
 **/
public class KitNum {
    /**
     * trial_id
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * user_id
     */
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;
    /**
     * trial_url, actual dashboard url of this trial
     */
    @com.google.gson.annotations.SerializedName("trial_url")
    private String trialUrl = null;
    /**
     * customized patient id
     */
    @com.google.gson.annotations.SerializedName("customized_patient_id")
    private String customizedPatientId = null;
    /**
     * kit number
     */
    @com.google.gson.annotations.SerializedName("kit_num")
    private String kitNum = null;
    /**
     * date of first dose
     */
    @com.google.gson.annotations.SerializedName("date_first_dose")
    private String dateFirstDose = null;
    /**
     * first dose number
     */
    @com.google.gson.annotations.SerializedName("first_dose_number")
    private Integer firstDoseNumber = null;
    /**
     * flag to indicate if this kit is active
     */
    @com.google.gson.annotations.SerializedName("inactive")
    private Boolean inactive = null;
    /**
     * read only, check if mobile fetched this KitNum Data
     */
    @com.google.gson.annotations.SerializedName("mobile_sync_status")
    private Boolean mobileSyncStatus = null;

    /**
     * trial_id
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
     * user_id
     *
     * @return user
     **/
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of user.
     *
     * @param user the new value
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * trial_url, actual dashboard url of this trial
     *
     * @return trialUrl
     **/
    public String getTrialUrl() {
        return trialUrl;
    }

    /**
     * Sets the value of trialUrl.
     *
     * @param trialUrl the new value
     */
    public void setTrialUrl(String trialUrl) {
        this.trialUrl = trialUrl;
    }

    /**
     * customized patient id
     *
     * @return customizedPatientId
     **/
    public String getCustomizedPatientId() {
        return customizedPatientId;
    }

    /**
     * Sets the value of customizedPatientId.
     *
     * @param customizedPatientId the new value
     */
    public void setCustomizedPatientId(String customizedPatientId) {
        this.customizedPatientId = customizedPatientId;
    }

    /**
     * kit number
     *
     * @return kitNum
     **/
    public String getKitNum() {
        return kitNum;
    }

    /**
     * Sets the value of kitNum.
     *
     * @param kitNum the new value
     */
    public void setKitNum(String kitNum) {
        this.kitNum = kitNum;
    }

    /**
     * date of first dose
     *
     * @return dateFirstDose
     **/
    public String getDateFirstDose() {
        return dateFirstDose;
    }

    /**
     * Sets the value of dateFirstDose.
     *
     * @param dateFirstDose the new value
     */
    public void setDateFirstDose(String dateFirstDose) {
        this.dateFirstDose = dateFirstDose;
    }

    /**
     * first dose number
     *
     * @return firstDoseNumber
     **/
    public Integer getFirstDoseNumber() {
        return firstDoseNumber;
    }

    /**
     * Sets the value of firstDoseNumber.
     *
     * @param firstDoseNumber the new value
     */
    public void setFirstDoseNumber(Integer firstDoseNumber) {
        this.firstDoseNumber = firstDoseNumber;
    }

    /**
     * flag to indicate if this kit is active
     *
     * @return inactive
     **/
    public Boolean getInactive() {
        return inactive;
    }

    /**
     * Sets the value of inactive.
     *
     * @param inactive the new value
     */
    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    /**
     * read only, check if mobile fetched this KitNum Data
     *
     * @return mobileSyncStatus
     **/
    public Boolean getMobileSyncStatus() {
        return mobileSyncStatus;
    }

    /**
     * Sets the value of mobileSyncStatus.
     *
     * @param mobileSyncStatus the new value
     */
    public void setMobileSyncStatus(Boolean mobileSyncStatus) {
        this.mobileSyncStatus = mobileSyncStatus;
    }

}
