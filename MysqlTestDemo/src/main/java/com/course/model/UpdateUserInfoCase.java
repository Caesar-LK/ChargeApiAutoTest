package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/11/11 13:31
 **/

@Data
public class UpdateUserInfoCase {

    private int id;
    private int userId;
    private String username;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private int expected;
}
