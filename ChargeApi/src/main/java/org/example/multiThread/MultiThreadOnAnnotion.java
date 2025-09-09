package org.example.multiThread;

import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/09 13:54
 **/
public class MultiThreadOnAnnotion {
    //线程池是 3
    @Test(invocationCount = 8,threadPoolSize=3)
    public void test01() {
        System.out.println("1");
        //打印线程 ID
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
