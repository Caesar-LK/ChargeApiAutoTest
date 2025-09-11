package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author :Caesar
 * @date 2025/09/11 15:56
 **/
public class MyHttpclient {

    @Test
    public void test01() throws IOException {
        //用来存放我们的结果
        String result;
        HttpGet httpGet = new HttpGet("http://www.baidu.com");

        //这个是用来执行 get方法的
        HttpClient client = new DefaultHttpClient();

        //返回的对象
        HttpResponse response =client.execute(httpGet);

        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }
}
