package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/10/23 15:49
 **/

@Data
public class AddUserCase {
    private String userName;
    private int age;
    private int sex;
    private int permission;
    private int isDelete;
    private String expected;
    private int id;
    private String password;
}
