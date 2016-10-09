package com.bvan.oop.lesson3_4.rectangle;

import java.util.ArrayList;
import java.util.List;

import static com.bvan.oop.lesson3_4.rectangle.RectangleUtils.findRectanglesWithWidthGreater;
import static com.bvan.oop.lesson3_4.rectangle.RectangleUtils.summaryArea;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(3, 5));
        rectangles.add(new Rectangle(2, 10));
        rectangles.add(new Rectangle(5, 3));

        int summaryArea = summaryArea(rectangles);
        System.out.println(summaryArea);

        List<Rectangle> result = findRectanglesWithWidthGreater(rectangles, 2);
        System.out.println(result);
    }
}
