package com.example.demo.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ServiceTestTest {

    private MockedService mockedService = Mockito.mock(MockedService.class);

    @Test
    public void test() {
        when(mockedService.math(5, 5)).thenReturn(10);
        System.out.println("Test");
        System.out.println("Test message");
        ServiceTest serviceTest = new ServiceTest(mockedService);
        Integer calculation = serviceTest.calculation(5, 5);

        assertEquals(20, calculation);
    }

}
