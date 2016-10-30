package com.bvan.oop.lesson7.extra.sorting;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class SortSample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("CBA", "ZYX", "ABC"));

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return reversed(a).compareTo(reversed(b));
            }

            private String reversed(String a) {
                return new StringBuilder(a).reverse().toString();
            }
        });
        System.out.println(names);
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}
