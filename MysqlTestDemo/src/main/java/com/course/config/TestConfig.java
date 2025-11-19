package com.course.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @author :Caesar
 * @date 2025/11/11 15:50
 **/

public class TestConfig {

    public static String loginUrl;
    public static String addUserUrl;
    public static String getUserListUrl;
    public static String getUserInfoUrl;
    public static String updateUserInfoUrl;


    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore Store;
}
