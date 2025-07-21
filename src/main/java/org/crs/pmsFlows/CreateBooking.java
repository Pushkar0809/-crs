package org.crs.pmsFlows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateBooking {
    public static void createBooking(ChromeDriver driver) throws InterruptedException {
        driver.get("https://qa-crs.bloomhotels.in");
        driver.navigate().refresh();
        Thread.sleep(2000);
        /** LOGOUT **/
        driver.findElement(By.xpath("//button[text()='Logout']")).click();

        driver.findElement(By.xpath("//tr[@__gwt_row='1']")).click();
        driver.findElement(By.xpath("//div[text()='new reservation']")).click();
        driver.findElement(By.xpath("//div[@tabindex='0']/input[@type='radio']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='add to reservation']")).click();

        /**[ERROR NOTIFICATION] You are been allowed to make back dated reservations because you have SUPER_USER rights.**/
        driver.switchTo().alert();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='search / create']")).click();


        /**SEARCH GUEST WITH NAME**/
//        driver.findElement(By.xpath("//input[@class='gwt-SuggestBox']")).sendKeys("pushkar singh");

        /** SEARCH GUEST WITH E-MAIL**/
        driver.findElement(By.xpath("(//input[@class='gwt-TextBox'])[1]")).sendKeys("rs45@gmail.com");
        driver.findElement(By.xpath("//button[text()='search']")).click();

        //SELECT DIFFERENT GUEST THAN BOOKER BY EMAIL
//        driver.findElement(By.xpath("//button[@class='gwt-Button' and contains(text(), 'add more guest')]")).click();
//        driver.findElement(By.xpath("(//input[@class='gwt-TextBox'])[2]")).sendKeys("kl1@gmail.com");
//        driver.findElement(By.xpath("//button[contains(@class, 'gwt-Button') and text()='search']")).click();
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
        driver.findElement(By.xpath("//button[text()='select']")).click();
        Thread.sleep(3000);

        /** SELECT FIRST GUEST FROM THE LIST **/
        driver.findElement(By.xpath("//div[@style='float: left; width: 15px; padding-left: 5px; padding-right: 0px;']//input[@type='radio']")).click();
        driver.findElement(By.xpath("//button[@class='GH5DEFVCJEB-com-staybloom-gwtUiWidgets-client-uiwidget-action-ButtonCss-ButtonCssResource-enabled']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//select[@class='GH5DEFVCD4-com-staybloom-gwtUiWidgets-client-commonCss-CommonCssResources-CommonCss-inlineFieldValue']/option[text()='walk in']")).click();

        /** SELECT PAY AT HOTEL **/
        driver.findElement(By.xpath("//button[text()='submit pay at hotel']")).click();
        driver.findElement(By.xpath("//button[@type='button' and text()='confirm']")).click();

        /** HANDLE CHROME BOOKING CONFIRMATION NOTIFICATION **/
        Alert alert1 = driver.switchTo().alert();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

        /** LOGOUT **/
        driver.findElement(By.xpath("//button[text()='Logout']")).click();



    }
}
