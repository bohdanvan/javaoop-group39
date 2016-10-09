package com.bvan.oop.lesson1.storing;

/**
 * @author bvanchuhov
 */
public class IntMethodStoring {

    public static void main(String[] args) {
        int x = 10;
        x = inc(x);
        System.out.println("x = " + x);
    }

    private static int inc(int x) {
        return x + 1;
    }
}
