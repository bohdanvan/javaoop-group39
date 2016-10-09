package com.bvan.oop.lesson3_4.person;

/**
 * @author bvanchuhov
 */
public class Student extends Person {

    private String university;
    private int course = 1;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public void study() {
        if (course < 3) {
            System.out.println("I'm studying. And it's cool:)");
        } else {
            drink();
            drink();
            drink();
        }
    }

    public void drink() {
        System.out.println("Hard drinking. I'm " + name + "!!!");
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
