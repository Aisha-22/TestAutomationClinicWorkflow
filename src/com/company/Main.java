package com.company;
import com.company.WorkFlow;
import org.openqa.selenium.By;

import java.math.BigInteger;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        WorkFlow workflow = new WorkFlow();
        workflow.runWorkFlow();

        //Instantiate the object
       Konstants k = new Konstants();
       k.title = "";
       k.initials = "";
       k.firstname = "";
       k.lastname = "";
       k.id = new BigInteger(""); //Throwing an error
       k.citizenship = "";
       k.gender = "";
       k.ethnicity = "";
       k.maritalStatus = "";
       k.language = "";
       k.religion = "";
       k.income = new BigInteger("");



    }

}

