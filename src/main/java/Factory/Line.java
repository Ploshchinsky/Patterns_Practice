package Factory;

public class Line implements Figure {
    private Point[] points;

    public Line(Point[] points) {
        this.points = points;
    }

    @Override
    public Point[] getPoints() {
        System.out.println("It's a Line!");
        return points;
    }
}
