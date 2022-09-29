package com.example.testproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Resettokeninfo {

    public int id;
    public User user;
    public String token;
    public String expiryDate;
    public int userid;
    public String username;
    public String fcmtoken;
    public String mobiletoken;
    public String webtoken;

}
