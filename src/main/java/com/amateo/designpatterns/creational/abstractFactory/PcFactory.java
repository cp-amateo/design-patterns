package com.amateo.designpatterns.creational.abstractFactory;

public class PcFactory implements ComputerAbstractFactory{

    @Override
    public Computer createComputer() {
        return new Pc("16", "1T", "2GH");
    }
}
