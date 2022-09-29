package com.example.testproject.service;

import com.example.testproject.dto.Parent;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ITestServiceImpl implements ITestService{
    @Override
    public Parent getParentData() throws IOException {

        String JSON = "{\n" +
                "\"resettokeninfo\": {\n" +
                "\"id\": 0,\n" +
                "\"user\": {\n" +
                "\"id\": 16,\n" +
                "\"username\": \"testuser\",\n" +
                "\"email\": \"testuser@littlemillennium.com\",\n" +
                "\"roles\": [\n" +
                "{\n" +
                "\"rolename\": \"SUPT\"\n" +
                "}\n" +
                "],\n" +
                "\"name\": \"Test User\",\n" +
                "\"mobile\": \"0000000000\",\n" +
                "\"designation\": \"Test\",\n" +
                "\"usergroup\": \"Test\",\n" +
                "\"depcode\": \"T01\",\n" +
                "\"reportingto\": \"Test User\"\n" +
                "},\n" +
                "\"token\": \"5516f974-5bc2-4486-82bd-da36be757699\",\n" +
                "\"expiryDate\": \"2022-09-23T10:25:14.928678Z\",\n" +
                "\"userid\": 0,\n" +
                "\"username\": \"testuser\",\n" +
                "\"fcmtoken\": \"\",\n" +
                "\"mobiletoken\": null,\n" +
                "\"webtoken\": null\n" +
                "},\n" +
                "\"key\": \"yyuuiyuiyuiuiyuiuiyu.qwewqreerewroiewurouoeiwuruewiour.qweopwqeopwqiopriqwriqiwriqwi\",\n" +
                "\"menuList\": [\n" +
                "{\n" +
                "\"menuid\": 8,\n" +
                "\"label\": \"Link01\",\n" +
                "\"iconsrc\": \"\",\n" +
                "\"tolink\": \"link01\",\n" +
                "\"displayicon\": \"0\",\n" +
                "\"rolename\": \"A01\",\n" +
                "\"parentid\": 0,\n" +
                "\"orderno\": 1,\n" +
                "\"menulist\": null\n" +
                "},\n" +
                "{\n" +
                "\"menuid\": 9,\n" +
                "\"label\": \"Link02\",\n" +
                "\"iconsrc\": \"\",\n" +
                "\"tolink\": \"link02\",\n" +
                "\"displayicon\": \"0\",\n" +
                "\"rolename\": \"A01\",\n" +
                "\"parentid\": 0,\n" +
                "\"orderno\": 2,\n" +
                "\"menulist\": null\n" +
                "}\n" +
                "]\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        Parent parent = objectMapper.readValue(JSON, Parent.class);

        System.out.println("Employee Object\n"+parent);
        return parent;
    }
}
