package Factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FactoryTest {
    @Test
    public void test1() {
        Point first = new Point(2, 2);
        Dot dot = new Dot(new Point[]{first});
        System.out.println(Arrays.toString(dot.getPoints()));

        Point second = new Point(2, 5);
        Line line = new Line(new Point[]{first, second});
        System.out.println(Arrays.toString(line.getPoints()));

        Point third = new Point(4, 1);
        Triangle triangle = new Triangle(new Point[]{first, second, third});
        System.out.println(Arrays.toString(triangle.getPoints()));

        Point fourth = new Point(5, 1);
        Tetragon tetragon = new Tetragon(new Point[]{first, second, third, fourth});
        System.out.println(Arrays.toString(tetragon.getPoints()));

        Point[] points = {first, second, third, fourth};
        Figure figure = FigureFactory.getFigure(points);
        System.out.println(Arrays.toString(figure.getPoints()));

        Assertions.assertEquals(Arrays.toString(tetragon.getPoints()), Arrays.toString(figure.getPoints()));
    }
}
