package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(id = "cookie-agree")
    private WebElement cookieAccept;

    public WebElement getCookieAccept() {
        return cookieAccept;
    }

    @FindBy(xpath = "//div[@class='pay__wrapper']/h2")
    private WebElement paySectionTitleLocator;

    public WebElement getPaySectionTitleLocator() {
        return paySectionTitleLocator;
    }

    @FindBy(xpath = "//img[@alt='Visa']")
    private WebElement visaIconLocator;

    public WebElement getVisaIconLocator() {
        return visaIconLocator;
    }

    @FindBy(xpath = "//img[@alt='Verified By Visa']")
    private WebElement visaVerifiedIconLocator;

    public WebElement getVisaVerifiedIconLocator() {
        return visaVerifiedIconLocator;
    }

    @FindBy(xpath = "//img[@alt='MasterCard']")
    private WebElement masterCardIconLocator;

    public WebElement getMasterCardIconLocator() {
        return masterCardIconLocator;
    }

    @FindBy(xpath = "//img[@alt='MasterCard Secure Code']")
    private WebElement masterCardSecureIconLocator;

    public WebElement getMasterCardSecureIconLocator() {
        return masterCardSecureIconLocator;
    }

    @FindBy(xpath = "//img[@alt='Белкарт']")
    private WebElement belCardIconLocator;

    public WebElement getBelCardIconLocator() {
        return belCardIconLocator;
    }

    @FindBy(linkText = "Подробнее о сервисе")
    private WebElement link;

    public WebElement getLink() {
        return link;
    }

    @FindBy(css = "div.select__wrapper")
    private WebElement dropDown;

    public WebElement getDropDown() {
        return dropDown;
    }

    @FindBy(xpath = "//*[@id=\"pay-section\"]//li[1]")
    private WebElement dropDownFirst;

    public WebElement getDropDownFirst() {
        return dropDownFirst;
    }

    @FindBy(id = "connection-phone")
    private WebElement phoneNumber;

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    @FindBy(id = "connection-sum")
    private WebElement sum;

    public WebElement getSum() {
        return sum;
    }

    @FindBy(xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }

    @FindBy(className = "bepaid-iframe")
    private WebElement iframe;

    public WebElement getIframe() {
        return iframe;
    }

    @FindBy(tagName = "app-payment-container")
    private WebElement iframeByTag;

    public WebElement getIframeByTag() {
        return iframeByTag;
    }

    @FindBy(css = "body > app-root > div")
    private WebElement iframeByCss;

    public WebElement getIframeByCss() {
        return iframeByCss;
    }

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
