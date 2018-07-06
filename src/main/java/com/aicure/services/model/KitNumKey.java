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
 * KitNumKey details
 **/
public class KitNumKey {
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
     * kit number
     */
    @com.google.gson.annotations.SerializedName("kit_num")
    private String kitNum = null;

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

}
