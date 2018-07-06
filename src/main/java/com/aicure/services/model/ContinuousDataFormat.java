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

import com.aicure.services.model.ContentUnit;
import java.util.*;

/**
 * AdditionalInfo details
 **/
public class ContinuousDataFormat {
    /**
     * start of ContinuousDataFormat
     */
    @com.google.gson.annotations.SerializedName("start")
    private Double start = null;
    /**
     * to describe the scale
     */
    @com.google.gson.annotations.SerializedName("continuous_descriptions")
    private List<ContentUnit> continuousDescriptions = null;
    /**
     * end of ContinuousDataFormat
     */
    @com.google.gson.annotations.SerializedName("end")
    private Double end = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * start of ContinuousDataFormat
     *
     * @return start
     **/
    public Double getStart() {
        return start;
    }

    /**
     * Sets the value of start.
     *
     * @param start the new value
     */
    public void setStart(Double start) {
        this.start = start;
    }

    /**
     * to describe the scale
     *
     * @return continuousDescriptions
     **/
    public List<ContentUnit> getContinuousDescriptions() {
        return continuousDescriptions;
    }

    /**
     * Sets the value of continuousDescriptions.
     *
     * @param continuousDescriptions the new value
     */
    public void setContinuousDescriptions(List<ContentUnit> continuousDescriptions) {
        this.continuousDescriptions = continuousDescriptions;
    }

    /**
     * end of ContinuousDataFormat
     *
     * @return end
     **/
    public Double getEnd() {
        return end;
    }

    /**
     * Sets the value of end.
     *
     * @param end the new value
     */
    public void setEnd(Double end) {
        this.end = end;
    }

    /**
     * description
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
