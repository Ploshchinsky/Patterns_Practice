package Bridge;

public class BlackColor implements Colored{

    @Override
    public void fill() {
        System.out.println("The figure is painted black");
    }
}
