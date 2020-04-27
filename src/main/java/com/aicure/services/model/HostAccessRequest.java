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

import java.util.*;
import com.aicure.services.model.Participant;

/**
 * HostAccessRequest details
 **/
public class HostAccessRequest {
    /**
     * trial id
     */
    @com.google.gson.annotations.SerializedName("trialId")
    private String trialId = null;
    /**
     * list of participants
     */
    @com.google.gson.annotations.SerializedName("participants")
    private List<Participant> participants = null;
    /**
     * host
     */
    @com.google.gson.annotations.SerializedName("host")
    private Participant host = null;

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

    /**
     * list of participants
     *
     * @return participants
     **/
    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * Sets the value of participants.
     *
     * @param participants the new value
     */
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    /**
     * host
     *
     * @return host
     **/
    public Participant getHost() {
        return host;
    }

    /**
     * Sets the value of host.
     *
     * @param host the new value
     */
    public void setHost(Participant host) {
        this.host = host;
    }

}
