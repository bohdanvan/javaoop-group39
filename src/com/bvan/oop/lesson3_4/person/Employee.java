package com.bvan.oop.lesson3_4.person;

/**
 * @author bvanchuhov
 */
public class Employee extends Person {

    private String company;

    public Employee() {
    }

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void work() {
        System.out.println("Hard working");
    }

    public void drink() {
        System.out.println("Hard drinking");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
