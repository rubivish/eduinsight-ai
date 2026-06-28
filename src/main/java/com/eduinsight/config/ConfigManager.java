package com.eduinsight.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.eduinsight.util.Constants;

public class ConfigManager {

    private static ConfigManager instance;

    private final Properties properties;

    private ConfigManager() {

        properties = new Properties();

        try (InputStream input =
                getClass().getClassLoader()
                        .getResourceAsStream(Constants.CONFIG_FILE)) {

            if (input == null) {
                throw new RuntimeException("config.properties not found");
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Unable to load configuration", e);
        }
    }

    public static ConfigManager getInstance() {

        if (instance == null) {
            instance = new ConfigManager();
        }

        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

}