package com.bvan.oop.lesson7.comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

/**
 * @author bvanchuhov
 */
public class SortingPractice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "John", // "nhoJ"
                "Bob", // "boB"
                "Phil", // "lihP"
                "Alex",
                "Aaron",
                "Alexander"
        );

        sort(names);
        System.out.println("Alphabetical order: " + names);

        sort(names, reverseOrder());
        System.out.println("Alphabetical order, desc: " + names);

        sort(names, byLength());
        System.out.println("Length order: " + names);

        sort(names, reverseOrder(byLength()));
        System.out.println("Length order, desc: " + names);

        sort(names, byEpic());
        System.out.println("Epic order: " + names);
    }

    private static EpicComparator byEpic() {
        return new EpicComparator();
    }

    private static LengthComparator byLength() {
        return new LengthComparator();
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

class EpicComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return reversed(a).compareTo(reversed(b));
    }

    private String reversed(String a) {
        return new StringBuilder(a).reverse().toString();
    }
}
