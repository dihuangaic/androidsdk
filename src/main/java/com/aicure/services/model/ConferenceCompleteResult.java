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

import java.util.*;
import com.aicure.services.model.VideoConference;

/**
 * ConferenceCompleteResult details
 **/
public class ConferenceCompleteResult {
    /**
     * list of video conference updated success
     */
    @com.google.gson.annotations.SerializedName("success")
    private List<VideoConference> success = null;
    /**
     * list of video conference updated failed
     */
    @com.google.gson.annotations.SerializedName("failed")
    private List<String> failed = null;

    /**
     * list of video conference updated success
     *
     * @return success
     **/
    public List<VideoConference> getSuccess() {
        return success;
    }

    /**
     * Sets the value of success.
     *
     * @param success the new value
     */
    public void setSuccess(List<VideoConference> success) {
        this.success = success;
    }

    /**
     * list of video conference updated failed
     *
     * @return failed
     **/
    public List<String> getFailed() {
        return failed;
    }

    /**
     * Sets the value of failed.
     *
     * @param failed the new value
     */
    public void setFailed(List<String> failed) {
        this.failed = failed;
    }

}
