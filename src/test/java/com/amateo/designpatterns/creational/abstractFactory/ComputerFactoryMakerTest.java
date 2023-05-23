package com.amateo.designpatterns.creational.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerFactoryMakerTest {
    @Test
    void validate() {

        ComputerAbstractFactory computerAbstractFactory = ComputerFactoryMaker.makeFactory(ComputerFactoryMaker.ComputerType.PC);
        Computer pc = computerAbstractFactory.createComputer();

        computerAbstractFactory = ComputerFactoryMaker.makeFactory(ComputerFactoryMaker.ComputerType.SERVER);
        Computer server = computerAbstractFactory.createComputer();

        assertTrue(pc instanceof Pc);
        assertTrue(server instanceof Server);
    }
}