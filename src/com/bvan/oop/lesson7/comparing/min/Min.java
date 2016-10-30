package com.bvan.oop.lesson7.comparing.min;

import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Min {

    public static <E extends Comparable<E>> E min(List<E> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }

        E min = list.get(0);
        for (E elem : list) {
            if (min.compareTo(elem) > 0) {
                min = elem;
            }
        }

        return min;
    }

    public static <E> E min(List<E> list, Comparator<E> comparator) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }

        E min = list.get(0);
        for (E elem : list) {
            if (comparator.compare(min, elem) > 0) {
                min = elem;
            }
        }

        return min;
    }
}
