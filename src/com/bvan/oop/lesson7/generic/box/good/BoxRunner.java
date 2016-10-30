package com.bvan.oop.lesson7.generic.box.good;

import com.bvan.oop.lesson7.generic.box.Cat;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        getCatAndMakeMeaw(catBox);
    }

    private static void getCatAndMakeMeaw(Box<Cat> catBox) {
        Cat cat = catBox.getValue();
        cat.meaw();
    }
}
