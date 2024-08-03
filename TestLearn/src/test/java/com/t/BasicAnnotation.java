package com.t;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {

    @Test
    public void testCases1() {
        System.out.println("This is a test case");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is a before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is a after method");
    }
}
