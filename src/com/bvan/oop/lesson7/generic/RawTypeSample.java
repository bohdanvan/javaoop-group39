package com.bvan.oop.lesson7.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class RawTypeSample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(1));
        addHello(list);

        Integer elem = list.get(1);
        System.out.println(elem);
    }

    // Не указан Generic для List (например, List<Integer>).
    // Происходит стирание типа.
    private static void addHello(List list) {
        list.add("Hello");
    }
}
