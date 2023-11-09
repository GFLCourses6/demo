package com.example.demo.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @BeforeEach
    public void init() {

    }

    @Test
    public void test() {
        Car car = new Car();
        assertNotNull(car);
        assertNull(car.getColor());
        assertNull(car.getGps());
    }

    @Test
    public void test2() {
        Car car = new Car();
        System.out.println("alskjfvlkjdsbnfvkl");
        car.setColor("Test");
        car.setModel("Test");
        car.setBrand("Test");
        car.setYear(1);
        car.setGps("Test");
        car.setClimatControl("Test");
        Car car2 = new Car("Test", "Test", 1, "Test", "Test", "Test");
        assertEquals(car, car2);
    }

}
