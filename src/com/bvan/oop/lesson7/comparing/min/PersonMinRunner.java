package com.bvan.oop.lesson7.comparing.min;

import com.bvan.oop.common.Person;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class PersonMinRunner {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Phil", 20)
        );

        Person person = Min.min(persons, new AgeComparator());
        System.out.println(person);
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
