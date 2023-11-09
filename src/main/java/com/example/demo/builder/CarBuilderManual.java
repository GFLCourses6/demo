package com.example.demo.builder;

public class CarBuilderManual implements Builder {

    private String color;
    private String model;
    private Integer year;
    private String brand;
    private String gps;
    private String climatControl;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setGPS(String gps) {
        this.gps = gps;
    }

    @Override
    public void setClimatControl(String climatControl) {
        this.climatControl = climatControl;
    }

    public Car getCar() {
        return new Car(color, model, year, brand, gps, climatControl);
    }

    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Car color - %s; Mode - %s; Year - %s; Brand - %s", color, model, year, brand));
        if (gps != null) {
            builder.append(String.format("; GPS - %s", gps));
        }
        if (climatControl != null) {
            builder.append(String.format("; Climat Control - %s", climatControl));
        }
        System.out.println(builder.toString());
    }
}
