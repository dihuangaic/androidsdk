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

import java.util.Date;
import java.util.*;

public class VersionDto {
    @com.google.gson.annotations.SerializedName("supportedApiVersions")
    private List<String> supportedApiVersions = null;
    @com.google.gson.annotations.SerializedName("serviceVersion")
    private String serviceVersion = null;
    @com.google.gson.annotations.SerializedName("versionTag")
    private String versionTag = null;
    @com.google.gson.annotations.SerializedName("buildDate")
    private Date buildDate = null;

    /**
     * Gets supportedApiVersions
     *
     * @return supportedApiVersions
     **/
    public List<String> getSupportedApiVersions() {
        return supportedApiVersions;
    }

    /**
     * Sets the value of supportedApiVersions.
     *
     * @param supportedApiVersions the new value
     */
    public void setSupportedApiVersions(List<String> supportedApiVersions) {
        this.supportedApiVersions = supportedApiVersions;
    }

    /**
     * Gets serviceVersion
     *
     * @return serviceVersion
     **/
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Sets the value of serviceVersion.
     *
     * @param serviceVersion the new value
     */
    public void setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    /**
     * Gets versionTag
     *
     * @return versionTag
     **/
    public String getVersionTag() {
        return versionTag;
    }

    /**
     * Sets the value of versionTag.
     *
     * @param versionTag the new value
     */
    public void setVersionTag(String versionTag) {
        this.versionTag = versionTag;
    }

    /**
     * Gets buildDate
     *
     * @return buildDate
     **/
    public Date getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of buildDate.
     *
     * @param buildDate the new value
     */
    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

}
