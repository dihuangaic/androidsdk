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
 * Check if all notification messages are finished or suspended
 **/
public class CheckNotificationMessageResult {
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
     * all_finished_or_suspended
     */
    @com.google.gson.annotations.SerializedName("all_finished_or_suspended")
    private Boolean allFinishedOrSuspended = null;
    /**
     * notification_type
     */
    @com.google.gson.annotations.SerializedName("notification_type")
    private String notificationType = null;

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
     * all_finished_or_suspended
     *
     * @return allFinishedOrSuspended
     **/
    public Boolean getAllFinishedOrSuspended() {
        return allFinishedOrSuspended;
    }

    /**
     * Sets the value of allFinishedOrSuspended.
     *
     * @param allFinishedOrSuspended the new value
     */
    public void setAllFinishedOrSuspended(Boolean allFinishedOrSuspended) {
        this.allFinishedOrSuspended = allFinishedOrSuspended;
    }

    /**
     * notification_type
     *
     * @return notificationType
     **/
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of notificationType.
     *
     * @param notificationType the new value
     */
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

}
