package com.epam.lab.task01.part01;

import java.util.Objects;

public abstract class Phone {
    private String color;
    private String brand;
    private String model;

    public Phone() {
    }

    public Phone(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return color.equals(phone.color) && brand.equals(phone.brand) && model.equals(phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, model);
    }
}
