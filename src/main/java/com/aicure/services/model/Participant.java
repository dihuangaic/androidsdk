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
 * Participant details
 **/
public class Participant {
    /**
     * participant id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String id = null;
    /**
     * participant role
     */
    @com.google.gson.annotations.SerializedName("role")
    private String role = null;

    /**
     * participant id
     *
     * @return id
     **/
    public String getId() {
        return id;
    }

    /**
     * Sets the value of id.
     *
     * @param id the new value
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * participant role
     *
     * @return role
     **/
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of role.
     *
     * @param role the new value
     */
    public void setRole(String role) {
        this.role = role;
    }

}
