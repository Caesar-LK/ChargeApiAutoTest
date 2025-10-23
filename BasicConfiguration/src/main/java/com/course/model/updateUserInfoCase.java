package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/10/23 17:36
 **/
@Data
public class updateUserInfoCase {
    private int id;
    private String username;
    private int userId;
    private String sex;
    private String permission;
    private String isDelete;
    private int age;
    private String expected;
}
