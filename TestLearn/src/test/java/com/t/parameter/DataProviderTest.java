package com.t.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    static public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }

    @Test(dataProvider = "data")
    public void testDataProvider(Person person){
        System.out.println("name =" + person.getName() +"; age=" + person.getAge());
    }

    @DataProvider(name="data")
    public Person[] providerData(){
        return new Person[] {
                new Person("zhangsan", 20),
                new Person("lisi", 25),
                new Person("wangwu", 50),
                new Person("zhaoliu", 60)
        };
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test111方法 name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test222方法 name="+name+";age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;   // 根据方法不同，给result赋值

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }

        return result;
    }


}
