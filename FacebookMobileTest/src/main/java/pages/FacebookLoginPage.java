package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FacebookLoginPage {
    AndroidDriver<MobileElement> driver;

    public FacebookLoginPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElementById("com.facebook.katana:id/login_username").sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElementById("com.facebook.katana:id/login_password").sendKeys(password);
    }

    public void clickLogin() {
        driver.findElementById("com.facebook.katana:id/login_login").click();
    }
}
