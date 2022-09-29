package com.example.testproject.dto;


import lombok.Data;

import java.util.ArrayList;

@Data
public class User {

    public int id;
    public String username;
    public String email;
    public ArrayList<Role> roles;
    public String name;
    public String mobile;
    public String designation;
    public String usergroup;
    public String depcode;
    public String reportingto;

}
