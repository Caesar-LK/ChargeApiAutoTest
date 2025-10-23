package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/10/23 15:39
 **/

@Data
public class User {
    private int id;
    private String userName;
    private String passWord;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", permission='" + permission + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }
}
