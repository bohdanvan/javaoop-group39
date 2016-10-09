package com.bvan.oop.lesson2.dog;

/**
 * @author bvanchuhov
 */
public class Dog {

    private String name;
    private String ownerName;

    public Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    public void bark() {
        System.out.println("Gav-gav");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
