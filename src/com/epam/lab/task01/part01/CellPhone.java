package com.epam.lab.task01.part01;

import java.util.Objects;

public abstract class CellPhone extends Phone {

    private int weight;
    private int battery;


    public CellPhone() {
        super();
    }

    public CellPhone(String color, String brand, String model, int weight, int battery) {
        super(color, brand, model);
        this.weight = weight;
        this.battery = battery;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "weight=" + weight +
                ", battery=" + battery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CellPhone)) return false;
        if (!super.equals(o)) return false;
        CellPhone cellPhone = (CellPhone) o;
        return weight == cellPhone.weight && battery == cellPhone.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, battery);
    }
}
