package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_object.MainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MtsBy extends BaseSeleniumTest {

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
    public void checkContinueBtn() throws InterruptedException {
        driver.navigate().back();
        MainPage mainPage = new MainPage(driver);
        mainPage.getDropDown().click();
        mainPage.getDropDownFirst().click();
        mainPage.getPhoneNumber().sendKeys("297777777");
        mainPage.getSum().sendKeys("100");
        mainPage.getContinueButton().click();
        //Thread.sleep(5000);
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By frame_locator = By.className("bepaid-iframe");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame_locator));
        //WebElement elementLocated = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("bepaid-iframe")));
        //WebElement elementLocated1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bepaid-iframe")));


        //driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
        WebElement popup = driver.findElement(By.cssSelector("body > app-root > div"));
        assertTrue(popup.isDisplayed());
    }
}