package com.avatar.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewMain {

    public static void main (String[] args) throws InterruptedException {

         WebDriver driver;
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\javat\\Downloads\\chromedriver.exe");
         driver = new ChromeDriver();

         driver.manage().window().maximize();
         driver.get("https://simple.ripley.com.pe");
         Thread.sleep(15000);
         driver.findElement(By.cssSelector("button#onesignal-slidedown-cancel-button.align-right.secondary.slidedown-button")).click();

    }
}
