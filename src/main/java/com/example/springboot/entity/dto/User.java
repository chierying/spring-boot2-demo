package com.example.springboot.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String id;
    private String name;
    private int age;
    private String password;
}
