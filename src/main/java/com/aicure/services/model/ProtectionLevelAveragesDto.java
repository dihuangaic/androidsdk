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


public class ProtectionLevelAveragesDto {
    @com.google.gson.annotations.SerializedName("high")
    private Double high = null;
    @com.google.gson.annotations.SerializedName("medium")
    private Double medium = null;
    @com.google.gson.annotations.SerializedName("low")
    private Double low = null;

    /**
     * Gets high
     *
     * @return high
     **/
    public Double getHigh() {
        return high;
    }

    /**
     * Sets the value of high.
     *
     * @param high the new value
     */
    public void setHigh(Double high) {
        this.high = high;
    }

    /**
     * Gets medium
     *
     * @return medium
     **/
    public Double getMedium() {
        return medium;
    }

    /**
     * Sets the value of medium.
     *
     * @param medium the new value
     */
    public void setMedium(Double medium) {
        this.medium = medium;
    }

    /**
     * Gets low
     *
     * @return low
     **/
    public Double getLow() {
        return low;
    }

    /**
     * Sets the value of low.
     *
     * @param low the new value
     */
    public void setLow(Double low) {
        this.low = low;
    }

}
