package com.bvan.oop.lesson7.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericSample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);

        Integer elem = list.get(0);
        System.out.println("elem = " + elem);
    }
}
