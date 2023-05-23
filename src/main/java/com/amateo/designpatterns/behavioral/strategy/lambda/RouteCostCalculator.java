package com.amateo.designpatterns.behavioral.strategy.lambda;

import com.amateo.designpatterns.behavioral.strategy.classic.RouteCostStrategy;

import java.math.BigDecimal;

public class RouteCostCalculator {

    public enum Strategy implements RouteCostStrategy {

        RouteCostStrategyVariableFee(kilometers -> BigDecimal.valueOf(1.5 * kilometers)),
        RouteCostStrategyFixFee(kilometers -> BigDecimal.valueOf(10));

        private final RouteCostStrategy routeCostStrategy;

        Strategy(RouteCostStrategy routeCostStrategy) {
            this.routeCostStrategy = routeCostStrategy;
        }

        @Override
        public BigDecimal calculate(int kilometers) {
            return routeCostStrategy.calculate(kilometers);
        }
    }
}
