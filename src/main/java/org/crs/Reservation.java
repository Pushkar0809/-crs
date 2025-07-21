package org.crs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class Reservation {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imperativ\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Path to your Chrome profile
        String profilePath = "C:\\Users\\Imperativ\\AppData\\Local\\Google\\Chrome\\User Data";

        // Configure ChromeOptions to use the specified profile
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("user-data-dir=" + profilePath);
//        options.addArguments("--new-window");

        Map<String, Object> prefs=new HashMap<String,Object>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        //1-Allow, 2-Block, 0-default


        // Initialize WebDriver with the configured options
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        driver.get("https://qa-crs.bloomhotels.in");
        driver.navigate().refresh();
        Thread.sleep(2000);

       // driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("//select[@class='GO2KE3GFJB-com-staybloom-inventoryStoreGwt-client-view-css-InventoryStoreGwtCss-propertyDropdownField']/option[@value='UttarPradesh']"));
//        driver.findElement(By.xpath(""))
        Thread.sleep(20000);
        driver.findElement(By.xpath("//tr[@__gwt_row='9']")).click();
        driver.findElement(By.xpath("//div[text()='new reservation']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@tabindex='0']/input[@type='radio']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='add to reservation']")).click();

//      [ERROR NOTIFICATION] You are been allowed to make back dated reservations because you have SUPER_USER rights.
//        driver.switchTo().alert();
//        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='search / create']")).click();


//        SEARCH GUEST WITH NAME
        driver.findElement(By.xpath("//input[@class='gwt-SuggestBox']")).sendKeys("pushkar");
        driver.findElement(By.xpath("//button[text()='search']")).click();
        Thread.sleep(3000);

//        SELECT FIRST GUEST FROM THE LIST
        By.xpath("//input[@value='on']").findElement(driver).click();
        driver.findElement(By.xpath("//button[@class='GH5DEFVCJEB-com-staybloom-gwtUiWidgets-client-uiwidget-action-ButtonCss-ButtonCssResource-enabled']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//select[@class='GH5DEFVCD4-com-staybloom-gwtUiWidgets-client-commonCss-CommonCssResources-CommonCss-inlineFieldValue']/option[text()='walk in']")).click();

//        SELECT PAY AT HOTEL
        driver.findElement(By.xpath("//button[text()='submit pay at hotel']")).click();
        driver.findElement(By.xpath("//button[@type='button' and text()='confirm']")).click();

//        HANDLE CHROME BOOKING CONFIRMATION NOTIFICATION
        Alert alert1 = driver.switchTo().alert();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

//        LOGOUT
        driver.findElement(By.xpath("//button[text()='Logout']")).click();

        driver.close();
    }
}
