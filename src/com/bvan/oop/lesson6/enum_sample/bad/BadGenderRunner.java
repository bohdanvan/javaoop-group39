package com.bvan.oop.lesson6.enum_sample.bad;

/**
 * @author bvanchuhov
 */
public class BadGenderRunner {

    public static void main(String[] args) {
        BadPerson person = new BadPerson("John", 25, 10);
        String genderName = person.getGenderName();

        System.out.println(person);
        System.out.println("genderName = " + genderName);
    }
}
