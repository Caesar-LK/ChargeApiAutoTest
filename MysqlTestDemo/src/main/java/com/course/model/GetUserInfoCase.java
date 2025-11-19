package com.course.model;

import lombok.Data;

/**
 * @author :Caesar
 * @date 2025/11/11 13:25
 **/

@Data
public class GetUserInfoCase {

    private int id;
    private int userId;
    private String expected;

}
