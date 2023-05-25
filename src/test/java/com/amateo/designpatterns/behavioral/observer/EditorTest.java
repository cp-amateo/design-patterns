package com.amateo.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EditorTest {

    @Test
    void validate() {
        FollowerObserver newsletter = new Newsletter();
        FollowerObserver follower = new Follower();
        Editor editor = new Editor();

        PostInfo postInfo1 = PostInfo.builder().text("post 1").build();
        PostInfo postInfo2 = PostInfo.builder().text("post 2").build();

        editor.addObserver(newsletter);
        editor.createAPost(postInfo1);
        editor.addObserver(follower);
        editor.createAPost(postInfo2);

        assertThat(newsletter.getUpdates()).containsAll(List.of(postInfo1, postInfo2));
        assertThat(follower.getUpdates()).containsAll(List.of(postInfo2));
    }
}