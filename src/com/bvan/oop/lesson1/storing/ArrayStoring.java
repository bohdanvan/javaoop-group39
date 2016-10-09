package com.bvan.oop.lesson1.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayStoring {

    public static void main(String[] args) {
        int[] a = {10};
        int[] b = a;

        b[0] = 1000;

        System.out.println("a = " + Arrays.toString(a));
    }
}
