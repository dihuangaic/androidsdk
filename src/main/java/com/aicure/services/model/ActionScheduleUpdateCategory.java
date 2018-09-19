/**

*/
package com.aicure.services.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ActionScheduleUpdateCategory {

    Take_medication("take_medication"),
    Questionnaire("questionnaire"),
    All("all");

    private String value;

    private ActionScheduleUpdateCategory(String value) {
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
     * @return ActionScheduleUpdateCategory corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ActionScheduleUpdateCategory fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ActionScheduleUpdateCategory enumEntry : ActionScheduleUpdateCategory.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
