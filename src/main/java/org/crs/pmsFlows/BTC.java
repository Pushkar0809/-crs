package org.crs.pmsFlows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;




public class BTC {
    public static void btc(ChromeDriver driver) throws InterruptedException {
        driver.get("https://qa-crs.bloomhotels.in");
        driver.navigate().refresh();
        Thread.sleep(2000);

        //SELECT PROPERTY FROM THE LIST
        driver.findElement(By.xpath("//tr[@__gwt_row='1']")).click();
        //START CREATIBG BOOKING
        driver.findElement(By.xpath("//div[text()='new reservation']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@tabindex='0']/input[@type='radio']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='add to reservation']")).click();

        //[ERROR NOTIFICATION] You are been allowed to make back dated reservations because you have SUPER_USER rights
        driver.switchTo().alert();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='search / create']")).click();

        //FOR BTC BOOKING
        //SELECT COMPANY ICON
        By.xpath("//input[@id='gwt-uid-839']").findElement(driver).click();

        //SEARCH GUEST WITH NAME
//        driver.findElement(By.xpath("//input[@class='gwt-SuggestBox']")).sendKeys("Foodies for life 5432");

        //SEARCH GUEST WITH E-MAIL

        driver.findElement(By.xpath("(//input[@class='gwt-TextBox'])[1]")).sendKeys("foodies@gmmail.com");
        driver.findElement(By.xpath("//button[text()='search']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='14']")).click();
        driver.findElement(By.xpath("//button[@class='GH5DEFVCJEB-com-staybloom-gwtUiWidgets-client-uiwidget-action-ButtonCss-ButtonCssResource-enabled']")).click();
        Thread.sleep(5000);

        //SELECT DIFFERENT GUEST THAN BOOKER BY EMAIL
        driver.findElement(By.xpath("//button[@class='gwt-Button' and contains(text(), 'add more guest')]")).click();
        driver.findElement(By.xpath("(//input[@class='gwt-TextBox'])[2]")).sendKeys("pushkar@gmail.com");
        driver.findElement(By.xpath("//button[contains(@class, 'gwt-Button') and text()='search']")).click();
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        driver.findElement(By.xpath("//button[text()='select']")).click();
        Thread.sleep(3000);


        //SELECT BILL TO
        driver.findElement(By.xpath("//select[@class='GH5DEFVCD4-com-staybloom-gwtUiWidgets-client-commonCss-CommonCssResources-CommonCss-inlineFieldValue']/option[2]")).click();


        //SELECT TAG
        driver.findElement(By.xpath("//select[@class='GH5DEFVCD4-com-staybloom-gwtUiWidgets-client-commonCss-CommonCssResources-CommonCss-inlineFieldValue']/option[text()='walk in']")).click();

        //SELECT submit BTC
        driver.findElement(By.xpath("//button[text()='submit BTC']")).click();
        driver.findElement(By.xpath("//button[@type='button' and text()='confirm']")).click();

        //HANDLE CHROME BOOKING CONFIRMATION NOTIFICATION
        Alert alert1 = driver.switchTo().alert();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

    }
}