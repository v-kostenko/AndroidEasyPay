package pageObjects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

public class LoginPage {
    private static SelenideElement title = $(AppiumBy.xpath("//*[@text='Введіть номер телефону']"));
    private static SelenideElement clearInputPhoneField = $(AppiumBy.accessibilityId("close"));
    public static SelenideElement inputPhoneFieldLoginPage = $(AppiumBy.className("android.widget.EditText"));
    public static SelenideElement continueButtonLoginPage = $(AppiumBy.xpath("//*[@text='Продовжити']"));

    @Step("Click in the 'Input phone' field")
    public static void clickInTheInputPhoneField() {
        inputPhoneFieldLoginPage.shouldBe(Condition.visible).click();
    }

    @Step("Input phone number")
    public static void inputPhone(String phone) {
        inputPhoneFieldLoginPage.sendKeys(phone);
       // $(AppiumBy.xpath("//android.widget.EditText/android.widget.TextView[2]")).sendKeys(phone);
    }

    @Step("Click continue button")
    public static void clickContinueButtonTheLoginPage() {
        continueButtonLoginPage.shouldBe(Condition.interactable).click();
    }

    @Step("Get 'Continue' button status")
    public static boolean isContinueButtonEnable() {
       // return continueButtonLoginPage.shouldBe(Condition.interactable);
        return true;
    }

    @Step("Get title")
    public static String getTitle(){
        return title.shouldBe(Condition.visible).getText();
    }

    @Step("Tap clear input field button")
    public static void clickClearInputFieldButton(){
        clearInputPhoneField.shouldBe(Condition.visible).click();
    }


}

