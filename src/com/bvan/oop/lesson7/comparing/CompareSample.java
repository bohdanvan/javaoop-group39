package com.bvan.oop.lesson7.comparing;

/**
 * @author bvanchuhov
 */
public class CompareSample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 20)); // <0
        System.out.println(Integer.compare(20, 20)); // 0
        System.out.println(Long.compare(30, -100)); // >0

        System.out.println("ABCD".compareTo("EFG")); // <0
    }
}
