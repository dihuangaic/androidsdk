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


public class InterventionSummaryWrapperDto {
    @com.google.gson.annotations.SerializedName("textInterventionCount")
    private Long textInterventionCount = null;
    @com.google.gson.annotations.SerializedName("callInterventionCount")
    private Long callInterventionCount = null;
    @com.google.gson.annotations.SerializedName("emailInterventionCount")
    private Long emailInterventionCount = null;
    @com.google.gson.annotations.SerializedName("inPersonInterventionCount")
    private Long inPersonInterventionCount = null;

    /**
     * Gets textInterventionCount
     *
     * @return textInterventionCount
     **/
    public Long getTextInterventionCount() {
        return textInterventionCount;
    }

    /**
     * Sets the value of textInterventionCount.
     *
     * @param textInterventionCount the new value
     */
    public void setTextInterventionCount(Long textInterventionCount) {
        this.textInterventionCount = textInterventionCount;
    }

    /**
     * Gets callInterventionCount
     *
     * @return callInterventionCount
     **/
    public Long getCallInterventionCount() {
        return callInterventionCount;
    }

    /**
     * Sets the value of callInterventionCount.
     *
     * @param callInterventionCount the new value
     */
    public void setCallInterventionCount(Long callInterventionCount) {
        this.callInterventionCount = callInterventionCount;
    }

    /**
     * Gets emailInterventionCount
     *
     * @return emailInterventionCount
     **/
    public Long getEmailInterventionCount() {
        return emailInterventionCount;
    }

    /**
     * Sets the value of emailInterventionCount.
     *
     * @param emailInterventionCount the new value
     */
    public void setEmailInterventionCount(Long emailInterventionCount) {
        this.emailInterventionCount = emailInterventionCount;
    }

    /**
     * Gets inPersonInterventionCount
     *
     * @return inPersonInterventionCount
     **/
    public Long getInPersonInterventionCount() {
        return inPersonInterventionCount;
    }

    /**
     * Sets the value of inPersonInterventionCount.
     *
     * @param inPersonInterventionCount the new value
     */
    public void setInPersonInterventionCount(Long inPersonInterventionCount) {
        this.inPersonInterventionCount = inPersonInterventionCount;
    }

}
