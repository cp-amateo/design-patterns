package com.amateo.designpatterns.behavioral.strategy.classic;

import java.math.BigDecimal;

public interface RouteCostStrategy {

    BigDecimal calculate(int kilometers);
}
