package com.bvan.oop.lesson7.generic.box.bad;

/**
 * @author bvanchuhov
 */
public class StringBox {

    private String value;

    public StringBox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringBox{" +
                "value='" + value + '\'' +
                '}';
    }
}
