package com.example.testproject.controller;

import com.example.testproject.dto.Response;
import com.example.testproject.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private ITestService ITestService;

    @GetMapping("/data")
    public ResponseEntity<Response> getUser() throws IOException {

        return new ResponseEntity<>(new Response("Data Fetched Successfully", ITestService.getParentData() ), HttpStatus.OK);
    }
}
