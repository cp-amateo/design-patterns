package com.amateo.designpatterns.behavioral.strategy.lambda;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class RouteCostCalculatorTest {

    @Test
    void validate() {
        final RouteCostCalculator.Strategy routeCostStrategyFixFee = RouteCostCalculator.Strategy.RouteCostStrategyFixFee;
        final RouteCostCalculator.Strategy routeCostStrategyFixVariable = RouteCostCalculator.Strategy.RouteCostStrategyVariableFee;

        final int kilometers = 1;
        assertThat(routeCostStrategyFixFee.calculate(kilometers)).isEqualTo(BigDecimal.TEN);
        assertThat(routeCostStrategyFixVariable.calculate(kilometers)).isEqualTo(BigDecimal.valueOf(1.5));
    }

}