/**

*/
package com.aicure.services.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NotificationType {

    Guidance("guidance"),
    Message("message"),
    Surveillance("surveillance"),
    Provision("provision"),
    Deactivation("deactivation"),
    Protocol_sync("protocol_sync"),
    Pause_or_resume("pause_or_resume"),
    Detector_parameters("detector_parameters"),
    Miss_event("miss_event"),
    Survey("survey"),
    Kiosk_check("kiosk_check"),
    Clinic_visit_push("clinic_visit_push"),
    Likert_scale_push("likert_scale_push"),
    Sms("sms"),
    Kit_num_fetch("kit_num_fetch");

    private String value;

    private NotificationType(String value) {
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
     * @return NotificationType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NotificationType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NotificationType enumEntry : NotificationType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
