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

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class WorkFlow {

    public void runWorkFlow() throws InterruptedException {
        //Instantiate the object
        Konstants k = new Konstants();

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
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9302220327081");

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

        //Assertions -> Validation / Checkpoints in an application (To Match weather Expected to actual, if not this will fail)
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'File not found!')]")).getText(), "File not found!");
        /*if(driver.findElement(By.xpath("//p[contains(text(),'File not found!')]")).isSelected()){
            System.out.println("isSelected");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
         */
        //Adding the Patients details
        driver.findElement(By.xpath("//h3[contains(text(),'Add Patient')]")).click();
        //Selecting the tile of the patient from a dynamic drop down list
        driver.findElement(By.xpath("//select[@id='title']")).click();
        Thread.sleep(3000);

//        Getting the Header of the app
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Create Consultation')]")).getText());

        Select s = new Select(driver.findElement(By.id("title")));
        s.selectByValue(k.title);
        driver.findElement(By.xpath("//select[@id='title']")).click();

        //Adding Patients details -> Sending Initials in the input 'sendkeys'
        driver.findElement(By.id("initials")).sendKeys(k.initials);
        driver.findElement(By.id("fullNames")).sendKeys(k.firstname);
        driver.findElement(By.id("lastName")).sendKeys(k.lastname);
        //        k.id = new BigInteger(""); //Throwing an error
        driver.findElement(By.id("idNumber")).sendKeys("9102220327081");
        driver.findElement(By.id("citizenship")).sendKeys(k.citizenship);

        driver.findElement(By.xpath("//select[@id='gender']")).click();

        Select select = new Select(driver.findElement(By.id("gender")));
        select.selectByValue(k.gender);
        driver.findElement(By.id("gender")).click();

        driver.findElement(By.xpath("//select[@id='ethnicity']")).click();

        Select selectethnic = new Select(driver.findElement(By.id("ethnicity")));
        selectethnic.selectByValue(k.ethnicity);
        driver.findElement(By.xpath("//select[@id='ethnicity']")).click();

        driver.findElement(By.xpath("//select[@id='maritalStatus']")).click();

        Select selectstatus = new Select(driver.findElement(By.id("maritalStatus")));
        selectstatus.selectByValue(k.maritalStatus);
        driver.findElement(By.xpath("//select[@id='maritalStatus']")).click();

        driver.findElement(By.id("language")).sendKeys(k.language);
        driver.findElement(By.id("religion")).sendKeys(k.religion);
        //        k.income = new BigInteger("");
        driver.findElement(By.id("income")).sendKeys("R8 000 000");

        //Create an Application
        driver.findElement(By.xpath("//button[contains(text(),'create')]")).click();

        //Return to main page
        driver.findElement(By.xpath("//a[@class='link--text-purple']")).click();


        //View Added patient
//        Thread.sleep(3000);
//        Assert.assertEquals(driver.findElement(By.cssSelector("main:nth-child(1) app-file-list:nth-child(2) main.paper.shadow div.form-header:nth-child(1) > h1:nth-child(1)")).getText(), "File List");
        driver.findElement(By.xpath("//h3[contains(text(),'View Patents')]")).click();

        //Edit patients details
        driver.findElement(By.xpath("//body/app-root[1]/main[1]/app-file-list[1]/main[1]/div[4]/div[1]/span[2]/a[1]")).click();

        driver.findElement(By.cssSelector("select[id='maritalStatus']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Single')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'edit')]")).click();


        //View Added patient
        driver.findElement(By.xpath("//h3[contains(text(),'View Patents')]")).click();
        driver.findElement(By.xpath("//body/app-root[1]/main[1]/app-file-list[1]/main[1]/div[3]/div[1]")).click();

        //To get the added patients details on the File list
//        Assert.assertEquals(driver.findElement(By.xpath("//body/app-root[1]/main[1]/app-file-list[1]/main[1]/div[2]/div[2]/p[1]/strong[1]")).getText(), "AB");

        //How to delete an existing patient
//        driver.findElement(By.xpath("//body/app-root[1]/main[1]/app-file-list[1]/main[1]/div[5]/div[1]/span[2]/button[1]")).click();

    }
}
