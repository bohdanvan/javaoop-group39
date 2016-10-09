package com.bvan.oop.lesson2.person.good;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person("John", 25);

        String message = person.sayHello();
        System.out.println(message);
    }
}
