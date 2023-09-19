package tests;

import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

import static io.appium.java_client.remote.MobileCapabilityType.APP;
import static io.appium.java_client.remote.MobileCapabilityType.AUTOMATION_NAME;
import static io.appium.java_client.remote.MobilePlatform.ANDROID;

import com.codeborne.selenide.WebDriverProvider;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.Nonnull;

import io.appium.java_client.android.AndroidDriver;

public class AndroidLocalDriver implements WebDriverProvider {

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities desiredCapabilities = new MutableCapabilities();
        desiredCapabilities.merge(capabilities);

        desiredCapabilities.setCapability(PLATFORM_NAME, ANDROID);
        desiredCapabilities.setCapability(AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(APP, "/Users/mac/IdeaProjects/Android/src/test/resources/app/app-debug.apk");
        desiredCapabilities.setCapability("deviceName", "Pixel 5 API 30");

        //  desiredCapabilities.setCapability("ignoreHiddenApiPolicyError", true);
        //  desiredCapabilities.setCapability(UDID, "RZ8T60K44TH");

//        desiredCapabilities.setCapability(APP_PACKAGE, appPackage(environment));
//        desiredCapabilities.setCapability(APP_ACTIVITY, appActivity(environment));

// desiredCapabilities.setCapability("noReset", true);
// desiredCapabilities.setCapability("fullReset", false);
        return new AndroidDriver(getAppiumServerUrl(), desiredCapabilities);
    }

    public static URL getAppiumServerUrl() {
        try {
            String appiumUrl = System.getProperty("appiumUrl", "http://127.0.0.1:4723/");
            return new URL("http://127.0.0.1:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}

