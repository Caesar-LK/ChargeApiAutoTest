package org.example.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author :Caesar
 * @date 2025/09/08 16:30
 **/

//测试套件配置
public class SuiteConfig {
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("Before Suite运行了");
    }
    @AfterSuite
    public void AfterSuite() {
        System.out.println("After Suite运行了");
    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("Before Test");
    }
    @AfterTest
    public void AfterTest() {
        System.out.println("After Test");
    }

}
