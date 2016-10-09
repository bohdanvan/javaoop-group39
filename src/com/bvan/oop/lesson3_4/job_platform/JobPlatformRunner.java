package com.bvan.oop.lesson3_4.job_platform;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class JobPlatformRunner {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(createUser1());
    }

    private static User createUser1() {
        User user = new User("John", Gender.UNDEFINED, getTime(1, 11, 1990));

        CV cv = new CV(user, "Junior Java Developer");
        cv.setName("John Travolta");
        cv.setSalary(700);

        user.addCV(cv);
        return user;
    }

    private static long getTime(int dayOfMonth, int month, int year) {
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, dayOfMonth);
        Date date = calendar.getTime();
        return date.getTime();
    }
}
