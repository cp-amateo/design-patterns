package com.amateo.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CitiesTest {

    @Test
    void validate() {

        Cities cities1 = Cities.INSTANCE;
        Cities cities2 = Cities.INSTANCE;

        assertThat(cities1).isEqualTo(cities2);
    }
}