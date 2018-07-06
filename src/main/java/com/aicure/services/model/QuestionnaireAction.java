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
import com.aicure.services.model.SingleQuestionnaireAction;

/**
 * QuestionnaireAction details
 **/
public class QuestionnaireAction {
    /**
     * A list of action for each single question
     */
    @com.google.gson.annotations.SerializedName("actions")
    private List<SingleQuestionnaireAction> actions = null;
    /**
     * if false, follow the order of questionnaire_ids, if true, use random order
     */
    @com.google.gson.annotations.SerializedName("enable_random_order")
    private Boolean enableRandomOrder = null;
    /**
     * ad hoc flag
     */
    @com.google.gson.annotations.SerializedName("allow_random_action")
    private Boolean allowRandomAction = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * A list of action for each single question
     *
     * @return actions
     **/
    public List<SingleQuestionnaireAction> getActions() {
        return actions;
    }

    /**
     * Sets the value of actions.
     *
     * @param actions the new value
     */
    public void setActions(List<SingleQuestionnaireAction> actions) {
        this.actions = actions;
    }

    /**
     * if false, follow the order of questionnaire_ids, if true, use random order
     *
     * @return enableRandomOrder
     **/
    public Boolean getEnableRandomOrder() {
        return enableRandomOrder;
    }

    /**
     * Sets the value of enableRandomOrder.
     *
     * @param enableRandomOrder the new value
     */
    public void setEnableRandomOrder(Boolean enableRandomOrder) {
        this.enableRandomOrder = enableRandomOrder;
    }

    /**
     * ad hoc flag
     *
     * @return allowRandomAction
     **/
    public Boolean getAllowRandomAction() {
        return allowRandomAction;
    }

    /**
     * Sets the value of allowRandomAction.
     *
     * @param allowRandomAction the new value
     */
    public void setAllowRandomAction(Boolean allowRandomAction) {
        this.allowRandomAction = allowRandomAction;
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
