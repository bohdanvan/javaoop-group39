package com.bvan.oop.lesson7.comparing.min;

import static com.bvan.oop.lesson7.comparing.min.Min.min;
import static java.util.Arrays.asList;

/**
 * @author bvanchuhov
 */
public class MinRunner {

    public static void main(String[] args) {
        System.out.println(min(asList(10, 2, 1, 2, 8, 1)));
        System.out.println(min(asList("X", "A", "B", "A")));
    }
}
