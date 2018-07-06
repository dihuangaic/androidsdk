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
 * AlgorithmModel details
 **/
public class AlgorithmModel {
    /**
     * Id of algorithm model
     */
    @com.google.gson.annotations.SerializedName("algorithm_model_id")
    private String algorithmModelId = null;
    /**
     * Priority, 0 is the highest priority
     */
    @com.google.gson.annotations.SerializedName("priority")
    private Integer priority = null;
    /**
     * Location of algorithm model
     */
    @com.google.gson.annotations.SerializedName("uri")
    private String uri = null;
    /**
     * Serialized object or any notes
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * Id of algorithm model
     *
     * @return algorithmModelId
     **/
    public String getAlgorithmModelId() {
        return algorithmModelId;
    }

    /**
     * Sets the value of algorithmModelId.
     *
     * @param algorithmModelId the new value
     */
    public void setAlgorithmModelId(String algorithmModelId) {
        this.algorithmModelId = algorithmModelId;
    }

    /**
     * Priority, 0 is the highest priority
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

    /**
     * Location of algorithm model
     *
     * @return uri
     **/
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of uri.
     *
     * @param uri the new value
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Serialized object or any notes
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

}
