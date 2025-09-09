package org.example.suite;

import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/09 17:00
 **/
public class timeoutTest {
    @Test(timeOut = 3000)//单位为毫秒值
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("TimeOutTest");
    }

    @Test(timeOut = 3000)
    public void testFail() throws InterruptedException {
        Thread.sleep(4000);
    }
}
