package Adapter;

import org.junit.jupiter.api.Test;

public class AdapterTest {
    @Test
    public void test1() {
        Display display = new Display("Alien");
        System.out.println("Simple HDMI connection:");
        display.connectHDMI();
        System.out.println("\n------");
        System.out.println("Connection display to Thunderbolt with adapter:");
        AdapterToThunderbolt adapter = new AdapterToThunderbolt(display);
        adapter.connectThunderbolt();
        System.out.println("\n-----");
    }
}
