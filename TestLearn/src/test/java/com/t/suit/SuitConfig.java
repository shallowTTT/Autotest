package com.t.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }


    @BeforeSuite(dependsOnMethods = "beforeSuite")
    public void beforeSuiteDepends() {
        System.out.println("Before Suite Depends");
    }


    @BeforeSuite(alwaysRun = true)
    public void beforeSuiteAlways() {
        System.out.println("Before Suite Always");
    }


    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuiteAlways() {
        System.out.println("After Suite Always");
    }

    @AfterSuite(dependsOnMethods = "afterSuite")
    public void afterSuiteDepends() {
        System.out.println("After Suite Depends");
    }

}
