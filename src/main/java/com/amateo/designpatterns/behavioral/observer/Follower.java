package com.amateo.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Follower implements FollowerObserver {

    private final List<PostInfo> postInfos;

    public Follower() {
        this.postInfos = new ArrayList<>();
    }

    @Override
    public void update(PostInfo postInfo) {
        postInfos.add(postInfo);
    }

    @Override
    public List<PostInfo> getUpdates() {
        return postInfos;
    }
}
