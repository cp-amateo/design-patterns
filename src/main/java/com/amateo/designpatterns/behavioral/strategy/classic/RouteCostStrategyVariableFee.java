package com.amateo.designpatterns.behavioral.strategy.classic;

import java.math.BigDecimal;

public class RouteCostStrategyVariableFee implements RouteCostStrategy {
    @Override
    public BigDecimal calculate(int kilometers) {
        return BigDecimal.valueOf(1.5 * kilometers);
    }
}
