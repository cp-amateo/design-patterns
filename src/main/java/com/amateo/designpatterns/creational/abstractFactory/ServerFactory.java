package com.amateo.designpatterns.creational.abstractFactory;

public class ServerFactory implements ComputerAbstractFactory{

    @Override
    public Computer createComputer() {
        return new Server("64", "20T", "8GH");
    }
}
