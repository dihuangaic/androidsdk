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

import com.aicure.services.model.Participant;

/**
 * ParticipantAccessRequest details
 **/
public class ParticipantAccessRequest {
    /**
     * trial id
     */
    @com.google.gson.annotations.SerializedName("trialId")
    private String trialId = null;
    /**
     * participant
     */
    @com.google.gson.annotations.SerializedName("participant")
    private Participant participant = null;

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
     * participant
     *
     * @return participant
     **/
    public Participant getParticipant() {
        return participant;
    }

    /**
     * Sets the value of participant.
     *
     * @param participant the new value
     */
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

}
