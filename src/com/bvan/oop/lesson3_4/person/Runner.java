package com.bvan.oop.lesson3_4.person;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(18);
        student.setUniversity("KPI");
        student.setCourse(1);

        student.study();
        student.drink();
    }
}
