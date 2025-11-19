package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/11/11 13:13
 **/

@Data
public class User {

    private int id;
    private String userName;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;

    //复写后就可以不用写toString方法，是 json格式
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", permission='" + permission + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }
}
