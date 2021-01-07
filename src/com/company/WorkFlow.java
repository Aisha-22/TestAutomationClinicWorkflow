package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class WorkFlow {

    public void runWorkFlow() throws InterruptedException {

        // set driver path using setProperty method
        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        // Initialize browser
        WebDriver driver = new ChromeDriver(); // x objectname = operator class();
        // Load website
        driver.get("https://clinic-workflow.web.app/");

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Define webdriver wait class
        WebDriverWait wait = new WebDriverWait(driver, 5);//Declaring WebDriver wait

        //Index concepts
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9102220327081");

        driver.findElement(By.xpath("//button[@class='btn-rnd btn-rnd--white form-control shadow-md'][1]")).click();
        driver.findElement(By.xpath("//button[@class='btn-rnd btn-rnd--white form-control shadow-md'][2]")).click();

        //Find element by text() and List Elements
//        System.out.println(driver.findElement(By.xpath("//p[text()='File not found!']")));
        /*List<WebElement>textDemo= driver.findElements(By.xpath("//p[text()='File not found!']"));
        System.out.println("Number of web elements: " + ((List<?>) textDemo).size());
        driver.quit();*/

        //Object of this class is 'wait' to access the Methods present in this class
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[contains(text(),'File not found!')]")));

//        String path = String.format("//p[contains(text(),'File not found!')]");
//        String textOnPage = driver.findElement(By.xpath(path)).getText();
//        String textOnPage = driver.findElement(By.xpath("//p[contains(text(),'File not found!')]")).getText();
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'File not found!')]")).getText());

        //Adding the Patients details
        driver.findElement(By.xpath("//h3[contains(text(),'Add Patient')]")).click();

        //Selecting the tile of the patient from a dynamic drop down list
        driver.findElement(By.xpath("//select[@id='title']")).click();
        Thread.sleep(3000);

        Select s = new Select(driver.findElement(By.id("title")));
        s.selectByValue("professor");
        driver.findElement(By.xpath("//select[@id='title']")).click();

        //Sending Initials in the input 'sendkeys'
        driver.findElement(By.id("initials")).sendKeys("A.F");
        driver.findElement(By.id("fullNames")).sendKeys("Aisha Fairhope");
        driver.findElement(By.id("lastName")).sendKeys("Hlatshwayo");
        driver.findElement(By.id("idNumber")).sendKeys("9102220327081");
        driver.findElement(By.id("citizenship")).sendKeys("Yes");

        driver.findElement(By.xpath("//select[@id='gender']")).click();

        Select select = new Select(driver.findElement(By.id("gender")));
        select.selectByValue("female");
        driver.findElement(By.id("gender")).click();

        driver.findElement(By.xpath("//select[@id='ethnicity']")).click();

        Select selectethnic = new Select(driver.findElement(By.id("ethnicity")));
        selectethnic.selectByValue("african");
        driver.findElement(By.xpath("//select[@id='ethnicity']")).click();

        driver.findElement(By.xpath("//select[@id='maritalStatus']")).click();

        Select selectstatus = new Select(driver.findElement(By.id("maritalStatus")));
        selectstatus.selectByValue("married");
        driver.findElement(By.xpath("//select[@id='maritalStatus']")).click();

        driver.findElement(By.id("language")).sendKeys("English");
        driver.findElement(By.id("religion")).sendKeys("Christian");
        driver.findElement(By.id("income")).sendKeys("R8 000 000");

        //Create an Application
        driver.findElement(By.xpath("//button[contains(text(),'create')]")).click();

        //Return to main page
        driver.findElement(By.xpath("//a[@class='link--text-purple']")).click();


        //View Added patient
        driver.findElement(By.xpath("//h3[contains(text(),'View Patents')]")).click();


        /*assertTrue(textOnPage.contains("File not found!"));
        //getting the text present on the text
        System.out.println(textOnPage);
         */




        //driver.quit();
    }
}
