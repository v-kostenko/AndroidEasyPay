package tests;

import static com.codeborne.selenide.Selenide.$;

import static constatns.Constants.PHONE;
import static io.qameta.allure.Allure.step;
import static pageObjects.LoginPage.clickClearInputFieldButton;
import static pageObjects.LoginPage.clickContinueButtonTheLoginPage;
import static pageObjects.LoginPage.clickInTheInputPhoneField;
import static pageObjects.LoginPage.continueButtonLoginPage;
import static pageObjects.LoginPage.getTitle;
import static pageObjects.LoginPage.inputPhone;
import static pageObjects.LoginPage.inputPhoneFieldLoginPage;
import static pageObjects.LoginPage.isContinueButtonEnable;
import static pageObjects.PinCodePage.enterPin;

import com.codeborne.selenide.Condition;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
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
//        step("", () -> {
//            //  Assert.assertEquals();
//        });
    }

    @Test
    public void checkContinueButtonStatus() {
        clickInTheInputPhoneField();
        inputPhone("999");
        Assert.assertEquals(getTitle(), "Введіть номер телефону");
        Assert.assertTrue(isContinueButtonEnable());
    }


    @Test
    public void clearInputField() {
        inputPhone("999999999");
        // check that 'Continue' button is clickable
        clickClearInputFieldButton();
        // check that 'Continue' button is not clickable
    }


}
