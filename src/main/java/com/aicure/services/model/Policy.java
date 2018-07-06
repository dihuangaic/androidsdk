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
 * Policy details
 **/
public class Policy {
    /**
     * phi
     */
    @com.google.gson.annotations.SerializedName("phi")
    private String phi = null;
    /**
     * region
     */
    @com.google.gson.annotations.SerializedName("region")
    private String region = null;
    /**
     * expiration
     */
    @com.google.gson.annotations.SerializedName("expiration")
    private String expiration = null;
    /**
     * ownership
     */
    @com.google.gson.annotations.SerializedName("ownership")
    private String ownership = null;

    /**
     * phi
     *
     * @return phi
     **/
    public String getPhi() {
        return phi;
    }

    /**
     * Sets the value of phi.
     *
     * @param phi the new value
     */
    public void setPhi(String phi) {
        this.phi = phi;
    }

    /**
     * region
     *
     * @return region
     **/
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of region.
     *
     * @param region the new value
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * expiration
     *
     * @return expiration
     **/
    public String getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of expiration.
     *
     * @param expiration the new value
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * ownership
     *
     * @return ownership
     **/
    public String getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of ownership.
     *
     * @param ownership the new value
     */
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

}
