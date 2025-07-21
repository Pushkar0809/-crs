package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaySearch {
    public static void staysearch(ChromeDriver driver) throws InterruptedException {

        //REDIRECT TO SEARCH PAGE
        driver.findElement(By.xpath("//img[@class='icon' and @src='/assets/icons/Search_icon.svg']")).click();
        driver.findElement(By.xpath("//a[@class='link activeRoute' and .//span[text()='Search']]")).click();

        //INPUT RESERVATION ID
//        driver.findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("2143841");
//        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and normalize-space(text())='Search']")).click();

//        //FOR DOWNLOADING CSV FILE
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary-outline btn-lg' and contains(text(), 'Download CSV')]")).click();

//        //REDIRECTING TO FIRST OUTPUT
//        driver.findElement(By.xpath("//td[@class='mat-mdc-cell mdc-data-table__cell cdk-cell cdk-column-id mat-column-id ng-star-inserted' and @role='cell']/a")).click();

        //SEARCH WITHOUT RESERVATION ID
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and normalize-space(text())='Search']")).click();

        //FOR DOWNLOADING CSV FILE
        driver.findElement(By.xpath("//button[@class='btn btn-secondary-outline btn-lg' and contains(text(), 'Download CSV')]")).click();
        Thread.sleep(5000);


    }
}
