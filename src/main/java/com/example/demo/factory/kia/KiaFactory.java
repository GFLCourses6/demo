package com.example.demo.factory.kia;

import com.example.demo.factory.*;

public class KiaFactory implements VehicleFactory {
    @Override
    public Vehicle buildMini() {
        return new MiniKiaVehicle();
    }

    @Override
    public Vehicle buildSUV() {
        return new SUVKiaVehicle();
    }

    @Override
    public Vehicle buildJeep() {
        return new JeepKiaVehicle();
    }
}
