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
 * NotificationSNSObject details
 **/
public class NotificationSNSObject {
    /**
     * trial
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * user
     */
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;
    /**
     * transaction_id
     */
    @com.google.gson.annotations.SerializedName("transaction_id")
    private String transactionId = null;
    /**
     * schedule, a flag indicating whether this sns message is from any service/client or a scheduled event
     */
    @com.google.gson.annotations.SerializedName("schedule")
    private Boolean schedule = null;

    /**
     * trial
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
     * user
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
     * transaction_id
     *
     * @return transactionId
     **/
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of transactionId.
     *
     * @param transactionId the new value
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * schedule, a flag indicating whether this sns message is from any service/client or a scheduled event
     *
     * @return schedule
     **/
    public Boolean getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of schedule.
     *
     * @param schedule the new value
     */
    public void setSchedule(Boolean schedule) {
        this.schedule = schedule;
    }

}
