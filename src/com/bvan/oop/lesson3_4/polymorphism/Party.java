package com.bvan.oop.lesson3_4.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Party {

    public static void main(String[] args) {
        List<Person> guests = new ArrayList<>();
        guests.add(new DJ());
        guests.add(new Police());
        guests.add(new JavaStudent());
        guests.add(new JavaStudent());
        guests.add(new Stripper());
        guests.add(new JavaStudent());
        guests.add(new Fireman());
        guests.add(new JavaStudent());
        guests.add(new JavaStudent());

        askHello(guests);
        askDancing(guests.get(4));
    }

    private static void askDancing(Person person) {
        if (person instanceof Stripper) {
            Stripper stripper = (Stripper) person;
            stripper.dance();
        } else {
            System.out.println("I'm not a stripper");
        }
    }

    public static void askHello(List<Person> persons) {
        for (Person person : persons) {
            person.sayHello();
        }
    }

    public static void askHello(Person person) {
        person.sayHello();
    }
}

interface Person {
    void sayHello();
}

interface Musician {
    void playMusic();
}

interface Dancer {
    void dance();
}

interface Shooter {
    void shoot();
}

class JavaStudent implements Person {
    @Override
    public void sayHello() {
        System.out.println("I want get drunk");
    }
}

class DJ implements Person, Musician {
    @Override
    public void sayHello() {
        System.out.println("I'm DJ, i'm fun:)");
    }

    @Override
    public void playMusic() {
        System.out.println("Music-music!");
    }
}

class Stripper implements Person, Dancer {
    @Override
    public void sayHello() {
        System.out.println("Hi, kitty))");
    }

    @Override
    public void dance() {
        System.out.println("Erotic dancing");
    }
}

class Police implements Person, Shooter {
    @Override
    public void sayHello() {
        System.out.println("Hands up! I want beer");
    }

    @Override
    public void shoot() {
        System.out.println("Bang-bang");
    }
}

class Fireman implements Person {
    @Override
    public void sayHello() {
        System.out.println("Here is very hot. I want beer");
    }
}
