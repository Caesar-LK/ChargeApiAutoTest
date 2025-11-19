package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/11/11 13:22
 **/

@Data
public class AddUserCase {

    private int id;
    private String username;
    private String password;
    private int age;
    private int sex;
    private int permission;
    private int isDelete;
    private String expected;

    @Override
    public String toString() {
        return "AddUserCase{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", permission=" + permission +
                ", isDelete=" + isDelete +
                ", expected='" + expected + '\'' +
                '}';
    }


}
