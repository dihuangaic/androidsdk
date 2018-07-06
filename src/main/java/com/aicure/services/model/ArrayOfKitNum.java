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

import com.aicure.services.model.KitNum;
import java.util.*;

/**
 * ArrayOfKitNum details
 **/
public class ArrayOfKitNum {
    @com.google.gson.annotations.SerializedName("kit_nums")
    private List<KitNum> kitNums = null;

    /**
     * Gets kitNums
     *
     * @return kitNums
     **/
    public List<KitNum> getKitNums() {
        return kitNums;
    }

    /**
     * Sets the value of kitNums.
     *
     * @param kitNums the new value
     */
    public void setKitNums(List<KitNum> kitNums) {
        this.kitNums = kitNums;
    }

}
