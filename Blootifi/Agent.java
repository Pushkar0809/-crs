package org.crs.Blootifi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Agent {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imperativ\\Downloads\\chromedriver-win64\\chromedriver.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();

//add key and value to map as follow to switch off browser notification
//Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 2);

//Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

// set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);


        // Navigate to Bloom Agent
        driver.get("https://qa-blootifiagent.bloomhotels.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("pushkar_kr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pushkar@1");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='btn btn-md p-btn-bg-white' and text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@src=\"../../../assets/icons/chat-board.svg\"]")).click();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//img[@src='./assets/images/person-placeholder-portrait.png']")).click();
        Thread.sleep(3000);
        By.xpath("//button[@class='btn p-btn-bg-white' and @queryparamshandling='preserve']").findElement(driver).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='clock']/mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color' and text()='check']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='New intent...']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@class ,'mat-option-text' )][1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        Thread.sleep(5000);

        driver.close();


    }
}
