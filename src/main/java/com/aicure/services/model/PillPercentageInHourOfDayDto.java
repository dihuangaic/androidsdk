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


public class PillPercentageInHourOfDayDto {
    @com.google.gson.annotations.SerializedName("hour")
    private Long hour = null;
    @com.google.gson.annotations.SerializedName("percentageOfPills")
    private Double percentageOfPills = null;

    /**
     * Gets hour
     *
     * @return hour
     **/
    public Long getHour() {
        return hour;
    }

    /**
     * Sets the value of hour.
     *
     * @param hour the new value
     */
    public void setHour(Long hour) {
        this.hour = hour;
    }

    /**
     * Gets percentageOfPills
     *
     * @return percentageOfPills
     **/
    public Double getPercentageOfPills() {
        return percentageOfPills;
    }

    /**
     * Sets the value of percentageOfPills.
     *
     * @param percentageOfPills the new value
     */
    public void setPercentageOfPills(Double percentageOfPills) {
        this.percentageOfPills = percentageOfPills;
    }

}
