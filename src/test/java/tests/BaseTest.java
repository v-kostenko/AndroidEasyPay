package tests;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.qameta.allure.selenide.AllureSelenide;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        Configuration.browser = AndroidLocalDriver.class.getName();
        Configuration.timeout = 8000;
        Configuration.browserSize = null;
        open();
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterSuite
    public void afterSuite() {
        closeWebDriver();
    }


}
