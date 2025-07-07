package com.automation.steps;

import com.automation.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    
    private static final Logger logger = LogManager.getLogger(Hooks.class);
    
    @Before
    public void setUp(Scenario scenario) {
        logger.info("Starting scenario: " + scenario.getName());
        logger.info("Scenario tags: " + scenario.getSourceTagNames());
    }
    
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            logger.error("Scenario failed: " + scenario.getName());
            captureScreenshot(scenario);
        } else {
            logger.info("Scenario passed: " + scenario.getName());
        }
        
        // Clean up WebDriver after each scenario
        DriverManager.quitDriver();
        logger.info("Scenario completed: " + scenario.getName());
    }
    
    private void captureScreenshot(Scenario scenario) {
        try {
            TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot");
            logger.info("Screenshot captured for failed scenario");
        } catch (Exception e) {
            logger.error("Failed to capture screenshot: " + e.getMessage());
        }
    }
} 