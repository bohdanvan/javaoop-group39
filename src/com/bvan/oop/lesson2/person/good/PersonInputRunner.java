package com.bvan.oop.lesson2.person.good;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonInputRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter age: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Illegal age");
            return;
        }

        int age = scanner.nextInt();
        if (!Validator.isAge(age)) {
            System.out.println("Age should be in the range [1..120]");
            return;
        }

        Person person = new Person(name, age);

        String helloMessage = person.sayHello();
        System.out.println(helloMessage);
    }
}
