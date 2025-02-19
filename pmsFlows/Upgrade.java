package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upgrade {
    public static void upgrade(ChromeDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//img[@alt='More Actions']")).click();
        Thread.sleep(3000);

//       UPGRADE
        driver.findElement(By.xpath("//h2[contains(text(), 'Upgrade')]")).click();
        driver.findElement(By.xpath("//div[@class='select_room_cards_card_available_radio']")).click();
        driver.findElement(By.xpath("//button[@class='mat-mdc-tooltip-trigger btn btn-primary btn-lg' and text()=' Select without plan ']")).click();
        driver.findElement(By.xpath("//div[@class='allot_room_cards_card_available_radio']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and contains(text(), 'Proceed')]")).click();
        Thread.sleep(5000);


        //comfirm Upsell
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg ng-star-inserted' and contains(text(), 'Confirm Upsell')]")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'mat-mdc-select-trigger')]")).click();
        driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Room Size']")).click();
        driver.findElement(By.xpath("//button[text()='Up-Sell']")).click();
        Thread.sleep(2000);

        //confirm upsell & check-in
        By.xpath("//button[contains(@class, 'btn-primary') and contains(text(), 'Confirm Upsell & Check-In')]").findElement(driver).click();
        driver.findElement(By.xpath("//div[contains(@class, 'mat-mdc-select-trigger')]")).click();
        driver.findElement(By.xpath("//span[@class='mdc-list-item__primary-text' and text()='Room Size']")).click();
        driver.findElement(By.xpath("//button[text()='Up-Sell']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//img[@alt='Refresh Icon']")).click();
        Thread.sleep(3000);

    }
}
