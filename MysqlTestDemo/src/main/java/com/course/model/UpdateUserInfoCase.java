package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/11/11 13:35
 **/
@Data
public class UpdateUserInfoCase {
    private int id;
    private int userId;
    private String userName;
    private int age;
    private String expected;
}
