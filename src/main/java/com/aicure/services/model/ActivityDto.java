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


public class ActivityDto {
    @com.google.gson.annotations.SerializedName("label")
    private String label = null;
    @com.google.gson.annotations.SerializedName("count")
    private Long count = null;

    /**
     * Gets label
     *
     * @return label
     **/
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of label.
     *
     * @param label the new value
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets count
     *
     * @return count
     **/
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of count.
     *
     * @param count the new value
     */
    public void setCount(Long count) {
        this.count = count;
    }

}
