package org.example;

import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/09 09:49
 **/


/*
* 依赖测试
* */
public class DepandTest {

    @Test
    public void Test01(){
        System.out.println("这个是 Test01");
        throw  new RuntimeException();
    }
    @Test(dependsOnMethods = {"Test01"})
    public void Test02(){
        System.out.println("这个是 Test02");
    }
}
