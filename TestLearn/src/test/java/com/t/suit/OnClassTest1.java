package com.t.suit;

import org.testng.annotations.Test;

@Test(groups = {"group1"})
public class OnClassTest1 {

    public void test1() {
        System.out.println("This is group1 test1");
    }

    public void test2() {
        System.out.println("This is group1 test2");
    }
}
