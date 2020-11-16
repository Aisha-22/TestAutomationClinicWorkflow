package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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

        //Find element by text() and List Elements
//        System.out.println(driver.findElement(By.xpath("//p[text()='File not found!']")));
        List<WebElement>textDemo= driver.findElements(By.xpath("//p[text()='File not found!']"));
        System.out.println("Number of web elements: " + ((List<?>) textDemo).size());
        driver.quit();
    }
}
