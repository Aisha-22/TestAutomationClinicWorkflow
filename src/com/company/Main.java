package com.company;
import com.company.WorkFlow;
import org.openqa.selenium.By;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        WorkFlow workflow = new WorkFlow();
        workflow.runWorkFlow();
    }
}

