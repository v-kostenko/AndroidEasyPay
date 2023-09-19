package pageObjects;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

public class PaymentsPage {

    public static SelenideElement requisitesPaymentButton = $(AppiumBy.id("ua.easypay.clientandroid:id/btnRequisitesPayment"));

    // ---
    public static SelenideElement profileButton = $(AppiumBy.id("ua.easypay.clientandroid:id/profileIcon"));


    @Step("Click on the 'Profile' button")
    public static void clickOnTheProfileButton(){
        profileButton.shouldBe(Condition.visible).click();
    }

}
