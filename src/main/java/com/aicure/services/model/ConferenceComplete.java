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
 * ConferenceComplete details
 **/
public class ConferenceComplete {
    /**
     * room id
     */
    @com.google.gson.annotations.SerializedName("roomId")
    private String roomId = null;
    /**
     * trial id
     */
    @com.google.gson.annotations.SerializedName("trialId")
    private String trialId = null;

    /**
     * room id
     *
     * @return roomId
     **/
    public String getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of roomId.
     *
     * @param roomId the new value
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * trial id
     *
     * @return trialId
     **/
    public String getTrialId() {
        return trialId;
    }

    /**
     * Sets the value of trialId.
     *
     * @param trialId the new value
     */
    public void setTrialId(String trialId) {
        this.trialId = trialId;
    }

}
