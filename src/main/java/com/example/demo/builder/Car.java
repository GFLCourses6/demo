package com.example.demo.builder;

public class Car {
    private String color;
    private String model;
    private Integer year;
    private String brand;
    private String gps;
    private String climatControl;

    public Car() {
    }

    public Car(String color, String model, Integer year, String brand, String gps, String climatControl) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.brand = brand;
        this.gps = gps;
        this.climatControl = climatControl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getClimatControl() {
        return climatControl;
    }

    public void setClimatControl(String climatControl) {
        this.climatControl = climatControl;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                ", gps='" + gps + '\'' +
                ", climatControl='" + climatControl + '\'' +
                '}';
    }
}
