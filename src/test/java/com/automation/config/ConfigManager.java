package com.automation.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static final Properties properties = new Properties();
    private static ConfigManager instance;

    private ConfigManager() {
        loadProperties();
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    private void loadProperties() {
        String environment = System.getProperty("env", "qa");
        try {
            properties.load(new FileInputStream("src/test/resources/config/" + environment + ".properties"));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file for environment: " + environment, e);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public String getBaseUrl() {
        return getProperty("base.url");
    }

    public String getBrowser() {
        return getProperty("browser");
    }

    public boolean isHeadless() {
        return Boolean.parseBoolean(getProperty("headless"));
    }

    public int getImplicitWait() {
        return Integer.parseInt(getProperty("implicit.wait"));
    }

    public int getPageLoadTimeout() {
        return Integer.parseInt(getProperty("page.load.timeout"));
    }
} 