package com.amateo.designpatterns.creational.abstractFactory;

public class Pc implements Computer{

    private final String ram;
    private final String hdd;
    private final String cpu;

    public Pc(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
