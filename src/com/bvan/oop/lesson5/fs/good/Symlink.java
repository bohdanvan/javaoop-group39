package com.bvan.oop.lesson5.fs.good;

/**
 * @author bvanchuhov
 */
public class Symlink extends AbstractFSItem {

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public int getPriority() {
        return 70;
    }
}
