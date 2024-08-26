package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_object.MainPage;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MtsBy extends BaseSeleniumTest {
    static final String NUMBER = "297777777";
    static final String RUBLES = "100";

    @Test
    @Order(1)
    public void checkTitle() {
        MainPage mainPage = new MainPage(driver);
        assertEquals("Онлайн пополнение\nбез комиссии", mainPage.getPaySectionTitleLocator().getText());
    }

    @Test
    @Order(2)
    public void checkLogo() {
        MainPage mainPage = new MainPage(driver);
        assertTrue(mainPage.getVisaIconLocator().isDisplayed());
        assertTrue(mainPage.getVisaVerifiedIconLocator().isDisplayed());
        assertTrue(mainPage.getMasterCardIconLocator().isDisplayed());
        assertTrue(mainPage.getMasterCardSecureIconLocator().isDisplayed());
        assertTrue(mainPage.getBelCardIconLocator().isDisplayed());
    }

    @Test
    @Order(3)
    public void checkLink() {
        MainPage mainPage = new MainPage(driver);
        String linkText = mainPage.getLink().getAttribute("href");
        mainPage.getLink().click();
        String actualLink = driver.getCurrentUrl();
        assertEquals(linkText, actualLink);
    }

    @Test
    @Order(4)
    public void checkContinueBtn() {
        driver.navigate().back();
        MainPage mainPage = new MainPage(driver);
        mainPage.getDropDown().click();
        mainPage.getDropDownFirst().click();
        mainPage.getPhoneNumber().sendKeys(NUMBER);
        mainPage.getSum().sendKeys(RUBLES);
        mainPage.getContinueButton().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mainPage.getIframe()));
        wait.until(ExpectedConditions.visibilityOf(mainPage.getIframeByTag()));
        WebElement popup = mainPage.getIframeByCss();
        assertTrue(popup.isDisplayed());

    }
}