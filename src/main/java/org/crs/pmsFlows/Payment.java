package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Payment {
    public static void payment(ChromeDriver driver) throws InterruptedException {
//        MORE ACTION IN ARRIVALS TAB
        driver.findElement(By.xpath("//img[@alt='More Actions']")).click();
        Thread.sleep(3000);

//      PAYMENT
        driver.findElement(By.xpath("//h2[text()='Payments']")).click();
        driver.findElement(By.xpath("//button[text()=' Add Payment ']")).click();
        driver.findElement(By.xpath("//span[contains(@class, 'mat-mdc-select-placeholder')]")).click();
//      SELECT MODE OF PAYMENT
        driver.findElement(By.xpath("//mat-option[@id='mat-option-0']")).click();
        driver.findElement(By.xpath("//*[@id='mat-input-4']")).click();
//      SELECT AMOUNT BOX AND ENTER AMOUNT
        driver.findElement(By.xpath("//input[@type='number' and @required]")).sendKeys("151");
//      ENTER REMARKS
        driver.findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys("a");
//      ENTER TRANSACTION ID
        driver.findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("QWERTY");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and text()='Save']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@class='header__icon']")).click();
        Thread.sleep(5000);

    }
}
