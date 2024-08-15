package Aston.Lesson_9;

import org.openqa.selenium.WebDriver;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}
//test