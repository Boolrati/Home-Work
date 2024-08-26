package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(id = "cookie-agree")
    private WebElement cookieAccept;

    public WebElement getCookieAccept() {
        return cookieAccept;
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

    @FindBy(id = "internet-phone")
    private WebElement internetPhoneNumber;

    public WebElement getInternetPhoneNumber() {
        return internetPhoneNumber;
    }

    @FindBy(id = "internet-sum")
    private WebElement internetSum;

    public WebElement getInternetSum() {
        return internetSum;
    }

    @FindBy(id = "internet-email")
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

    @FindBy(xpath = "//app-payment-container/section/div/div/div[1]/span[1]")
    private WebElement popupHeaderSum;

    public WebElement getPopupHeaderSum() {
        return popupHeaderSum;
    }

    @FindBy(css = "button.colored.disabled")
    private WebElement popupConfirmButtonText;

    public WebElement getPopupConfirmButtonText() {
        return popupConfirmButtonText;
    }

    @FindBy(xpath = "//app-payment-container/section/div/div/div[2]/span")
    private WebElement popupPaymentDetailsText;

    public WebElement getPopupPaymentDetailsText() {
        return popupPaymentDetailsText;
    }

    @FindBy(css = "label.ng-tns-c46-1.ng-star-inserted")
    private WebElement popupCardNumberPlaceholder;

    public WebElement getPopupCardNumberPlaceholder() {
        return popupCardNumberPlaceholder;
    }

    @FindBy(xpath = "//app-input/div/div/div[2]/div/div/img[1]")
    private WebElement popupVisaIcon;

    public WebElement getPopupVisaIcon() {
        return popupVisaIcon;
    }

    @FindBy(xpath = "//app-input/div/div/div[2]/div/div/img[2]")
    private WebElement popupMasterCardIcon;

    public WebElement getPopupMasterCardIcon() {
        return popupMasterCardIcon;
    }

    @FindBy(xpath = "//app-input/div/div/div[2]/div/div/img[3]")
    private WebElement popupBelKartIcon;

    public WebElement getPopupBelKartIcon() {
        return popupBelKartIcon;
    }

    @FindBy(xpath = "//app-input/div/div/div[2]/div/div/div")
    private WebElement popupCardMirIcon;

    public WebElement getPopupCardMirIcon() {
        return popupCardMirIcon;
    }

    @FindBy(css = "label.ng-tns-c46-4.ng-star-inserted")
    private WebElement popupCardValidUntil;

    public WebElement getPopupCardValidUntil() {
        return popupCardValidUntil;
    }

    @FindBy(css = "label.ng-tns-c46-5.ng-star-inserted")
    private WebElement popupCardCvc;

    public WebElement getPopupCardCvc() {
        return popupCardCvc;
    }

    @FindBy(css = "label.ng-tns-c46-3.ng-star-inserted")
    private WebElement popupCardHolderName;

    public WebElement getPopupCardHolderName() {
        return popupCardHolderName;
    }

    @FindBy(css = "svg-icon.alert-icon.ng-tns-c61-0")
    private WebElement popupCvcTooltip;

    public WebElement getPopupCvcTooltip() {
        return popupCvcTooltip;
    }

    @FindBy(css = "span.tooltip.ng-tns-c61-0.show-tooltip.ng-star-inserted")
    private WebElement popupCvcTooltipText;

    public WebElement getPopupCvcTooltipText() {
        return popupCvcTooltipText;
    }

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
