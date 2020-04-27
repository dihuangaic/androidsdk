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
 * VideoRoomAccess details
 **/
public class VideoRoomAccess {
    /**
     * room name
     */
    @com.google.gson.annotations.SerializedName("roomName")
    private String roomName = null;
    /**
     * access token
     */
    @com.google.gson.annotations.SerializedName("accessToken")
    private String accessToken = null;
    /**
     * identity
     */
    @com.google.gson.annotations.SerializedName("identity")
    private String identity = null;

    /**
     * room name
     *
     * @return roomName
     **/
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of roomName.
     *
     * @param roomName the new value
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * access token
     *
     * @return accessToken
     **/
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of accessToken.
     *
     * @param accessToken the new value
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * identity
     *
     * @return identity
     **/
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets the value of identity.
     *
     * @param identity the new value
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

}
