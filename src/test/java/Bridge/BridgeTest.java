package Bridge;

import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    public void test1() {
        Shape triangle = new Triangle(new RedColor());
        Shape square = new Square(new BlackColor());

        triangle.draw();
        triangle.fill();
        square.draw();
        square.fill();

        System.out.println("----");
        System.out.println(triangle.getInfo());
        System.out.println(square.getInfo());
    }
}
