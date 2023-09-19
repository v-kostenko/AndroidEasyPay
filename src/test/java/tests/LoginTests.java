package tests;

import static com.codeborne.selenide.Selenide.$;

import static constatns.Constants.PHONE;
import static io.qameta.allure.Allure.step;
import static pageObjects.LoginPage.clickContinueButtonTheLoginPage;
import static pageObjects.LoginPage.clickInTheInputPhoneField;
import static pageObjects.LoginPage.continueButtonLoginPage;
import static pageObjects.LoginPage.inputPhone;
import static pageObjects.LoginPage.inputPhoneFieldLoginPage;
import static pageObjects.LoginPage.isContinueButtonEnable;
import static pageObjects.PinCodePage.enterPin;

import com.codeborne.selenide.Condition;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Owner;

public class LoginTests extends BaseTest {

    @Test
    @Owner("Volodymyr Kostenko")
    public void successLogin() throws InterruptedException {
        clickInTheInputPhoneField();
        inputPhone(PHONE);
        Thread.sleep(1000);
        clickContinueButtonTheLoginPage();
        enterPin();
//        step("фвфвф", () -> {
//            //  Assert.assertEquals();
//        });
    }

    @Test
    public void foo() {
        clickInTheInputPhoneField();
        inputPhone("999");
        Assert.assertTrue( isContinueButtonEnable());
        // input less phone number
        // check that continue button is Disable
    }


}
