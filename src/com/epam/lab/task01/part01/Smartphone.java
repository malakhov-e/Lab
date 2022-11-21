package com.epam.lab.task01.part01;

import java.util.Objects;

public class Smartphone extends CellPhone {
    String os;
    int rom;
    int ram;

    public Smartphone(String color, String brand, String model, int weight, int battery) {
        super(color, brand, model, weight, battery);
    }

    public Smartphone(String color, String brand, String model, int weight, int battery, String os, int rom, int ram) {
        super(color, brand, model, weight, battery);
        this.os = os;
        this.rom = rom;
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return rom == that.rom && ram == that.ram && os.equals(that.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), os, rom, ram);
    }
}
