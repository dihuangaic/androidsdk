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
 * NotificationMessage details
 **/
public class NotificationMessage {
    /**
     * transaction_id, generated when creating object, used for querying the notification message
     */
    @com.google.gson.annotations.SerializedName("transaction_id")
    private String transactionId = null;
    /**
     * trial uuid id, url safe
     */
    @com.google.gson.annotations.SerializedName("trial")
    private String trial = null;
    /**
     * user uuid id, url safe
     */
    @com.google.gson.annotations.SerializedName("user")
    private String user = null;
    /**
     * number tried to process message, read only
     */
    @com.google.gson.annotations.SerializedName("attempts")
    private Integer attempts = null;
    /**
     * max attempts to process message
     */
    @com.google.gson.annotations.SerializedName("limit")
    private Integer limit = null;
    /**
     * next time to run, read only, will ignore if set in POST/PUT
     */
    @com.google.gson.annotations.SerializedName("run_at")
    private String runAt = null;
    /**
     * current message statue, read only, will ignore if set in POST/PUT
     */
    @com.google.gson.annotations.SerializedName("status")
    private String status = null;
    /**
     * time of last try, read only, will ignore if set in POST/PUT
     */
    @com.google.gson.annotations.SerializedName("last_run_at")
    private String lastRunAt = null;
    /**
     * notification type, if push to apns or gcm, this type will be included in the push body
     */
    @com.google.gson.annotations.SerializedName("notification_type")
    private String notificationType = null;
    /**
     * notification_message, which will be pushed to subscriber
     */
    @com.google.gson.annotations.SerializedName("notification_message")
    private String notificationMessage = null;
    /**
     * device_type
     */
    @com.google.gson.annotations.SerializedName("device_type")
    private String deviceType = null;
    /**
     * device_token
     */
    @com.google.gson.annotations.SerializedName("device_token")
    private String deviceToken = null;
    /**
     * created_at, read only, will ignore if set in POST/PUT
     */
    @com.google.gson.annotations.SerializedName("created_at")
    private String createdAt = null;
    /**
     * updated_at, read only, will ignore if set in POST/PUT
     */
    @com.google.gson.annotations.SerializedName("updated_at")
    private String updatedAt = null;
    /**
     * tag, format : #tag1#tag2
     */
    @com.google.gson.annotations.SerializedName("tag")
    private String tag = null;
    /**
     * comment
     */
    @com.google.gson.annotations.SerializedName("comment")
    private String comment = null;
    /**
     * priority, 0 is highest priority, if not set, will be 0
     */
    @com.google.gson.annotations.SerializedName("priority")
    private Integer priority = null;

    /**
     * transaction_id, generated when creating object, used for querying the notification message
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
     * trial uuid id, url safe
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
     * user uuid id, url safe
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
     * number tried to process message, read only
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
     * max attempts to process message
     *
     * @return limit
     **/
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the value of limit.
     *
     * @param limit the new value
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * next time to run, read only, will ignore if set in POST/PUT
     *
     * @return runAt
     **/
    public String getRunAt() {
        return runAt;
    }

    /**
     * Sets the value of runAt.
     *
     * @param runAt the new value
     */
    public void setRunAt(String runAt) {
        this.runAt = runAt;
    }

    /**
     * current message statue, read only, will ignore if set in POST/PUT
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
     * time of last try, read only, will ignore if set in POST/PUT
     *
     * @return lastRunAt
     **/
    public String getLastRunAt() {
        return lastRunAt;
    }

    /**
     * Sets the value of lastRunAt.
     *
     * @param lastRunAt the new value
     */
    public void setLastRunAt(String lastRunAt) {
        this.lastRunAt = lastRunAt;
    }

    /**
     * notification type, if push to apns or gcm, this type will be included in the push body
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

    /**
     * notification_message, which will be pushed to subscriber
     *
     * @return notificationMessage
     **/
    public String getNotificationMessage() {
        return notificationMessage;
    }

    /**
     * Sets the value of notificationMessage.
     *
     * @param notificationMessage the new value
     */
    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    /**
     * device_type
     *
     * @return deviceType
     **/
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of deviceType.
     *
     * @param deviceType the new value
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * device_token
     *
     * @return deviceToken
     **/
    public String getDeviceToken() {
        return deviceToken;
    }

    /**
     * Sets the value of deviceToken.
     *
     * @param deviceToken the new value
     */
    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    /**
     * created_at, read only, will ignore if set in POST/PUT
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
     * updated_at, read only, will ignore if set in POST/PUT
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

    /**
     * tag, format : #tag1#tag2
     *
     * @return tag
     **/
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of tag.
     *
     * @param tag the new value
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * comment
     *
     * @return comment
     **/
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of comment.
     *
     * @param comment the new value
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * priority, 0 is highest priority, if not set, will be 0
     *
     * @return priority
     **/
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of priority.
     *
     * @param priority the new value
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

}
