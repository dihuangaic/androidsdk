/**
 * null
 */
package com.aicure.services.model;

/**
 * 
 */
public enum RoomType {

    PEER_TO_PEER("PEER_TO_PEER"),
    SMALL_GROUP("SMALL_GROUP"),
    GROUP("GROUP");

    private String value;

    private RoomType(String value) {
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
    public static RoomType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (RoomType enumEntry : RoomType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
