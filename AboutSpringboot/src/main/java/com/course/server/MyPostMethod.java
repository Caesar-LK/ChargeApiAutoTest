package com.course.server;

import com.course.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author :Caesar
 * @date 2025/09/28 14:03
 **/
@RestController
@Api(value = "/",description = "这个是所有的post 请求")
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

    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest  request,
                            @RequestBody User u){

        User user;
        //获取cookies
        Cookie[] cookies = request.getCookies();
//        String cookie1 = request.getHeader("cookie");
        //验证cookies是否合法
        for(Cookie c:cookies){
            if (
//                    "login".equals(c.getName())
//                    && "true".equals(c.getValue())
//                    && "caesar".equals(u.getUserName())
//                    && "123456".equals(u.getPassword())
//                    c.getName() == "login"
//                    && c.getValue() == "true"
//                    && u.getUserName() == "caesar"
//                    && u.getPassword() == "123456"

                    c.getName().equals("login")
                    && c.getValue().equals("true")
                    && u.getUserName().equals("caesar")
                    && u.getPassword().equals("123456")

            ){
                user = new User();
                user.setName("张三");
                user.setAge("18");
                user.setSex("man");
                return user.toString();
            }
        }
        return "参数不合法";
    }
}
