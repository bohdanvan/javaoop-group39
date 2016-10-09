package com.bvan.oop.lesson3_4.job_platform;

import java.util.Date;

/**
 * @author bvanchuhov
 */
public class CV {

    private String name;
    private long birthDate;
    private String objective;
    private int salary;

    public CV(User user, String objective) {
        this.name = user.getName();
        this.birthDate = user.getBirthDate();
        this.objective = objective;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CV{" +
                "name='" + name + '\'' +
                ", birthDate=" + new Date(birthDate) +
                ", objective='" + objective + '\'' +
                ", salary=" + salary +
                '}';
    }
}
