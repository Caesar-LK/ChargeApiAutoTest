package org.example;

import org.testng.annotations.*;

/**
 * @author :Caesar
 * @date 2025/09/08 15:44
 **/
public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void TestCase1() {
        System.out.println("这个是测试用例 1");
    }

    @BeforeMethod
    public  void beforeMethod() {
        System.out.println("这是在测试方法之前运行");
    }

    @Test
    public void TestCase2() {
        System.out.println("这个是测试用例 2");
    }
    @AfterMethod
    public  void afterMethod() {
        System.out.println("这个是在测试方法之后运行的");
    }

    @BeforeClass
    public  void beforeClass() {
        System.out.println("这个是在类运行之前执行的");
    }

    @AfterClass
    public  void afterClass() {
        System.out.println("这是在类运行之后运行的");
    }

    @BeforeSuite
    public  void beforeSuite() {
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public  void afterSuite() {
        System.out.println("afterSuite测试套件");
    }
}
