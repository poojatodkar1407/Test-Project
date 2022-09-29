package com.example.testproject.dto;

import lombok.Data;

@Data
public class MenuList {

    public int menuid;
    public String label;
    public String iconsrc;
    public String tolink;
    public String displayicon;
    public String rolename;
    public int parentid;
    public int orderno;
    public Object menulist;

}
