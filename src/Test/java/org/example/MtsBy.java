package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class MtsBy extends BaseSeleniumTest {
    @Test
    public void CheckTitle() {

driver.findElement(By.xpath("//div [@class=\"pay__wrapper\"]//h2"))

        //System.setProperty("webdriver.chrome.driver", "/Downloads/chromedriver.exe");

    }
}
