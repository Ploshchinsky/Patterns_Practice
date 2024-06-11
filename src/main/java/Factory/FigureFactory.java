package Factory;

public class FigureFactory {
    public static Figure getFigure(Point[] points) {
        int pointsCount = points.length;
        Figure result = null;
        switch (pointsCount) {
            case 0:
                System.out.println("Points is empty!");
                break;
            case 1:
                result = new Dot(points);
                break;
            case 2:
                result = new Line(points);
                break;
            case 3:
                result = new Triangle(points);
                break;
            case 4:
                result = new Tetragon(points);
                break;
        }
        return result;
    }
}
