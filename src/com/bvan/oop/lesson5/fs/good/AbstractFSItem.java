package com.bvan.oop.lesson5.fs.good;

/**
 * @author bvanchuhov
 */
public abstract class AbstractFSItem implements FSItem {

    private String name;

    public AbstractFSItem() {
    }

    public AbstractFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
