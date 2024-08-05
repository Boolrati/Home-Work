package Aston.Lesson_8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookieAccept {
    public WebDriver driver;

    public CookieAccept(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(id, 'cookie-agree')]")
    private WebElement cookieBtn;

    public void clickCookieBtn() {
        cookieBtn.click();
    }
}
