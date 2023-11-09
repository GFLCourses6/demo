package com.example.demo.factory.kia;

import com.example.demo.factory.Vehicle;

public class MiniKiaVehicle implements Vehicle {
    @Override
    public void createVehicle() {
        System.out.println("Build KIA Mini");
    }
}
