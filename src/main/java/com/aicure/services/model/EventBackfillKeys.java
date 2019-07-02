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
 * EventBackfillKeys details
 **/
public class EventBackfillKeys {
    /**
     * trial id
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * user id
     */
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;
    /**
     * action type
     */
    @com.google.gson.annotations.SerializedName("action_type")
    private String actionType = null;
    /**
     * throttle datetime, yyyy-MM-dd HH:mm:ss
     */
    @com.google.gson.annotations.SerializedName("throttle_datetime")
    private String throttleDatetime = null;
    /**
     * attempt times
     */
    @com.google.gson.annotations.SerializedName("attempts")
    private Integer attempts = null;
    /**
     * time zone id
     */
    @com.google.gson.annotations.SerializedName("tzid")
    private String tzid = null;

    /**
     * trial id
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
     * user id
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
     * action type
     *
     * @return actionType
     **/
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of actionType.
     *
     * @param actionType the new value
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * throttle datetime, yyyy-MM-dd HH:mm:ss
     *
     * @return throttleDatetime
     **/
    public String getThrottleDatetime() {
        return throttleDatetime;
    }

    /**
     * Sets the value of throttleDatetime.
     *
     * @param throttleDatetime the new value
     */
    public void setThrottleDatetime(String throttleDatetime) {
        this.throttleDatetime = throttleDatetime;
    }

    /**
     * attempt times
     *
     * @return attempts
     **/
    public Integer getAttempts() {
        return attempts;
    }

    /**
     * Sets the value of attempts.
     *
     * @param attempts the new value
     */
    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    /**
     * time zone id
     *
     * @return tzid
     **/
    public String getTzid() {
        return tzid;
    }

    /**
     * Sets the value of tzid.
     *
     * @param tzid the new value
     */
    public void setTzid(String tzid) {
        this.tzid = tzid;
    }

}
