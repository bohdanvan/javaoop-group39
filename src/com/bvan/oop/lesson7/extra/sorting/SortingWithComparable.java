package com.bvan.oop.lesson7.extra.sorting;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class SortingWithComparable {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(200, 10, 50, 20, 10)
        );
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Ascending order: " + list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Descending order: " + list);

        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));
    }
}


