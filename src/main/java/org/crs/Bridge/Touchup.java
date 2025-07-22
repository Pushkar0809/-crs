package org.crs.Bridge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Touchup {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver();

        // Navigate to Bridge
        driver.get("https://qa-bridge.bloomhotels.in/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Login
        driver.findElement(By.xpath("//*[@id='login']")).sendKeys("QA");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Qaqaqa@#2");
        By.xpath("//*[@id='formContent']/form/div/input").findElement(driver).click();
        Thread.sleep(3000);

        //close opt-in popup
        driver.findElement(By.xpath("//*[@id=\"pushengage-opt-in-1-close\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pushengage-subscriber-recovery-widget-close-button\"]")).click();
        Thread.sleep(2000);

        // SELECT the PROPERTY AND PLACE
        driver.findElement(By.xpath("//input[@placeholder='Search property by name, city']")).sendKeys("Noida");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/app-property-list/div/div[2]/div/a/div/div[1]")).click();
        Thread.sleep(3000);
        driver.get("https://qa-bridge.bloomhotels.in/#/place");
        Thread.sleep(5000);

        //SELECT ROOM FOR TOUCH-UP
        driver.findElement(By.xpath("//span[text()=\"State\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='mat-option-text' and contains(text(), 'touch-up')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='place-code vacant touchup-color']/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='Clean1' and contains(text(), 'touch-up')]")).click();
        driver.findElement(By.xpath("//mat-select[@formcontrolname='actualPlaceState']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath( "//span[@class='mat-option-text' and text()=' clean ']")).click();
        driver.findElement(By.xpath("//mat-select[@placeholder='Select a Remark']")).click();
        By.xpath("//span[contains(text(), 'Checkout')]").findElement(driver).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);


        driver.close();

    }
}
