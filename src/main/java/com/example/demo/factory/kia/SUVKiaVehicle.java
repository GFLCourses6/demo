package com.example.demo.factory.kia;

import com.example.demo.factory.Vehicle;

public class SUVKiaVehicle implements Vehicle {
    @Override
    public void createVehicle() {
        System.out.println("Build KIA SUV ...");
    }
}
