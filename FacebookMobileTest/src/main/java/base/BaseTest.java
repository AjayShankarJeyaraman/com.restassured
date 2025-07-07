package base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseTest {
    public static AndroidDriver<MobileElement> driver;

    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pixel_4_API_30"); // Change if needed
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.facebook.katana");
        caps.setCapability("appActivity", "com.facebook.katana.LoginActivity");
        caps.setCapability("noReset", true);

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
