package com.bvan.oop.lesson7.generic.box.bad;

import com.bvan.oop.lesson7.generic.box.Cat;

/**
 * @author bvanchuhov
 */
public class ObjectBoxRunner {

    public static void main(String[] args) {
        ObjectBox catBox = new ObjectBox(new Cat());
        getCatAndMakeMeaw(catBox);
    }

    private static void getCatAndMakeMeaw(ObjectBox catBox) {
        Object value = catBox.getValue();

        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meaw();
        } else {
            System.out.println("Where is my cat?");
        }
    }
}

