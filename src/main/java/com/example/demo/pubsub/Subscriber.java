package com.example.demo.pubsub;

public interface Subscriber {
    void receiveMessage(String message);

    String getId();
}
