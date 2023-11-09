package com.example.demo.builder;

public class BuilderApp {
    public static void main(String[] args) {
        CarBuilderDirector carBuilderDirector = new CarBuilderDirector();
        CarBuilder builder = new CarBuilder();
        carBuilderDirector.constructBasic(builder);
        Car car = builder.getCar();

        CarBuilderManual carBuilderManual = new CarBuilderManual();
        carBuilderDirector.constructComfortPlus(carBuilderManual);

        System.out.println(car);
        carBuilderManual.print();
    }
}
