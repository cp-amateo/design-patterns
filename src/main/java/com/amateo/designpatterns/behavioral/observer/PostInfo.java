package com.amateo.designpatterns.behavioral.observer;

import lombok.Builder;
import lombok.Getter;

@Builder
public class PostInfo {

    @Getter
    private final String text;
}
