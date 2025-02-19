package org.crs.pmsFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Billsandinvoices {
    public static void billsandinvoices(ChromeDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//img[@alt='More Actions']")).click();
        Thread.sleep(3000);

        //BILLS AND INVOICES
        driver.findElement(By.xpath("//button[.//img[@src='../../../../assets/icons/light-icons/bills-and-invoices.svg']]")).click();
        driver.findElement(By.xpath("//p[@class='bills__invoices__cards__tab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-secondary-outline']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[@class='bills__invoices__cards__tab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary' and text()='Email Bill Statement']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("<button _ngcontent-serverapp-c217=\"\" class=\"btn btn-lg btn-secondary-outline ng-star-inserted\"> Download Bill Statement with Payments </button>")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='header__icon']")).click();

    }
}
