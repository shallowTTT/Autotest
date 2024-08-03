package com.t.suit;

import org.testng.annotations.Test;

@Test(groups = {"group2"})
public class OnClassTest2 {

    public void testMethod1() {
        System.out.println("This is testMethod1 in OnClassTest2");
    }

    @Test(enabled = false)
    public void testMethod2() {
        System.out.println("This is testMethod2 in OnClassTest2");
    }
}
