package org.example.multiThread;

import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/09 14:02
 **/

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Thread Info: " + Thread.currentThread().getName() + ", Id: " + Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Thread Info: " + Thread.currentThread().getName() + ", Id: " + Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Thread Info: " + Thread.currentThread().getName() + ", Id: " + Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Thread Info: " + Thread.currentThread().getName() + ", Id: " + Thread.currentThread().getId());
    }


}
