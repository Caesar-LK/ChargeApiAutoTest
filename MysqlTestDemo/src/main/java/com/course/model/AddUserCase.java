package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/11/11 13:34
 **/
@Data
public class AddUserCase {

    private int id;
    private String userName;
    private int age;
    private String expected;
}
