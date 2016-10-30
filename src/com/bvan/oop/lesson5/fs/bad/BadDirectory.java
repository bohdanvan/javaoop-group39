package com.bvan.oop.lesson5.fs.bad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class BadDirectory {

    private List<BadFile> files = new ArrayList<>();
    private List<BadDirectory> directories = new ArrayList<>();

    public BadDirectory add(BadFile file) {
        files.add(file);
        return this;
    }

    public BadDirectory add(BadDirectory directory) {
        checkCyclicDependency(directory);
        directories.add(directory);
        return this;
    }

    private void checkCyclicDependency(BadDirectory directory) {
        if (makeCyclicDependency(directory)) {
            throw new IllegalArgumentException("cyclic dependency");
        }
    }

    private boolean makeCyclicDependency(BadDirectory directory) {
        return this == directory; // TODO
    }

    public int getSize() {
        int sizeSum = 0;

        for (BadFile file : files) {
            sizeSum += file.getSize();
        }
        for (BadDirectory directory : directories) {
            sizeSum += directory.getSize();
        }

        return sizeSum;
    }

    @Override
    public String toString() {
        return "d{files = " + files + ", dirs = " + directories + "}";
    }
}
