package com.course.utils;

import com.course.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author :Caesar
 * @date 2025/11/11 15:52
 **/

//配置文件
public class ConfigFile {
//声明变量ResourceBundle加载配置文件
    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    //工具类静态方法
    public static String geturl(InterfaceName  name){
        String address = bundle.getString("test.url");
        String uri = "";
        //最终的测试地址
        String testUrl;
        if(name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");
        }
        if (name == InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }
        if (name == InterfaceName.ADDUSERINFO){
            uri = bundle.getString("addUser.uri");
        }
        if (name == InterfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }
        if (name == InterfaceName.UPDATEUSERINFO){
            uri = bundle.getString("updateUserInfo.uri");
        }
        return null;
    }
}
