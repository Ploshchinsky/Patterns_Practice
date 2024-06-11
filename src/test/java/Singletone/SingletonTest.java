package Singletone;

import Singleton.ConfigManager;
import Singleton.PropertyType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SingletonTest {
    @Test
    public void test1() {
        ConfigManager configManager = ConfigManager.getInstance();
        List<String> expected = List.of("https://localhost:8080/", "sampleTokenForTest", "0918283iiasdi", "randomName");
        List<String> actual = new ArrayList<>();

        for (PropertyType type : PropertyType.values()) {
            actual.add(configManager.getPropertyByKey(type));
        }
        Assertions.assertEquals(expected, actual);
    }
}
