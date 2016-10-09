package com.bvan.oop.lesson1;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ObjectSample {

    public static void main(String[] args) {
        passiveArray();

        activeString();
        passiveString();
    }

    private static void passiveArray() {
        int[] a = new int[10];

        int length = a.length;
        System.out.println("length = " + length);

        Arrays.fill(a, 1);
        System.out.println(Arrays.toString(a));
    }

    private static void activeString() {
        String s = "Hello";
        int length = s.length();
        System.out.println("length = " + length);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);
    }

    private static void passiveString() {
        String reversed = reverse("Hello");
        System.out.println("reversed = " + reversed);
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
