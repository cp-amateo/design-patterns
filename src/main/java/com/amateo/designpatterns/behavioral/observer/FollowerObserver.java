package com.amateo.designpatterns.behavioral.observer;

import java.util.List;

public interface FollowerObserver {

    void update(PostInfo postInfo);

    List<PostInfo> getUpdates();
}
