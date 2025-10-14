package com.course.controller;

import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Caesar
 * @date 2025/10/14 15:02
 **/

@Log4j
@RestController
@Api(value = "v1",description = "这个是我的第一个版本的 demo")
//这个是 requestmapping 的说明
@RequestMapping("v1")
public class Demo {

    //首先获取一个执行 sql语句的对象

    @Autowired
    //启动即加载，把 demo 类启动起来，这个对象就被加载起来了
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "获取用户列表",httpMethod = "GET")
    public int getUserCount(){
        log.info("getUserCount:");
        return template.selectOne("getUserCount");
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody User user){
        log.info("addUser:");
        return template.insert("addUser", user);
    }
}