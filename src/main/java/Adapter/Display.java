package Adapter;

public class Display implements HDMI {
    private String brand;

    public Display(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void connectHDMI() {
        System.out.print("[" + brand + "] HDMI connected");
    }
}
