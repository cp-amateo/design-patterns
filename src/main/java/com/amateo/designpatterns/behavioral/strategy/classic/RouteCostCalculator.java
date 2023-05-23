package com.amateo.designpatterns.behavioral.strategy.classic;

public class RouteCostCalculator {

    private final RouteCostStrategy routeCostStrategy;

    public enum RouteCostStrategyType {
        FIX, VARIABLE
    }

    public RouteCostCalculator(RouteCostStrategyType routeCostStrategyType) {
        this.routeCostStrategy = switch (routeCostStrategyType) {
            case FIX ->  new RouteCostStrategyFixFee();
            case VARIABLE ->  new RouteCostStrategyVariableFee();
        };
    }

    public RouteCostStrategy getRouteCostStrategy() {
        return routeCostStrategy;
    }
}
