package org.example;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MtsBy extends BaseSeleniumTest {
    @Test
    @Order(1)
    public void checkATitle() {
        WebElement element1 = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", element1.getText());
    }

    @Test
    @Order(2)
    public void checkBLogo() {
        boolean visa = driver.findElement((By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"))).isDisplayed();
        assertTrue(visa);
        boolean visaVerified = driver.findElement((By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img"))).isDisplayed();
        assertTrue(visaVerified);
        boolean masterCard = driver.findElement((By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"))).isDisplayed();
        assertTrue(masterCard);
        boolean masterCardSecure = driver.findElement((By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img"))).isDisplayed();
        assertTrue(masterCardSecure);
        boolean belCard = driver.findElement((By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"))).isDisplayed();
        assertTrue(belCard);
    }

    @Test
    @Order(3)
    public void checkCLink() {
        String link = driver.findElement(By.linkText("Подробнее о сервисе")).getAttribute("href");
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        String actualLink = driver.getCurrentUrl();
        assertEquals(link, actualLink);
    }

    @Test
    @Order(4)
    public void checkDContinueBtn() throws InterruptedException {
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")).click();
        driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys("297777777");
        driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
        Thread.sleep(5000);
        //вот здесь я намучался с этим тестом. implicitlyWait оказалось не работает с элементами которые присутствуют на странице, но не проявляются.
        driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
        WebElement popup = driver.findElement(By.cssSelector("body > app-root > div"));
        assertTrue(popup.isDisplayed());
    }
}
