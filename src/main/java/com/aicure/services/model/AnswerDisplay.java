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
 * AnswerDisplay details
 **/
public class AnswerDisplay {
    /**
     * count of same type of displays
     */
    @com.google.gson.annotations.SerializedName("count")
    private Integer count = null;
    /**
     * mandatory flag
     */
    @com.google.gson.annotations.SerializedName("mandatory")
    private Boolean mandatory = null;
    /**
     * answer display type
     */
    @com.google.gson.annotations.SerializedName("type")
    private String type = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;
    /**
     * primary type of this question
     */
    @com.google.gson.annotations.SerializedName("primary")
    private Boolean primary = null;

    /**
     * count of same type of displays
     *
     * @return count
     **/
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of count.
     *
     * @param count the new value
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * mandatory flag
     *
     * @return mandatory
     **/
    public Boolean getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of mandatory.
     *
     * @param mandatory the new value
     */
    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    /**
     * answer display type
     *
     * @return type
     **/
    public String getType() {
        return type;
    }

    /**
     * Sets the value of type.
     *
     * @param type the new value
     */
    public void setType(String type) {
        this.type = type;
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

    /**
     * primary type of this question
     *
     * @return primary
     **/
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * Sets the value of primary.
     *
     * @param primary the new value
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

}
