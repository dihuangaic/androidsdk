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

import com.aicure.services.model.KitNumKey;
import java.util.*;

/**
 * ArrayOfKitNumKey details
 **/
public class ArrayOfKitNumKey {
    @com.google.gson.annotations.SerializedName("kit_num_keys")
    private List<KitNumKey> kitNumKeys = null;

    /**
     * Gets kitNumKeys
     *
     * @return kitNumKeys
     **/
    public List<KitNumKey> getKitNumKeys() {
        return kitNumKeys;
    }

    /**
     * Sets the value of kitNumKeys.
     *
     * @param kitNumKeys the new value
     */
    public void setKitNumKeys(List<KitNumKey> kitNumKeys) {
        this.kitNumKeys = kitNumKeys;
    }

}
