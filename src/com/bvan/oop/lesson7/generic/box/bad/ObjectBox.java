package com.bvan.oop.lesson7.generic.box.bad;

/**
 * @author bvanchuhov
 */
public class ObjectBox {

    private Object value;

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "value=" + value +
                '}';
    }
}
