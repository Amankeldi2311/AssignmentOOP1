package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    List<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size() - 1; i++)
            perimeter += points.get(i).getDistance(points.get(i + 1));
        return perimeter;
    }

    public double getAverageSide() {
        return getPerimeter() / points.size();
    }


    public double getLongestSide() {
        double maximum = 0;
        for (int i = 0; i < points.size() - 1; i++)
            maximum = Math.max(points.get(i).getDistance(points.get(i + 1)), maximum);
        return maximum;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "points=" + points +
                '}';
    }
}
