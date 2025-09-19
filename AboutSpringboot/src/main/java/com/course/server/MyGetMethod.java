package com.course.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
public class MyGetMethod {
    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
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
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    public String getWithCookies (HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "你必须携带cookie 信息来";
        }
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "这个是一个需要携带 cookies 信息才能访问的请求";
            }
        }
        return "你必须携带cookie 信息来";
    }

    /*
    * 开发一个需要携带参数才能访问的 get请求
    * 第一种实现方式 URL：key = value & key = value
    * 模拟获取商品列表
    * */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    public Map<String,Integer > getList(@RequestParam Integer start,
                                        @RequestParam Integer end){
        Map<String,Integer> myList=new HashMap<>();
        myList.put("鞋",400);
        myList.put("干脆面",1);
        myList.put("衬衫",300);

        return myList;
    }
}
