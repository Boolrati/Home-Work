package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckSection extends BaseSeleniumPage{
    @FindBy(xpath = "//div [@class=\"pay__wrapper\"]//h2")
    private WebElement sectionTitle;
}
