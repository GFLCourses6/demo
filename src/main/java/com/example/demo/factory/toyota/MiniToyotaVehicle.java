package com.example.demo.factory.toyota;

import com.example.demo.factory.Vehicle;

public class MiniToyotaVehicle implements Vehicle {
    @Override
    public void createVehicle() {
        System.out.println("Build Toyota Mini");
    }
}
