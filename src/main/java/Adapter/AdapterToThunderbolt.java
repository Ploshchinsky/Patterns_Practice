package Adapter;

public class AdapterToThunderbolt implements Thunderbolt {
    private Display display;

    public AdapterToThunderbolt(Display display) {
        this.display = display;
    }

    @Override
    public void connectThunderbolt() {
        display.connectHDMI();
        System.out.print(" ---> ");
        System.out.print("[" + display.getBrand() + "] Thunderbolt connected");
    }
}
