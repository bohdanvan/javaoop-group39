package com.bvan.oop.lesson7.generic.swapper;

import com.bvan.oop.common.Person;
import static com.bvan.oop.lesson7.generic.swapper.Swapper.swapGenerics;
import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SwapperRunner {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 25),
                new Person("Bob", 30)
        };
        System.out.println(Arrays.toString(persons));

        swapGenerics(persons, 0, 1);
        System.out.println(Arrays.toString(persons));
    }
}
