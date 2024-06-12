package Bridge;

public class Triangle extends Shape {
    public Triangle(Colored color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
        setIsDrawn(true);
    }
}
