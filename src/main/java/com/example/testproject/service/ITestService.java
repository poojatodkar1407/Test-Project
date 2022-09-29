package com.example.testproject.service;


import com.example.testproject.dto.Parent;

import java.io.IOException;

public interface ITestService {

    Parent getParentData() throws IOException;
}
