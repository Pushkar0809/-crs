package org.crs;

import org.crs.pmsEnums.PMSFlowEnums;
import org.crs.pmsFlows.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class E2E {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Imperativ\\Downloads\\chromedriver-win64\\chromedriver.exe");

        /** Path to your Chrome profile **/

        ChromeDriver driver = getChromeDriver();
        WebDriver.Options manage = driver.manage();
        manage.timeouts().implicitlyWait(Duration.ofSeconds(10));
        manage.window().maximize();

        //OPEN NEW PMS SIGN-IN PAGE
        driver.get("https://dev-system.bloomhotels.in/sign-in");
        By.xpath("//button[@class='login_content__button']").findElement(driver).click();

        //SELECTING PROPERTY FROM THE LIST
        By.xpath("//input[@type='text']").findElement(driver).sendKeys("Bandra");
        By.xpath("//div[@class='detail']").findElement(driver).click();

        //REDIRECTING TO ARRIVAL PAGE
//        driver.findElement(By.xpath("//p[@class='card__content__title' and text()='arrivals']")).click();

        //REDIRECTING TO IN-HOUSE PAGE
        driver.findElement(By.xpath("//p[@class='card__content__title' and text()='in-house']")).click();


        //SEARCHING FOR RESERVATION IN ARRIVALS /IN-HOUSE
//        driver.findElement(By.xpath("//input[@type='text' and @placeholder='filter by room, guest name, segment, booking ID, alerts, loyalty']")).sendKeys("2201070");

        int retry  = 0;
        PMSFlowEnums.PmsFlows pmsFlowEnums = PMSFlowEnums.PmsFlows.ASSIGN;

        try{
            initializeFlow(driver, pmsFlowEnums);

        } catch (Exception e) {
            if(retry == 0) initializeFlow(driver, pmsFlowEnums);
            System.out.println("error on the flow");
        }
        driver.close();
    }

    private static void initializeFlow(ChromeDriver driver, PMSFlowEnums.PmsFlows pmsFlowEnums) throws InterruptedException {

        if(pmsFlowEnums == PMSFlowEnums.PmsFlows.CREATE_BOOKING) {
            CreateBooking.createBooking(driver);
        }else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.GUEST_BILL) {
            Guestbill.guestbill(driver);
        } else if(pmsFlowEnums == PMSFlowEnums.PmsFlows.ASSIGN) {
            Assign.assign(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.CHECK_IN) {
            Checkin.checkin(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.ADD_ONS) {
            Addons.addons(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.UPGRADE) {
            Upgrade.upgrade(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.PAYMENT) {
            Payment.payment(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.CHECKOUT) {
            Checkout.checkout(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.WEB_CHECK_IN) {
            Webcheckin.webcheckin(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.BILLS_AND_INVOICES) {
            Billsandinvoices.billsandinvoices(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.StaySearch) {
            StaySearch.staysearch(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.RESERVATION_SEARCH) {
            ReservationSearch.reservationsearch(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.ADD_ONS_SEARCH) {
            AddonsSearch.addonssearch(driver);
        } else if (pmsFlowEnums == PMSFlowEnums.PmsFlows.BTC) {
            BTC.btc(driver);
        }
    }

    private static ChromeDriver getChromeDriver() {
        String profilePath = "C:\\Users\\Imperativ\\AppData\\Local\\Google\\Chrome\\User Data";

        // Configure ChromeOptions to use the specified profile
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("user-data-dir=" + profilePath);
       // options.addArguments("--new-window");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 1);
        //1-Allow, 2-Block, 0-default


        // Initialize WebDriver with the configured options
        ChromeDriver driver = new ChromeDriver(options);
        return driver;

    }

}
