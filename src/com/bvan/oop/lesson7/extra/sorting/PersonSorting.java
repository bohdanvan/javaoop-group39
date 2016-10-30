package com.bvan.oop.lesson7.extra.sorting;

import com.bvan.oop.common.Person;
import java.util.*;

/**
 * @author bvanchuhov
 */
public class PersonSorting {

    public static void main(String[] args) {
        List<Person> persons = createPersons();

        Collections.sort(persons, new AgeComparator());
        System.out.println("Age criterion, ascending order: " + persons);
    }

    private static List<Person> createPersons() {
        return new ArrayList<>(Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Fill", 20)
        ));
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
