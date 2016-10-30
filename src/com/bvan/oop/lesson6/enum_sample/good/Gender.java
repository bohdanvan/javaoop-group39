package com.bvan.oop.lesson6.enum_sample.good;

/**
 * @author bvanchuhov
 */
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNDEFINED("unknown");

    private final String genderName;

    public static boolean isGender(String name) {
        for (Gender gender : Gender.values()) {
            if (gender.name().equals(name)) {
                return true;
            }
        }
        return false;
    }

    Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }
}
