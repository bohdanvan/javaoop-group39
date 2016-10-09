package com.bvan.oop.lesson3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class Rectangle {

    private final int width;
    private final int height;

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return width * height;
    }

    public int getPerimeter(){
        return 2 * (width + height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
