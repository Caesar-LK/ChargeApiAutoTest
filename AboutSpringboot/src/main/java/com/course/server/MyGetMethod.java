package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author :Caesar
 * @date 2025/09/18 14:36
 **/
@RestController
@Api(value = "1.1.1",description = "这是1.1.1版本")
public class MyGetMethod {
    @ApiOperation(value = "通过这个方法可以获取到Cookies",httpMethod = "GET")
    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)//告诉访问路径是什么：/getCookies（访问路径）
    //method 的作用是告诉这个接口必须使用什么方法访问
    public String getCookies(HttpServletResponse response){
        //HttpServletRequest 装请求信息的类
        //HttpServletResponse 装响应信息的类
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "获取 cookies成功";
    }

    /*
    * 要求客户端携带cookies 访问
    * 这个是一个需要携带 cookies 信息才能访问的请求
    * */
    @ApiOperation(value = "使用cookies信息进行测试",httpMethod = "GET")
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    public String getWithCookies (HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();//是一个由很多 key value组成的数组
        if(Objects.isNull(cookies)){
            return "你必须携带cookie 信息来";
        }
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "恭喜访问成功，这个是一个需要携带 cookies 信息才能访问的请求";
            }
        }
        return "你必须携带cookie 信息来";
    }

    /*
    * 开发一个需要携带参数才能访问的 get请求
    * 第一种实现方式 URL：key = value & key = value
    * 模拟获取商品列表
    * */
    @ApiOperation(value = "需要携带参数才能访问的 get请求",httpMethod = "GET")
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    public Map<String,Integer > getList(@RequestParam Integer start,
                                        @RequestParam Integer end){
        Map<String,Integer> myList=new HashMap<>();
        myList.put("鞋",400);
        myList.put("干脆面",1);
        myList.put("衬衫",300);

        return myList;
    }

    /*
    * 第二种需要携带参数访问的 get请求 URL：url:ip:port/get/with/param/10/20
    * 模拟获取商品列表
    * */

    @RequestMapping(value = "/get/with/param/{start}/{end}",method = RequestMethod.GET)
    public Map myGetList(@PathVariable Integer start,
                         @PathVariable Integer end){
        Map<String,Integer> myList=new HashMap<>();
        myList.put("鞋",400);
        myList.put("干脆面",1);
        myList.put("衬衫",300);
        return myList;
    }


}
