package com.bvan.oop.lesson5.fs.good;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Directory extends AbstractFSItem {

    private List<FSItem> items = new ArrayList<>();

    public Directory add(FSItem item) {
        items.add(item);
        return this;
    }

    @Override
    public int getSize() {
        int sizeSum = 0;

        for (FSItem item : items) {
            sizeSum += item.getSize();
        }

        return sizeSum;
    }

    @Override
    public int getPriority() {
        return 50;
    }

    @Override
    public String toString() {
        return "d" + items;
    }
}
