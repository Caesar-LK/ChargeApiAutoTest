package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author :Caesar
 * @date 2025/09/11 17:06
 **/


//包括怎么去获得 cookie，以及怎么携带 cookie去访问

public class MyCookiesForGet {

    //读取配置文件
    private String url;
    private ResourceBundle bundle;

    //用来存储 cookie信息的变量
    private CookieStore store;

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
        DefaultHttpClient client = new DefaultHttpClient();
//        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(httpGet);
        result  = EntityUtils.toString(response.getEntity(),"UTF-8");
        System.out.println(result);

        //获取cookies信息
        this.store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();
        for (Cookie cookie : cookieList) {
            String cookieName = cookie.getName();
            String cookieValue = cookie.getValue();
            System.out.println("cookieName=="+cookieName +";cookieValue=="+cookieValue);

        }
    }
    @Test(dependsOnMethods = "testGetCookies")
    public void TestGetWithCookies() throws IOException {
        String uri = bundle.getString("test.get.with.cookies");
        //拼接URL，这个时候已经获取到了测试地址
        String testurl = url+uri;
        //声明一个客户端，在声明一个执行方法，再把 cookie store 带进去
        HttpGet httpGet = new HttpGet(testurl);
        DefaultHttpClient client = new DefaultHttpClient();

        //设置 cookies信息
        client.setCookieStore(store);

        HttpResponse response = client.execute(httpGet);
        //获取响应的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode=="+statusCode);

        if (statusCode == 200) {
            String result = EntityUtils.toString(response.getEntity(),"UTF-8");
            System.out.println(result);
        }
    }
}
