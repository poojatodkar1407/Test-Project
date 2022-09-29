package com.example.testproject.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Parent {

    public Resettokeninfo resettokeninfo;
    public String key;
    public ArrayList<MenuList> menuList;

}
