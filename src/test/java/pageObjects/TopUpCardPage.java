package pageObjects;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

public class TopUpCardPage {
    public static SelenideElement receiverCardNumberField = $(AppiumBy.xpath("//*[@text='Номер картки']"));

    public static SelenideElement fromCardNumberField = $(AppiumBy.xpath("//*[@text='0000 0000 0000 0000']"));
    public static SelenideElement fromCardExpDateField = $(AppiumBy.xpath("//android.widget.EditText[2]"));
    public static SelenideElement fromCardCvvField = $(AppiumBy.xpath("//android.widget.EditText[3]"));
    public static SelenideElement fromCardCvvInfoDialog = $(AppiumBy.accessibilityId("cvvInfoDialog"));
    public static SelenideElement fromCardErrorMessage = $(AppiumBy.xpath("//*[@text='Будь ласка, перевірте введений номер картки']"));

    public static SelenideElement sumField = $(AppiumBy.xpath("//*[@text='Сума від 1,00 до 29999,00 ₴']"));

    public static SelenideElement transferButton = $(AppiumBy.xpath("//*[@text='Переказати']"));


    @Step("Input receiver card number")
    public static void inputReceiverCardNumber(String receiverCardNumber) {
        receiverCardNumberField.shouldBe(Condition.visible).sendKeys(receiverCardNumber);
    }

    @Step("Input card number")
    public static void inputCardNumber(String cardNumber) {
        fromCardNumberField.shouldBe(Condition.visible).sendKeys(cardNumber);
    }

    @Step("Input exp. date")
    public static void inputExpDate(String expDate){
        fromCardExpDateField.shouldBe(Condition.visible).sendKeys(expDate);
    }

    @Step("Input cvv")
    public static void inputCvv(String cvv){
        fromCardCvvField.shouldBe(Condition.visible).sendKeys(cvv);
    }

    @Step("Input sum")
    public static void inputSum(String sum){
        sumField.shouldBe(Condition.visible).sendKeys(sum);
    }

    @Step("Click 'Transfer' button")
    public static void clickTransferButton(){
        transferButton.shouldBe(Condition.visible).click();
    }




}
