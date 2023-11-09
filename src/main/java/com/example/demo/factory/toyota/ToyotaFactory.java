package com.example.demo.factory.toyota;

import com.example.demo.factory.*;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Vehicle buildMini() {
        return new MiniToyotaVehicle();
    }

    @Override
    public Vehicle buildSUV() {
        return new SUVToyotaVehicle();
    }

    @Override
    public Vehicle buildJeep() {
        return new JeepToyotaVehicle();
    }
}
