package com.amateo.designpatterns.behavioral.strategy.classic;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class RouteCostCalculatorTest {

    @Test
    void validate() {
        RouteCostCalculator routeCostCalculatorFix = new RouteCostCalculator(RouteCostCalculator.RouteCostStrategyType.FIX);
        RouteCostCalculator routeCostCalculatorVariable = new RouteCostCalculator(RouteCostCalculator.RouteCostStrategyType.VARIABLE);

        final int kilometers = 1;
        assertThat(routeCostCalculatorFix.getRouteCostStrategy().calculate(kilometers)).isEqualTo(BigDecimal.TEN);
        assertThat(routeCostCalculatorVariable.getRouteCostStrategy().calculate(kilometers)).isEqualTo(BigDecimal.valueOf(1.5));
    }
}