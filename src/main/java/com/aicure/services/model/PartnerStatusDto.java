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


public class PartnerStatusDto {
    @com.google.gson.annotations.SerializedName("hivNegative")
    private Long hivNegative = null;
    @com.google.gson.annotations.SerializedName("hivNegativeOnPrEP")
    private Long hivNegativeOnPrEP = null;
    @com.google.gson.annotations.SerializedName("unknown")
    private Long unknown = null;
    @com.google.gson.annotations.SerializedName("hivPositive")
    private Long hivPositive = null;
    @com.google.gson.annotations.SerializedName("hivPositiveAndUndetectable")
    private Long hivPositiveAndUndetectable = null;

    /**
     * Gets hivNegative
     *
     * @return hivNegative
     **/
    public Long getHivNegative() {
        return hivNegative;
    }

    /**
     * Sets the value of hivNegative.
     *
     * @param hivNegative the new value
     */
    public void setHivNegative(Long hivNegative) {
        this.hivNegative = hivNegative;
    }

    /**
     * Gets hivNegativeOnPrEP
     *
     * @return hivNegativeOnPrEP
     **/
    public Long getHivNegativeOnPrEP() {
        return hivNegativeOnPrEP;
    }

    /**
     * Sets the value of hivNegativeOnPrEP.
     *
     * @param hivNegativeOnPrEP the new value
     */
    public void setHivNegativeOnPrEP(Long hivNegativeOnPrEP) {
        this.hivNegativeOnPrEP = hivNegativeOnPrEP;
    }

    /**
     * Gets unknown
     *
     * @return unknown
     **/
    public Long getUnknown() {
        return unknown;
    }

    /**
     * Sets the value of unknown.
     *
     * @param unknown the new value
     */
    public void setUnknown(Long unknown) {
        this.unknown = unknown;
    }

    /**
     * Gets hivPositive
     *
     * @return hivPositive
     **/
    public Long getHivPositive() {
        return hivPositive;
    }

    /**
     * Sets the value of hivPositive.
     *
     * @param hivPositive the new value
     */
    public void setHivPositive(Long hivPositive) {
        this.hivPositive = hivPositive;
    }

    /**
     * Gets hivPositiveAndUndetectable
     *
     * @return hivPositiveAndUndetectable
     **/
    public Long getHivPositiveAndUndetectable() {
        return hivPositiveAndUndetectable;
    }

    /**
     * Sets the value of hivPositiveAndUndetectable.
     *
     * @param hivPositiveAndUndetectable the new value
     */
    public void setHivPositiveAndUndetectable(Long hivPositiveAndUndetectable) {
        this.hivPositiveAndUndetectable = hivPositiveAndUndetectable;
    }

}
