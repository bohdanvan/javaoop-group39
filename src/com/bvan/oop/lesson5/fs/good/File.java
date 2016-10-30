package com.bvan.oop.lesson5.fs.good;

/**
 * @author bvanchuhov
 */
public class File extends AbstractFSItem {

    private int size;

    public File(int size) {
        this.size = size;
    }

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getPriority() {
        return 100;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "f(" + size + ")";
    }
}
