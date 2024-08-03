package com.t;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s",Thread.currentThread().getId());
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread Id : %s",Thread.currentThread().getId());
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.printf("Thread Id : %s",Thread.currentThread().getId());
        System.out.println("This is a before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.printf("Thread Id : %s",Thread.currentThread().getId());
        System.out.println("This is a after method");
    }
}
