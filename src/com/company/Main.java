package com.company;
import com.company.WorkFlow;
import org.openqa.selenium.By;

import java.math.BigInteger;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        //Create and object and invokes the
        WorkFlow workflow = new WorkFlow();
        workflow.runWorkFlow();// Running a method

    }

}

