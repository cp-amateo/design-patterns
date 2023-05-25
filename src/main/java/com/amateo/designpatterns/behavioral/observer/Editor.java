package com.amateo.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private final List<FollowerObserver> observers;

    public Editor() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(final FollowerObserver observer) {
        observers.add(observer);
    }

    public void createAPost(final PostInfo postInfo) {
        //do something to the post
        observers.forEach(observer -> observer.update(postInfo));
    }
}
