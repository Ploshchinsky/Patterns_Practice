package Bridge;

public class RedColor implements Colored {
    @Override
    public void fill() {
        System.out.println("The figure is painted red");
    }
}
