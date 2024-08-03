package com.t.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test
    @Parameters({"name","age"})  //传递参数（两个变量）
    //接收参数
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + ";  age = " + age);
    }

}
