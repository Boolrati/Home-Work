package Aston.Lesson_9;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_object.MainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseSeleniumTest {
    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BaseSeleniumPage.setDriver(driver);
        driver.get("https://mts.by");

        try {
            MainPage mainPage = new MainPage(driver);
            WebElement button = mainPage.getCookieAccept();
            button.click();
        } catch (ElementNotInteractableException e) {
            System.out.println("куки не найдены");
        }
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
