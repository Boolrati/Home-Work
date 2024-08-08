package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsBy extends BaseSeleniumTest {
    @Test
    public void check1Title() {
        WebElement element1 = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", element1.getText());
    }

    @Test
    public void check2Logo() {
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
    public void check3Link() {
        String link = driver.findElement(By.linkText("Подробнее о сервисе")).getAttribute("href");
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        String actualLink = driver.getCurrentUrl();
        assertEquals(link, actualLink);
    }

    @Test
    public void check4ContinueBtn(){
        driver.get("https://mts.by");
        Select option = new Select(driver.findElement(By.id("pay")));
        option.selectByValue("Рассрочка");
    }
}
