package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign {
    public static void assign(ChromeDriver driver) throws InterruptedException {

//     MORE ACTION IN ARRIVALS TAB
        driver.findElement(By.xpath("//img[@alt='More Actions']")).click();
        Thread.sleep(3000);

        //ROOM ASSIGNMENT
        driver.findElement(By.xpath("//h2[text()='Room assignment']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn' and contains(text(), 'Clean & Not Checked-in')]")).click();
        driver.findElement(By.xpath("//div[@class='profile__radio']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Assign')]")).click();
        driver.findElement(By.xpath("//button[text()='confirm']")).click();
        driver.findElement(By.xpath("//button[@class='refresh_icon']")).click();
        Thread.sleep(3000);

//      FOR ASSIGN ROOM FOR MULTIPLE RESERVATION


    }
}