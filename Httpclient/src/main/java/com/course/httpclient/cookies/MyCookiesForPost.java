package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author :Caesar
 * @date 2025/09/12 14:53
 **/
public class MyCookiesForPost {

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
    public void testPostMethod() throws IOException {
    String uri = bundle.getString("test.post.with.cookies");
    //拼接最终的测试地址
    String testurl = url+uri;
    //声明一个client 对象，用来就行方法的执行
    DefaultHttpClient client = new DefaultHttpClient();
    //声明一个方法，这个方法是 post 方法
        HttpPost httpPost = new HttpPost(testurl);
    //添加参数
        JSONObject param  = new JSONObject();
        param.put("name", "wangwu");
        param.put("age", 19);
    //设置请求头信息，添加 header
    httpPost.setHeader("content-type","application/json");
    //将参数信息添加到方法中
    StringEntity stringEntity = new StringEntity(param.toString(),"UTF-8");
    httpPost.setEntity(stringEntity);
    //声明一个对象来进行响应结果的存储
    String result;
    //设置 cookies 信息
    client.setCookieStore(store);
    //执行 post 方法
    HttpResponse response = client.execute(httpPost);
    //获取响应结果
     result = EntityUtils.toString(response.getEntity(),"UTF-8");
     System.out.println(result);
    //处理结果，就是判断返回结果身份符合预期
    //将返回的响应结果字符串转换为 json 对象
    JSONObject resultJson = new JSONObject(result);

    //获取到结果值
    String success = (String)resultJson.get("wangwu");
    String status = (String)resultJson.get("status");
    //具体的判断返回结果的值
    Assert.assertEquals("success",success);
    Assert.assertEquals("1",status);
    }
}
