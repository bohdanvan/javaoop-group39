package com.bvan.oop.lesson7.generic.box.bad;

/**
 * @author bvanchuhov
 */
public class IntBox {

    private int value;

    public IntBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntBox{" +
                "value=" + value +
                '}';
    }
}
