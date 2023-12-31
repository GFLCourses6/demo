package com.example.demo.mock;

import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    private final MockedService mockedService;

    public ServiceTest(MockedService mockedService) {
        this.mockedService = mockedService;
    }

    public Integer calculation(Integer a, Integer b) {
        Integer math = mockedService.math(a, b);
        math = math + 10;
        return math;
    }
}
