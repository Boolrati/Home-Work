package Aston.Lesson_9;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MTSBy extends BaseSeleniumTest {

    //Task 1

    @Test
    @Order(1)
    public void checkPlaceHolder1() {
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")).click();
        String phoneNumber = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).getAttribute("placeholder");
        assertEquals("Номер телефона", phoneNumber);
        String sum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).getAttribute("placeholder");
        assertEquals("Сумма", sum);
        String email = driver.findElement(By.xpath("//*[@id=\"connection-email\"]")).getAttribute("placeholder");
        assertEquals("E-mail для отправки чека", email);
    }

    @Test
    @Order(2)
    public void checkPlaceHolder2() {
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")).click();
        String phoneNumber1 = driver.findElement(By.cssSelector("input#internet-phone.phone")).getAttribute("placeholder");
        assertEquals("Номер абонента", phoneNumber1);
        String sum1 = driver.findElement((By.cssSelector("input#connection-sum.total_rub"))).getAttribute("placeholder");
        assertEquals("Сумма", sum1);
        String email1 = driver.findElement(By.cssSelector("input#connection-email.email")).getAttribute("placeholder");
        assertEquals("E-mail для отправки чека", email1);
    }

    @Test
    @Order(3)
    public void checkPlaceHolder3() {
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p")).click();
        String score = driver.findElement(By.cssSelector("input#score-instalment.score")).getAttribute("placeholder");
        assertEquals("Номер счета на 44", score);
        String sum2 = driver.findElement((By.cssSelector("input#instalment-sum.total_rub"))).getAttribute("placeholder");
        assertEquals("Сумма", sum2);
        String email2 = driver.findElement(By.cssSelector("input#instalment-email.email")).getAttribute("placeholder");
        assertEquals("E-mail для отправки чека", email2);
    }

    @Test
    @Order(4)
    public void checkPlaceHolder4() {
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p")).click();
        String score1 = driver.findElement(By.cssSelector("input#score-arrears.score")).getAttribute("placeholder");
        assertEquals("Номер счета на 2073", score1);
        String sum3 = driver.findElement((By.cssSelector("input#arrears-sum.total_rub"))).getAttribute("placeholder");
        assertEquals("Сумма", sum3);
        String email3 = driver.findElement(By.cssSelector("input#arrears-email.email")).getAttribute("placeholder");
        assertEquals("E-mail для отправки чека", email3);
    }

    //Task 2

    @Test
    @Order(5)
    public void checkSumCorrectness() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p")).click();
        driver.findElement(By.xpath("//*[@id=\"connection-phone\"]")).sendKeys("297777777");
        driver.findElement(By.xpath("//*[@id=\"connection-sum\"]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
        Thread.sleep(5000);
        driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
        WebElement headerSum = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]"));
        assertEquals("100.00 BYN", headerSum.getText());
        WebElement buttonSum = driver.findElement(By.cssSelector("button.colored.disabled"));
        assertEquals("Оплатить 100.00 BYN", buttonSum.getText());
        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span"));
        assertEquals("Оплата: Услуги связи Номер:375297777777", phoneNumber.getText());
    }

    @Test
    @Order(6)
    //Test
    public void checkCreditCardFields() {
        WebElement cardNumber = driver.findElement(By.cssSelector("label.ng-tns-c46-1.ng-star-inserted"));
        assertEquals("Номер карты", cardNumber.getText());
        boolean cardVisa = driver.findElement((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]"))).isDisplayed();
        assertTrue(cardVisa);
        boolean cardMasterCard = driver.findElement((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]"))).isDisplayed();
        assertTrue(cardMasterCard);
        boolean cardBelKart = driver.findElement((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[3]"))).isDisplayed();
        assertTrue(cardBelKart);
        boolean cardMir = driver.findElement((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div"))).isDisplayed();
        assertTrue(cardMir);
        WebElement cardValidUntil = driver.findElement(By.cssSelector("label.ng-tns-c46-4.ng-star-inserted"));
        assertEquals("Срок действия", cardValidUntil.getText());
        WebElement cardCVC = driver.findElement(By.cssSelector("label.ng-tns-c46-5.ng-star-inserted"));
        assertEquals("CVC", cardCVC.getText());
        WebElement cardHolderName = driver.findElement(By.cssSelector("label.ng-tns-c46-3.ng-star-inserted"));
        assertEquals("Имя держателя (как на карте)", cardHolderName.getText());
    }

    @Test
    @Order(7)
    public void checkCvcTooltip() {
        WebElement element = driver.findElement(By.cssSelector("svg-icon.alert-icon.ng-tns-c61-0"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
        WebElement tooltipElement = driver.findElement(By.cssSelector("span.tooltip.ng-tns-c61-0.show-tooltip.ng-star-inserted"));
        String toolTipText = tooltipElement.getText();
        assertEquals("Три цифры с оборотной стороны карты", toolTipText);
    }
}
