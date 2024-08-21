package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BaseSeleniumPage.setDriver(driver);
        driver.get("https://mts.by");
        WebElement button = driver.findElement(By.id("cookie-agree"));
        button.click();

    }

    @AfterAll
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
