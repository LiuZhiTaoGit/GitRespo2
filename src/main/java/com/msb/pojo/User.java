package com.msb.pojo;

import lombok.Data;

/**
 * @author: liuzt
 * @date: 2024/6/3 - 06 - 03 - 16:24
 * @description: com.msb.pojo
 * @version: 1.0
 */
@Data
public class User {
    private String name;
    private int age;
    private Address address;
}
