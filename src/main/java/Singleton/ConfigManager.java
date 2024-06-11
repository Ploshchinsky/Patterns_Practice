package Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Properties;

public class ConfigManager {
    private static ConfigManager instance;
    private static Properties properties;
    private static final Path PROPERTIES_PATH = Path.of("src/main/java/Singleton/src/config.properties");

    private ConfigManager() {
        properties = new Properties();
        loadProperties(properties);
    }

    private void loadProperties(Properties properties) {
        try (InputStream inputStream = new FileInputStream(new File(PROPERTIES_PATH.toString()))) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }


    public String getPropertyByKey(PropertyType propertyType) {
        return properties.getProperty(propertyType.getInfo());
    }
}
