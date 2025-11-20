package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/11/11 13:29
 **/

@Data
public class LoginCase {


    private String userName;
    private String password;
    private String expected;
}
