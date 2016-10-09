package com.bvan.oop.lesson3_4.construction;

/**
 * @author bvanchuhov
 */
public class ConstructionSample {

    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println("name = " + person.name);
        System.out.println("age = " + person.age);
    }
}

class Person {
    String name = "unnamed";
    int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }
}
