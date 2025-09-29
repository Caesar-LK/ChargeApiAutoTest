package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @author :Caesar
 * @date 2025/09/28 14:03
 **/
@RestController
@Api(value = "/",description = "这个是所有的 post 请求")
@RequestMapping("/v1")
public class MyPostMethod {

    //这个变量是用来装我们的cookie信息的
    private static Cookie cookie;

    //用户登录成功获取到cookies，然后再访问其他接口获取到列表
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录接口", httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName",required = true) String userName,
                        @RequestParam(value = "password",required = true) String password){
if(userName.equals("caesar")&&password.equals("123456")){
    cookie = new Cookie("login","true");
    return "恭喜登录成功";
}
return "用户名或者密码错误";
    }
}
