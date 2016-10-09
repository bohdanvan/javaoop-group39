package com.bvan.oop.lesson1.storing;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("ref: " + (s1 == s2));
        System.out.println("content: " + Objects.equals(s1, s2));
    }
}
