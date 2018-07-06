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
 * DiscreteDataFormat details
 **/
public class DiscreteDataFormat {
    /**
     * discrete_value_descriptions
     */
    @com.google.gson.annotations.SerializedName("discrete_value_descriptions")
    private List<ContentUnit> discreteValueDescriptions = null;
    /**
     * discrete_values
     */
    @com.google.gson.annotations.SerializedName("discrete_values")
    private List<Double> discreteValues = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * discrete_value_descriptions
     *
     * @return discreteValueDescriptions
     **/
    public List<ContentUnit> getDiscreteValueDescriptions() {
        return discreteValueDescriptions;
    }

    /**
     * Sets the value of discreteValueDescriptions.
     *
     * @param discreteValueDescriptions the new value
     */
    public void setDiscreteValueDescriptions(List<ContentUnit> discreteValueDescriptions) {
        this.discreteValueDescriptions = discreteValueDescriptions;
    }

    /**
     * discrete_values
     *
     * @return discreteValues
     **/
    public List<Double> getDiscreteValues() {
        return discreteValues;
    }

    /**
     * Sets the value of discreteValues.
     *
     * @param discreteValues the new value
     */
    public void setDiscreteValues(List<Double> discreteValues) {
        this.discreteValues = discreteValues;
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
