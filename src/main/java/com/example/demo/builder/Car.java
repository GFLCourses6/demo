package com.example.demo.builder;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(getColor(), car.getColor()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getYear(), car.getYear()) && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getGps(), car.getGps()) && Objects.equals(getClimatControl(), car.getClimatControl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getModel(), getYear(), getBrand(), getGps(), getClimatControl());
    }
}
