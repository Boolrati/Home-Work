package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

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
    private WebElement connectionPhoneNumber;

    public WebElement getConnectionPhoneNumber() {
        return connectionPhoneNumber;
    }

    @FindBy(id = "connection-sum")
    private WebElement connectionSum;

    public WebElement getConnectionSum() {
        return connectionSum;
    }

    @FindBy(id = "connection-email")
    private WebElement connectionEmail;

    public WebElement getConnectionEmail() {
        return connectionEmail;
    }

    @FindBy(xpath = "//*[@id=\"pay-section\"]//li[2]")
    private WebElement dropDownSecond;

    public WebElement getDropDownSecond() {
        return dropDownSecond;
    }

    @FindBy(id = "connection-phone")
    private WebElement internetPhoneNumber;

    public WebElement getInternetPhoneNumber() {
        return internetPhoneNumber;
    }

    @FindBy(id = "connection-sum")
    private WebElement internetSum;

    public WebElement getInternetSum() {
        return internetSum;
    }

    @FindBy(id = "connection-email")
    private WebElement internetEmail;

    public WebElement getInternetEmail() {
        return internetEmail;
    }

    @FindBy(xpath = "//*[@id=\"pay-section\"]//li[3]")
    private WebElement dropDownThird;

    public WebElement getDropDownThird() {
        return dropDownThird;
    }

    @FindBy(id = "score-instalment")
    private WebElement instalmentPhoneNumber;

    public WebElement getInstalmentPhoneNumber() {
        return instalmentPhoneNumber;
    }

    @FindBy(id = "instalment-sum")
    private WebElement instalmentSum;

    public WebElement getInstalmentSum() {
        return instalmentSum;
    }

    @FindBy(id = "connection-email")
    private WebElement instalmentEmail;

    public WebElement getInstalmentEmail() {
        return instalmentEmail;
    }

    @FindBy(xpath = "//*[@id=\"pay-section\"]//li[4]")
    private WebElement dropDownFourth;

    public WebElement getDropDownFourth() {
        return dropDownFourth;
    }

    @FindBy(id = "score-arrears")
    private WebElement arrearsNumber;

    public WebElement getArrearsNumber() {
        return arrearsNumber;
    }

    @FindBy(id = "arrears-sum")
    private WebElement arrearsSum;

    public WebElement getArrearsSum() {
        return arrearsSum;
    }

    @FindBy(id = "connection-email")
    private WebElement arrearsEmail;

    public WebElement getArrearsEmail() {
        return arrearsEmail;
    }

    @FindBy(xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



}
