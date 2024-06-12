package Bridge;

public abstract class Shape {
    private Colored colored;
    private boolean isDrawn = false;
    private boolean isColored = false;

    public Shape(Colored color) {
        this.colored = color;
    }

    abstract public void draw();

    public void fill() {
        isColored = true;
        colored.fill();
    }

    public void setIsDrawn(boolean isDrawn) {
        this.isDrawn = isDrawn;
    }

    public String getInfo() {
        return "isDrawn =" + isDrawn + " isColored = " + isColored;
    }
}
