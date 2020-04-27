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
 * VideoConference details
 **/
public class VideoConference {
    /**
     * trial id
     */
    @com.google.gson.annotations.SerializedName("trialId")
    private String trialId = null;
    /**
     * conference id
     */
    @com.google.gson.annotations.SerializedName("conferenceId")
    private String conferenceId = null;
    /**
     * conference name
     */
    @com.google.gson.annotations.SerializedName("conferenceName")
    private String conferenceName = null;
    /**
     * conference type
     */
    @com.google.gson.annotations.SerializedName("type")
    private String type = null;
    /**
     * conference status
     */
    @com.google.gson.annotations.SerializedName("status")
    private String status = null;
    /**
     * host of conference, who start the conference
     */
    @com.google.gson.annotations.SerializedName("host")
    private String host = null;
    /**
     * host role
     */
    @com.google.gson.annotations.SerializedName("hostRole")
    private String hostRole = null;
    /**
     * participant id, who join the conference
     */
    @com.google.gson.annotations.SerializedName("participant")
    private String participant = null;
    /**
     * participant role
     */
    @com.google.gson.annotations.SerializedName("participantRole")
    private String participantRole = null;
    /**
     * conference start time in UTC, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("startTime")
    private String startTime = null;
    /**
     * conference end time in UTC, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("endTime")
    private String endTime = null;
    /**
     * conference duration in second
     */
    @com.google.gson.annotations.SerializedName("duration")
    private Integer duration = null;
    /**
     * is this conference recording
     */
    @com.google.gson.annotations.SerializedName("isRecording")
    private Boolean isRecording = null;
    /**
     * created at in UTC, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("createdAt")
    private String createdAt = null;
    /**
     * updated at in UTC, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     */
    @com.google.gson.annotations.SerializedName("updatedAt")
    private String updatedAt = null;

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
     * conference id
     *
     * @return conferenceId
     **/
    public String getConferenceId() {
        return conferenceId;
    }

    /**
     * Sets the value of conferenceId.
     *
     * @param conferenceId the new value
     */
    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    /**
     * conference name
     *
     * @return conferenceName
     **/
    public String getConferenceName() {
        return conferenceName;
    }

    /**
     * Sets the value of conferenceName.
     *
     * @param conferenceName the new value
     */
    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    /**
     * conference type
     *
     * @return type
     **/
    public String getType() {
        return type;
    }

    /**
     * Sets the value of type.
     *
     * @param type the new value
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * conference status
     *
     * @return status
     **/
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of status.
     *
     * @param status the new value
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * host of conference, who start the conference
     *
     * @return host
     **/
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of host.
     *
     * @param host the new value
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * host role
     *
     * @return hostRole
     **/
    public String getHostRole() {
        return hostRole;
    }

    /**
     * Sets the value of hostRole.
     *
     * @param hostRole the new value
     */
    public void setHostRole(String hostRole) {
        this.hostRole = hostRole;
    }

    /**
     * participant id, who join the conference
     *
     * @return participant
     **/
    public String getParticipant() {
        return participant;
    }

    /**
     * Sets the value of participant.
     *
     * @param participant the new value
     */
    public void setParticipant(String participant) {
        this.participant = participant;
    }

    /**
     * participant role
     *
     * @return participantRole
     **/
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * Sets the value of participantRole.
     *
     * @param participantRole the new value
     */
    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * conference start time in UTC, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     *
     * @return startTime
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of startTime.
     *
     * @param startTime the new value
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * conference end time in UTC, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     *
     * @return endTime
     **/
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of endTime.
     *
     * @param endTime the new value
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * conference duration in second
     *
     * @return duration
     **/
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of duration.
     *
     * @param duration the new value
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * is this conference recording
     *
     * @return isRecording
     **/
    public Boolean getIsRecording() {
        return isRecording;
    }

    /**
     * Sets the value of isRecording.
     *
     * @param isRecording the new value
     */
    public void setIsRecording(Boolean isRecording) {
        this.isRecording = isRecording;
    }

    /**
     * created at in UTC, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     *
     * @return createdAt
     **/
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of createdAt.
     *
     * @param createdAt the new value
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * updated at in UTC, yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
     *
     * @return updatedAt
     **/
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of updatedAt.
     *
     * @param updatedAt the new value
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
