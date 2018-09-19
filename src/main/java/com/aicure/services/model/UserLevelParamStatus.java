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

import com.aicure.services.model.UserLevelParamStatusType;

/**
 * UserLevelParamStatus details
 **/
public class UserLevelParamStatus {
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
     * status
     */
    @com.google.gson.annotations.SerializedName("status")
    private UserLevelParamStatusType status = null;
    /**
     * queried_at
     */
    @com.google.gson.annotations.SerializedName("queried_at")
    private String queriedAt = null;

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
     * status
     *
     * @return status
     **/
    public UserLevelParamStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of status.
     *
     * @param status the new value
     */
    public void setStatus(UserLevelParamStatusType status) {
        this.status = status;
    }

    /**
     * queried_at
     *
     * @return queriedAt
     **/
    public String getQueriedAt() {
        return queriedAt;
    }

    /**
     * Sets the value of queriedAt.
     *
     * @param queriedAt the new value
     */
    public void setQueriedAt(String queriedAt) {
        this.queriedAt = queriedAt;
    }

}
