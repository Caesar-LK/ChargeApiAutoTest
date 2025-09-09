package org.example.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/09 10:05
 **/
public class ParameterTest {

    @Test
    @Parameters({"name", "age"})
    public void ParamterTest01(String name, int age) {
        System.out.println("name:" + name + ",age:" + age);
    }
}
