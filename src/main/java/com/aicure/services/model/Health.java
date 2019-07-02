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


public class Health {
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    @com.google.gson.annotations.SerializedName("status")
    private String status = null;

    /**
     * Gets description
     *
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of description.
     *
     * @param description the new value
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets status
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

}
