package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkin {
    public static void checkin(ChromeDriver driver) throws InterruptedException {

        //MORE ACTION IN ARRIVALS TAB
        driver.findElement(By.xpath("//img[@alt='More Actions']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h2[text()='Check-in']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(@class, 'btn-secondary-outline') and contains(text(), 'View / Edit / Check-In')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and text()='Check-In']")).click();
        Thread.sleep(3000);

        //ADD GUEST
        driver.findElement(By.xpath("//button[text()=' Add Guest ']")).click();
        Thread.sleep(2000);
        //ADD GUEST BY E-MAIL
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravi@gmail.com");
        Thread.sleep(3000);

        //ADD GUEST BY NAME
//        driver.findElement(By.xpath("//input[@id='mat-input-88' and @type='text']")).sendKeys("ravi r");
//        Thread.sleep(2000);

        //ADD GUEST BY ID NUMBER
//        driver.findElement(By.xpath("//input[@type='ID Number']")).sendKeys("313205");
//        Thread.sleep(2000);

        //CLICK ON SEARCH BUTTON
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and contains(text(), 'Search')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='profile__radio']")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and text()='Select']")).click();

        //SEND CHAT LINK
        driver.findElement(By.xpath("//img[@src='/assets/icons/checkin_dialog/direct_to_checkin.svg' and @alt='direct-to-chat']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and text()='Send']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//mat-panel-title[contains(text(), 'BOOKING')]")).click();
        Thread.sleep(3000);

        //REMOVE GUEST FROM MASTER GUEST LIST
//        driver.findElement(By.xpath("//button[text()=' Remove ']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
//        Thread.sleep(3000);

        //ADD GUEST
        driver.findElement(By.xpath("//button[text()=' Add Guest ']")).click();
        Thread.sleep(2000);

        //ADD GUEST BY E-MAIL
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravi@gmail.com");
        Thread.sleep(3000);

        //CLICK ON SEARCH BUTTON
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and contains(text(), 'Search')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='profile__radio']")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and text()='Select']")).click();

        //CHECK-IN TO NEW ADDED GUEST
        driver.findElement(By.xpath("//button[contains(@class, 'btn-secondary-outline') and contains(text(), 'View / Edit / Check-In')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg' and text()='Check-In']")).click();
        Thread.sleep(3000);

        //REMOVE GUEST FROM CHECK-IN GUEST LIST
        driver.findElement(By.xpath("//button[contains(@class, 'btn-danger-outline') and contains(@class, 'addRightMargin')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='header__icon']")).click();
        Thread.sleep(3000);


    }
}
