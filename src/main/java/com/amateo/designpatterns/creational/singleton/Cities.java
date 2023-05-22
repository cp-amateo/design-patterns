package com.amateo.designpatterns.creational.singleton;

import lombok.Getter;

import java.util.Set;

@Getter
public enum Cities {
    INSTANCE;

    private final Set<String> names = Set.of("Barcelona", "Madrid", "London");

}
