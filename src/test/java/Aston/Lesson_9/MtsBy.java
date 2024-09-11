package Aston.Lesson_9;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_object.MainPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MtsBy extends BaseSeleniumTest {

    final static String PHONE_NUMBER_TEXT = "Номер телефона";
    final static String PHONE_NUMBER = "297777777";
    final static String RUBLES = "100";
    final static String SUM_TEXT = "Сумма";
    final static String EMAIL = "E-mail для отправки чека";
    final static String CONNECTION_PHONE_NUMBER = "Номер абонента";
    final static String INSTALMENTS_NUMBER = "Номер счета на 44";
    final static String ARREARS_NUMBER = "Номер счета на 2073";
    final static String POPUP_RUBLES_BYN = "100.00 BYN";
    final static String POPUP_CONFIRM_BUTTON_TEXT = "Оплатить 100.00 BYN";
    final static String POPUP_PAYMENT_DETAILS = "Оплата: Услуги связи Номер:375297777777";
    final static String POPUP_CARD_NUMBER_PLACEHOLDER = "Срок действия";
    final static String POPUP_CARD_CVC_PLACEHOLDER = "CVC";
    final static String POPUP_CARD_HOLDER_NAME = "Имя держателя (как на карте)";
    final static String POPUP_CARD_CVC_TEXT = "Три цифры с оборотной стороны карты";
    //Task 1

    @Test
    @Order(1)
    public void checkPlaceHolder1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getDropDown().click();
        mainPage.getDropDownFirst().click();
        assertEquals(PHONE_NUMBER_TEXT, mainPage.getConnectionPhoneNumber().getAttribute("placeholder"));
        assertEquals(SUM_TEXT, mainPage.getConnectionSum().getAttribute("placeholder"));
        assertEquals(EMAIL, mainPage.getConnectionEmail().getAttribute("placeholder"));
    }

    @Test
    @Order(2)
    public void checkPlaceHolder2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getDropDown().click();
        mainPage.getDropDownSecond().click();
        assertEquals(CONNECTION_PHONE_NUMBER, mainPage.getInternetPhoneNumber().getAttribute("placeholder"));
        assertEquals(SUM_TEXT, mainPage.getInternetSum().getAttribute("placeholder"));
        assertEquals(EMAIL, mainPage.getInternetEmail().getAttribute("placeholder"));
    }

    @Test
    @Order(3)
    public void checkPlaceHolder3() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getDropDown().click();
        mainPage.getDropDownThird().click();
        assertEquals(INSTALMENTS_NUMBER, mainPage.getInstalmentPhoneNumber().getAttribute("placeholder"));
        assertEquals(SUM_TEXT, mainPage.getInstalmentSum().getAttribute("placeholder"));
        assertEquals(EMAIL, mainPage.getInstalmentEmail().getAttribute("placeholder"));
    }

    @Test
    @Order(4)
    public void checkPlaceHolder4() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getDropDown().click();
        mainPage.getDropDownFourth().click();
        assertEquals(ARREARS_NUMBER, mainPage.getArrearsNumber().getAttribute("placeholder"));
        assertEquals(SUM_TEXT, mainPage.getArrearsSum().getAttribute("placeholder"));
        assertEquals(EMAIL, mainPage.getArrearsEmail().getAttribute("placeholder"));
    }

    //Task 2

    @Test
    @Order(5)
    public void checkSumCorrectness() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getDropDown().click();
        mainPage.getDropDownFirst().click();
        mainPage.getConnectionPhoneNumber().sendKeys(PHONE_NUMBER);
        mainPage.getConnectionSum().sendKeys(RUBLES);
        mainPage.getContinueButton().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainPage.getIframe()));
        wait.until(ExpectedConditions.visibilityOf(mainPage.getIframeByTag()));
        assertEquals(POPUP_RUBLES_BYN, mainPage.getPopupHeaderSum().getText());
        assertEquals(POPUP_CONFIRM_BUTTON_TEXT, mainPage.getPopupConfirmButtonText().getText());
        assertEquals(POPUP_PAYMENT_DETAILS, mainPage.getPopupPaymentDetailsText().getText());
    }

    @Test
    @Order(6)
    public void checkCreditCardFields() {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Номер карты", mainPage.getPopupCardNumberPlaceholder().getText());
        assertTrue(mainPage.getPopupVisaIcon().isDisplayed());
        assertTrue(mainPage.getPopupMasterCardIcon().isDisplayed());
        assertTrue(mainPage.getPopupBelKartIcon().isDisplayed());
        assertTrue(mainPage.getPopupCardMirIcon().isDisplayed());
        assertEquals(POPUP_CARD_NUMBER_PLACEHOLDER, mainPage.getPopupCardValidUntil().getText());
        assertEquals(POPUP_CARD_CVC_PLACEHOLDER, mainPage.getPopupCardCvc().getText());
        assertEquals(POPUP_CARD_HOLDER_NAME, mainPage.getPopupCardHolderName().getText());
    }

    @Test
    @Order(7)
    public void checkCvcTooltip() {
        MainPage mainPage = new MainPage(driver);
        Actions builder = new Actions(driver);
        builder.moveToElement(mainPage.getPopupCvcTooltip()).build().perform();
        assertEquals(POPUP_CARD_CVC_TEXT, mainPage.getPopupCvcTooltipText().getText());
    }
}
