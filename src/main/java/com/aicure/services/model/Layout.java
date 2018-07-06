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
import com.aicure.services.model.QuestionPage;

/**
 * Layout details
 **/
public class Layout {
    /**
     * pages, check QuestionPage
     */
    @com.google.gson.annotations.SerializedName("pages")
    private List<QuestionPage> pages = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * pages, check QuestionPage
     *
     * @return pages
     **/
    public List<QuestionPage> getPages() {
        return pages;
    }

    /**
     * Sets the value of pages.
     *
     * @param pages the new value
     */
    public void setPages(List<QuestionPage> pages) {
        this.pages = pages;
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
