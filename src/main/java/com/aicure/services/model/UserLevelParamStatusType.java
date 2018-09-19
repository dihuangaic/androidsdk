/**

*/
package com.aicure.services.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum UserLevelParamStatusType {

    Not_found("not_found"),
    Waiting_for_trigger("waiting_for_trigger"),
    Processing("processing"),
    Updated("updated"),
    Finished("finished");

    private String value;

    private UserLevelParamStatusType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return UserLevelParamStatusType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static UserLevelParamStatusType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (UserLevelParamStatusType enumEntry : UserLevelParamStatusType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
