package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/09 17:24
 **/
public class TestMethodDemo {
    @Test
    public void test1() {
        Assert.assertEquals(1,2);
    }
    @Test()
    public void test2() {
        Assert.assertEquals("aaa","aaa");
    }

    @Test()
    public void test3() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void LogDemo() {
        Reporter.log("这个是日志");
        throw new RuntimeException("这个是运行的异常");
    }
}
