package Factory;

import java.util.HashMap;
import java.util.Map;

public class Triangle implements Figure {
    private Point[] points;

    public Triangle(Point[] points) {
        this.points = points;
    }

    @Override
    public Point[] getPoints() {
        if (!isTriangle()) {
            return null;
        }
        System.out.println("It's a Triangle!");
        return points;
    }

    private boolean isTriangle() {
        Map<Integer, Integer> coordinates = new HashMap<>();
        for (Point point : points) {
            coordinates.put(point.getX(), 1 + coordinates.getOrDefault(point.getX(), 0));
            coordinates.put(point.getY(), 1 + coordinates.getOrDefault(point.getY(), 0));
        }
        for (Integer value : coordinates.values()) {
            if (value > 3) {
                return false;
            }
        }
        return true;
    }
}
