package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        // Navigate to Bridge IN DEV
        driver.get("https://dev-bridge.bloomhotels.in/");
        // Navigate to Bridge IN QA
//        driver.get("https://qa-bridge.bloomrooms.in/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Login
        driver.findElement(By.xpath("//*[@id='login']")).sendKeys("pushkar");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("PK@123pushkar");
        By.xpath("//*[@id='formContent']/form/div/input").findElement(driver).click();
        Thread.sleep(3000);

        //close opt-in popup
//        driver.findElement(By.xpath("//*[@id=\"pushengage-opt-in-1-close\"]")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"pushengage-subscriber-recovery-widget-close-button\"]")).click();
//        Thread.sleep(3000);

        // SELECT the PROPERTY
        driver.findElement(By.xpath("//input[@placeholder='Search property by name, city']")).sendKeys("Bandra");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/app-property-list/div/div[2]/div/a/div/div[1]")).click();
        Thread.sleep(3000);

        //Navigate and perform actions
        driver.findElement(By.xpath("//*[@id=\"menu\"]/label")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='menu']/a[2]/mat-icon")).click();
        Thread.sleep(3000);

        //SELECT TASK TYPE
        By.xpath("//*[@id=\"main-container\"]/app-task-template-v2-create/div[2]/div/div/div/a[1]").findElement(driver).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='main-container']/app-task-template-v2-create/div[2]/div/div/div[1]/a[1]")).click();
        Thread.sleep(3000);

        // SELECT ROOM NUMBER AND ASSIGN TO
        driver.findElement(By.xpath("//input[@placeholder='Filter']")).sendKeys("SK 102");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/app-task-template-v2-create/div[2]/div/div/div/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@class, 'center')]//a[contains(@class, 'task-v2-btn')]")).click();
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@placeholder='Filter by name']")).sendKeys("pushkar");
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/app-task-template-v2-create/div[2]/div/div/div[1]/a[1]/span[1]")).click();
        Thread.sleep(3000);

        //ADD COMMENT FOR THE TASK GENERATED
        driver.findElement(By.xpath("//textarea[@placeholder='Subtask item']")).sendKeys("a");
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/app-task-template-v2-create/div[2]/div/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='main-container']/app-task-template-v2-create/div[2]/div/div/div[1]/a[3]")).click();
        Thread.sleep(5000);

        //TASK DOING PROCESS
        driver.get("https://qa-bridge.bloomhotels.in/#/task/task-list");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/app-task-list/div/div/div/div[4]/div[1]/div/app-guest-request/div/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/app-task-summary/div[1]/div[6]/div[8]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-4\"]/span[1]/div/span/a/div")).click();
        Thread.sleep(3000);

        driver.manage().window().minimize();
        driver.close();

    }
}
