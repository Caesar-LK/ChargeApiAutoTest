package org.example;

import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/09 09:36
 **/
public class ExpectedException {

    /*
    * 什么时候回用到异常测试：
    * 比如我们期望结果为某一个异常的时候
    * 比如：我们传入了某系不合法的参数，程序抛出异常
    * 也就是说我们的预期结果就是这个异常
    *
    * */

    //这是一个结果为失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){

        System.out.println("这个是一个异常测试结果");
    }

    //这是一个结果为成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个结果为成功的异常测试");
        throw new RuntimeException();

    }
}
