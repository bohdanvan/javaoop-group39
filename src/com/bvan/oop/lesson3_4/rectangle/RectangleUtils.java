package com.bvan.oop.lesson3_4.rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class RectangleUtils {

    public static int summaryArea(List<Rectangle> rectangles) {
        int areaSum = 0;
        for (Rectangle rectangle : rectangles) {
            areaSum += rectangle.getArea();
        }
        return areaSum;
    }

    public static List<Rectangle> findRectanglesWithWidthGreater(List<Rectangle> rectangles, int widthBound) {

        List<Rectangle> res = new ArrayList<>();

        for (Rectangle rectangle : rectangles) {
            if (rectangle.getWidth() > widthBound) {
                res.add(rectangle);
            }
        }

        return res;
    }
}
