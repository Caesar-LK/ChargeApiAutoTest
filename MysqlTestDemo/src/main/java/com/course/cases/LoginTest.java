package com.course.cases;

import com.course.config.TestConfig;
import com.course.model.InterfaceName;
import com.course.model.LoginCase;
import com.course.utils.ConfigFile;
import com.course.utils.DatabaseUtil;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author :Caesar
 * @date 2025/11/19 14:59
 **/
public class LoginTest {

    @BeforeTest(groups = "loginTrue", description = "测试准备工作，获取 httpClient 对象准备工作")
    public void beforeTest(){
        TestConfig.getUserInfoUrl = ConfigFile.geturl(InterfaceName.GETUSERINFO);
        TestConfig.getUserListUrl = ConfigFile.geturl(InterfaceName.GETUSERLIST);
        TestConfig.addUserUrl = ConfigFile.geturl(InterfaceName.ADDUSERINFO);
        TestConfig.updateUserInfoUrl = ConfigFile.geturl(InterfaceName.UPDATEUSERINFO);
        TestConfig.loginUrl = ConfigFile.geturl(InterfaceName.LOGIN);

        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }

    @Test(groups = "loginTrue", description = "用户登录成功接口测试")
    public void loginTrue() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        LoginCase LoginCase = session.selectOne("loginCase", 1);
        System.out.println(LoginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }
    @Test(groups = "loginFalse", description = "用户登录失败接口测试")
    public void loginFalse() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        LoginCase LoginCase = session.selectOne("loginCase", 2);
        System.out.println(LoginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }
}
