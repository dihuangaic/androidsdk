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

/**
 * ScaleAnswerCondition details
 **/
public class ScaleAnswerCondition {
    /**
     * comparison_type
     */
    @com.google.gson.annotations.SerializedName("comparison_type")
    private String comparisonType = null;
    /**
     * values to compare with given answer
     */
    @com.google.gson.annotations.SerializedName("values")
    private List<Double> values = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * comparison_type
     *
     * @return comparisonType
     **/
    public String getComparisonType() {
        return comparisonType;
    }

    /**
     * Sets the value of comparisonType.
     *
     * @param comparisonType the new value
     */
    public void setComparisonType(String comparisonType) {
        this.comparisonType = comparisonType;
    }

    /**
     * values to compare with given answer
     *
     * @return values
     **/
    public List<Double> getValues() {
        return values;
    }

    /**
     * Sets the value of values.
     *
     * @param values the new value
     */
    public void setValues(List<Double> values) {
        this.values = values;
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
