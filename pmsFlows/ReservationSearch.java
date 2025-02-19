package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReservationSearch {
    public static void reservationsearch(ChromeDriver driver) throws InterruptedException {

        //REDIRECTING TO RESERVATIONS SEARCH PAGE
        driver.findElement(By.xpath("//img[@class='icon' and @src='/assets/icons/Search_icon.svg']")).click();
        driver.findElement(By.xpath("//a[@class='link activeRoute']//span[text()='Search']")).click();


        //SEARCH WITH RESERVATION ID
//        driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("2143841");
//        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and normalize-space(text())='Search']")).click();

//        //FOR DOWNLOADING CSV FILE
//        driver.findElement(By.xpath("//button[@class='btn btn-secondary-outline btn-lg' and contains(text(), 'Download CSV')]")).click();
//        //FOR REDIRECING TO PARTICULAR BOOKING
//        driver.findElement(By.xpath("//td[@class='mat-mdc-cell mdc-data-table__cell cdk-cell cdk-column-bookingId mat-column-bookingId ng-star-inserted']/a")).click();

        //SEARCH WITHOUT RESERVATION ID
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and normalize-space(text())='Search']")).click();

        //FOR DOWNLOADING CSV FILE
        driver.findElement(By.xpath("//button[@class='btn btn-secondary-outline btn-lg' and contains(text(), 'Download CSV')]")).click();
        Thread.sleep(5000);


    }
}
