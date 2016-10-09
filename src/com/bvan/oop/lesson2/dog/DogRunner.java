package com.bvan.oop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "John");

        for (int i = 0; i < 5; i++) {
            dog.bark();
        }
    }
}
