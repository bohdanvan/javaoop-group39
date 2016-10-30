package com.bvan.oop.lesson5.fs.good;

/**
 * @author bvanchuhov
 */
public class FSRunner {

    public static void main(String[] args) {
        Directory root = new Directory()
                .add(new File(10))
                .add(new Directory().add(new File(20)))
                .add(new Directory())
                .add(new File(30))
                .add(new Symlink())
                .add(new Symlink());

        System.out.println("size = " + root.getSize());
    }
}
