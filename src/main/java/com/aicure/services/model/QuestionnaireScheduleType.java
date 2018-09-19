/**

*/
package com.aicure.services.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum QuestionnaireScheduleType {

    Independent_from_dose("independent_from_dose"),
    End_of_treatment("end_of_treatment");

    private String value;

    private QuestionnaireScheduleType(String value) {
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
     * @return QuestionnaireScheduleType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static QuestionnaireScheduleType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (QuestionnaireScheduleType enumEntry : QuestionnaireScheduleType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
