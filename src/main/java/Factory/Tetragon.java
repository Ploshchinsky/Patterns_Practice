package Factory;

import java.util.HashMap;
import java.util.Map;

public class Tetragon implements Figure {
    private Point[] points;

    public Tetragon(Point[] points) {
        this.points = points;
    }

    @Override
    public Point[] getPoints() {
        if (!isTetragon()) {
            return null;
        }
        System.out.println("It's a Tetragon!");
        return points;
    }

    private boolean isTetragon() {
        Map<Integer, Integer> coordinates = new HashMap<>();

        for (Point point : points) {
            coordinates.put(point.getX(), coordinates.getOrDefault(point.getX(), 0) + 1);
            coordinates.put(point.getY(), coordinates.getOrDefault(point.getY(), 0) + 1);
        }

        for (Integer value : coordinates.values()) {
            if (value > 3) {
                return false;
            }
        }
        return true;
    }
}
