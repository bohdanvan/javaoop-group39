package com.bvan.oop.lesson3_4;

/**
 * @author bvanchuhov
 */
public class OverloadingSample {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(1.0, 2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
