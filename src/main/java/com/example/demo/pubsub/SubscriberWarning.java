package com.example.demo.pubsub;

public class SubscriberWarning implements Subscriber {
    @Override
    public void receiveMessage(String message) {
        System.out.println(String.format("Reading message = %s by subscriber = %s", message, this.getId()));
    }

    @Override
    public String getId() {
        return "subscriber-warning";
    }
}
