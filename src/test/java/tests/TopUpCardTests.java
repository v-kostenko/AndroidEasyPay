package tests;

import static constatns.Constants.PHONE;
import static pageObjects.LoginPage.clickContinueButtonTheLoginPage;
import static pageObjects.LoginPage.clickInTheInputPhoneField;
import static pageObjects.LoginPage.inputPhone;
import static pageObjects.PaymentsPage.clickTransferToCardButton;
import static pageObjects.PinCodePage.enterPin;
import static pageObjects.TopUpCardPage.clickTransferButton;
import static pageObjects.TopUpCardPage.inputCardNumber;
import static pageObjects.TopUpCardPage.inputCvv;
import static pageObjects.TopUpCardPage.inputExpDate;
import static pageObjects.TopUpCardPage.inputReceiverCardNumber;
import static pageObjects.TopUpCardPage.inputSum;

import org.testng.annotations.Test;

public class TopUpCardTests extends BaseTest {


    @Test
    public void test1() throws InterruptedException {
        // Login
        clickInTheInputPhoneField();
        inputPhone(PHONE);
        Thread.sleep(1000);
        clickContinueButtonTheLoginPage();
        enterPin();

        // On the main page click clickTransferToCardButton
        clickTransferToCardButton();

        // Fill fields
        inputReceiverCardNumber("1111000011110000");
        inputCardNumber("1234123412341234");
        inputExpDate("1010");
        inputCvv("000");
        inputSum("1");
        clickTransferButton();
    }


}
