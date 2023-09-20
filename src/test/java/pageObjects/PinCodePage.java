package pageObjects;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

public class PinCodePage {
    public static SelenideElement zeroButton = $(AppiumBy.id("ua.easypay.clientandroid:id/key0"));
    public static SelenideElement oneButton = $(AppiumBy.id("ua.easypay.clientandroid:id/key1"));


    @Step("Input PIN 0000")
    public static void enterPin() {
        for (int i = 0; i < 4; i++) {
            oneButton.shouldBe(Condition.interactable).click();
        }
    }


}
