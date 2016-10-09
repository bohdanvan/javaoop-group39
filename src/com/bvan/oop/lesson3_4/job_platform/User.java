package com.bvan.oop.lesson3_4.job_platform;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class User {

    private String name;
    private Gender gender;
    private long birthDate;
    private List<CV> cvList = new ArrayList<>();

    public User(String name, Gender gender, long birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public void addCV(CV cv) {
        cvList.add(cv);
    }

    public List<CV> getCvList() {
        return cvList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate=" + new Date(birthDate) +
                ", cvList=" + cvList +
                '}';
    }
}
