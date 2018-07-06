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
import java.util.Map;

/**
 * TextLanguageSupportUnit details
 **/
public class TextLanguageSupportUnit {
    /**
     * body, english version text
     */
    @com.google.gson.annotations.SerializedName("body")
    private String body = null;
    /**
     * translation_key, provide translation key to a language service, you will get a dto contains a map of bodies [language : body]
     */
    @com.google.gson.annotations.SerializedName("translation_key")
    private String translationKey = null;
    /**
     * params for translation injections if necessary, like &#39;my name is {%name}, and i am {%age} years old.&#39;
     */
    @com.google.gson.annotations.SerializedName("params")
    private Map<String, String> params = null;
    /**
     * description
     */
    @com.google.gson.annotations.SerializedName("description")
    private String description = null;

    /**
     * body, english version text
     *
     * @return body
     **/
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of body.
     *
     * @param body the new value
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * translation_key, provide translation key to a language service, you will get a dto contains a map of bodies [language : body]
     *
     * @return translationKey
     **/
    public String getTranslationKey() {
        return translationKey;
    }

    /**
     * Sets the value of translationKey.
     *
     * @param translationKey the new value
     */
    public void setTranslationKey(String translationKey) {
        this.translationKey = translationKey;
    }

    /**
     * params for translation injections if necessary, like &#39;my name is {%name}, and i am {%age} years old.&#39;
     *
     * @return params
     **/
    public Map<String, String> getParams() {
        return params;
    }

    /**
     * Sets the value of params.
     *
     * @param params the new value
     */
    public void setParams(Map<String, String> params) {
        this.params = params;
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
