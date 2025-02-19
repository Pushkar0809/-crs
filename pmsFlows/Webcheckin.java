package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webcheckin {
    public static void webcheckin(ChromeDriver driver) throws InterruptedException {

        //MORE ACTION IN ARRIVALS TAB
        driver.findElement(By.xpath("//img[@alt='More Actions']")).click();
        Thread.sleep(3000);

        //WEB-CHECK-IN
        //FOR NOT CHECK-IN GUEST
//        driver.findElement(By.xpath("//p[@class='card__content__title' and text()='arrivals']")).click();

        // FOR CHECKED-IN GUEST
        driver.findElement(By.xpath("//button[div/h2[text()='Web Check-In']]")).click();
        driver.findElement(By.xpath("//div[@class='profile__radio']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='mat-mdc-tooltip-trigger btn btn-lg btn-primary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='header__icon']")).click();

    }
}
