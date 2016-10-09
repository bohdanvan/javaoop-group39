package com.bvan.oop.lesson2.person.bad;

/**
 * @author bvanchuhov
 */
public class BadPersonRunner {

    public static void main(String[] args) {
        BadPerson person = new BadPerson();
        person.name = "John";
        person.age = 25;

        String info = BadPersonRunner.getInfoMessage(person);
        System.out.println(info);

        double sin = Math.sin(1.2);
    }

    private static String getInfoMessage(BadPerson person) {
        return "Hello, I'm " + person.name + ", " + person.age + " years old";
    }
}
