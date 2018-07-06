/**
 * null
 */
package com.aicure.services.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AnswerType {

    Free_video("free_video"),
    Free_audio("free_audio"),
    Free_image("free_image"),
    Free_text_date("free_text_date"),
    Free_text_time("free_text_time"),
    Free_text_datetime("free_text_datetime"),
    Free_text_text("free_text_text"),
    Free_text_number_integer("free_text_number_integer"),
    Free_text_number_double("free_text_number_double"),
    Free_select_number_integer("free_select_number_integer"),
    Multi_choice_radio_button("multi_choice_radio_button"),
    Multi_choice_dropdown_list("multi_choice_dropdown_list"),
    Multi_choice_check_box("multi_choice_check_box"),
    Likert_scale_image("likert_scale_image"),
    Likert_scale_words("likert_scale_words"),
    Likert_scale_stars("likert_scale_stars"),
    Likert_scale_continuous("likert_scale_continuous"),
    Face_id("face_id"),
    Numeric_scale_discrete("numeric_scale_discrete"),
    Numeric_scale_continuous("numeric_scale_continuous"),
    Instruction_countdown("instruction_countdown"),
    Instruction_text("instruction_text");

    private String value;

    private AnswerType(String value) {
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
     * @return Type corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AnswerType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AnswerType enumEntry : AnswerType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
