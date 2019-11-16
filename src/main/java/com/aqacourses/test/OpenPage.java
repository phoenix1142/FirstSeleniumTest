package com.aqacourses.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class OpenPage {
    private WebDriver driver;

    @Before
    public void setUp(){
        /**
         * Close enable-automation message
         */
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testOpenPage(){
        String link = "https://www.qasymphony.com";
        driver.get("https://google.com.ua");
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Automation testing");
        driver.findElement(By.xpath("//*[@name='btnK']")).click();
        driver.findElement(By.xpath("//*[@class='S3Uucc'and text()='Test Automation vs. Automated Testing: The Difference ...']")).click();
        driver.getCurrentUrl().equals(link);

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
