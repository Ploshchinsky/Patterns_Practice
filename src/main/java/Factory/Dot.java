package Factory;

public class Dot implements Figure {
    private Point[] points;

    public Dot(Point[] points) {
        this.points = points;
    }

    @Override
    public Point[] getPoints() {
        System.out.println("It's a Dot!");
        return points;
    }
}
