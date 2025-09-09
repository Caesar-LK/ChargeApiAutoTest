package org.example.suite;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.Test;


/**
 * @author :Caesar
 * @date 2025/09/08 17:14
 **/
public class IgnoreTest {
    @Test
    public void ignore01() {
        System.out.println("igonre1，执行");
    }

    @Test(enabled = false)
    public void ignore02() {
        System.out.println("igonre2，执行");
    }

    @Test(enabled = true)
    public void ignore03() {
        System.out.println("igonre3，执行");
    }
}
