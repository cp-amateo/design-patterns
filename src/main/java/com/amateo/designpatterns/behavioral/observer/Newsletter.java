package com.amateo.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements FollowerObserver {

    private final List<PostInfo> postInfos;

    public Newsletter() {
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
