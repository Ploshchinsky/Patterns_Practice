package Bridge;

public class Square extends Shape {
    public Square(Colored color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
        setIsDrawn(true);
    }
}
