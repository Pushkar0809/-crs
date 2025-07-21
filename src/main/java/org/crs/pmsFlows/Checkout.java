package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {
    public static void checkout(ChromeDriver driver) throws InterruptedException {

//     MORE ACTION IN ARRIVALS TAB
        driver.findElement(By.xpath("//img[@alt='More Actions']")).click();
        Thread.sleep(3000);

//      CHECK-OUT
        driver.findElement(By.xpath("//h2[text()='Check-out']")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='specific-parent-class']//img[@class='icon' and @src='/assets/icons/Dashboard_icon.svg']")).click();
        Thread.sleep(3000);

        driver.close();
    }
}
