package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddonsSearch {
    public static void addonssearch(ChromeDriver driver) throws InterruptedException {
        //OPEN NEW PMS SIGN-IN PAGE
        driver.get("https://qa-system.bloomhotels.in/sign-in");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='login_content__button']")).click();
        Thread.sleep(5000);

        //SELECTING PROPERTY FROM THE LIST
        By.xpath("//input[@type='text' and @placeholder='filter by name, city, state...']").findElement(driver).sendKeys("Noida");
        Thread.sleep(5000);
        By.xpath("//div[@class='detail']").findElement(driver).click();
        Thread.sleep(3000);


        //REDIRECTING TO Add-ons SEARCH PAGE
        driver.findElement(By.xpath("//img[@class='icon' and @src='/assets/icons/Search_icon.svg']")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'child_link') and contains(@class, 'childActiveRoute')]")).click();
        Thread.sleep(2000);

        //SEARCH WITH RESERVATION ID
        driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("2143841");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and normalize-space(text())='Search']")).click();

        //FOR DOWNLOADING CSV FILE
        driver.findElement(By.xpath("//button[@class='btn btn-secondary-outline btn-lg' and contains(text(), 'Download CSV')]")).click();
        Thread.sleep(5000);

        //SEARCH WITHOUT RESERVATION ID
//        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and normalize-space(text())='Search']")).click();

        //FOR DOWNLOADING CSV FILE
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary-outline btn-lg' and contains(text(), 'Download CSV')]")).click();
        //driver.close();


    }
}
