package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkFlow {

    public void runWorkFlow() {

        // set driver path using setProperty method
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        // Initialize browser
        WebDriver driver = new ChromeDriver();
        // Load website
        driver.get("https://clinic-workflow.web.app/");

        //Index concepts
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9002220327081");

        driver.findElement(By.xpath("//button[@class='btn-rnd btn-rnd--white form-control shadow-md'][1]")).click();
        driver.findElement(By.xpath("//button[@class='btn-rnd btn-rnd--white form-control shadow-md'][2]")).click();

    }
}
