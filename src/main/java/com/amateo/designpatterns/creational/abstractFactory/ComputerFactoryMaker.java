package com.amateo.designpatterns.creational.abstractFactory;

public class ComputerFactoryMaker {

    public enum ComputerType {
        PC, SERVER
    }

    public static ComputerAbstractFactory makeFactory(ComputerType computerType) {
        return switch (computerType) {
            case PC -> new PcFactory();
            case SERVER -> new ServerFactory();
        };

    }
}
