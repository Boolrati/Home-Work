package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;
    @BeforeAll
    public static void CookieAccept() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.id("cookie-agree"));
        button.click();
    }

    @AfterAll
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
