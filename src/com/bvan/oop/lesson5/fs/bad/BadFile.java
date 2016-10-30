package com.bvan.oop.lesson5.fs.bad;

/**
 * @author bvanchuhov
 */
public class BadFile {

    private int size;

    public BadFile(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}
