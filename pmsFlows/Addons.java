package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addons {
    public static void addons(ChromeDriver driver) throws InterruptedException {

//     MORE ACTION IN ARRIVALS TAB
        driver.findElement(By.xpath("//img[@alt='More Actions']")).click();
        Thread.sleep(3000);

//      ADD-ONS
        driver.findElement(By.xpath("//button[div/h2='Add-ons']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary' and contains(text(), '+ Add-ons')]")).click();
        driver.findElement(By.xpath("//td[@class='addOns']//mat-form-field//mat-select")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//mat-option[.//span[@class='mdc-list-item__primary-text' and text()='Airport Drop']]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        Thread.sleep(3000);

//        For Tracking add-ons
        By.xpath("//button[contains(text(), 'Un-tracked')]").findElement(driver).click();
        By.xpath("//button[@class='counter__plus active']").findElement(driver).click();
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-secondary-outline' and text()=' Track ']")).click();

//        For Cancelling Add-ons
        driver.findElement(By.xpath("//button[div/h2='Add-ons']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary' and contains(text(), '+ Add-ons')]")).click();
        driver.findElement(By.xpath("//td[@class='addOns']//mat-form-field//mat-select")).click();
        driver.findElement(By.xpath("//mat-option[.//span[@class='mdc-list-item__primary-text' and text()='Dinner']]")).click();
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        Thread.sleep(3000);
        By.xpath("//button[@class='counter__plus active']").findElement(driver).click();
        driver.findElement(By.xpath("//button[contains(@class, 'btn-secondary-outline') and text()=' Cancel ']")).click();
        driver.findElement(By.xpath("//div[@class='header__icon']")).click();
        Thread.sleep(3000);

    }
}