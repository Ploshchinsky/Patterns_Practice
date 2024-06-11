package Decorator;

import Factory.Point;
import Factory.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
    @Test
    public void test1() {
        Triangle triangle = new Triangle(new Point[]{
                new Point(1, 1), new Point(1, 7), new Point(4, 6)});

        String expected = "14,993";
        String actual = String.format("%.3f", FigurePerimeter.getPerimeter(triangle));
        Assertions.assertEquals(expected, actual);
    }
}
