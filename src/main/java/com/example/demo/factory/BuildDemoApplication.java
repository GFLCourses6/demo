package com.example.demo.factory;

import com.example.demo.factory.kia.KiaFactory;
import com.example.demo.factory.toyota.ToyotaFactory;

public class BuildDemoApplication {
    public static void main(String[] args) {
        VehicleFactory vehicleKiaFactory = new KiaFactory();
        BuildFactory buildKiaFactory = new BuildFactory(vehicleKiaFactory);

        VehicleFactory vehicleToyotaFactory = new ToyotaFactory();
        BuildFactory buildToyotaFactory = new BuildFactory(vehicleToyotaFactory);

        buildKiaFactory.buildSUV();
        buildKiaFactory.buildSUV();
        buildKiaFactory.buildSUV();
        buildKiaFactory.buildSUV();

        buildToyotaFactory.buildMini();
    }
}
