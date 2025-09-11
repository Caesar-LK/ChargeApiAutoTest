package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author :Caesar
 * @date 2025/09/11 17:06
 **/
public class MyCookiesForGet {

    //读取配置文件
    private String url;
    private ResourceBundle bundle;

    @BeforeMethod
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;

        //从配置文件中拼接测试的 URL
        String uri = bundle.getString("getCookies.uri");
        String testurl = url+uri;

        //测试逻辑代码书写
        HttpGet httpGet = new HttpGet(testurl);
        //执行
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(httpGet);
        result  = EntityUtils.toString(response.getEntity(),"UTF-8");
        System.out.println(result);
    }
}
