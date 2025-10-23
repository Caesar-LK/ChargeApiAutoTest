package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/10/23 17:31
 **/
@Data
public class loginCase {
    private int id;
    private String userName;
    private String password;
    private String expected;
}
