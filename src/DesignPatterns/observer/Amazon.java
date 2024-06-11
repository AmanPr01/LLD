package DesignPatterns.observer;

import java.util.HashSet;

public class Amazon {

    private static Amazon instance = null;
    private HashSet<AmazonOrderPlacedSubscriber> amazonOrderPlacedSubscribers = new HashSet<AmazonOrderPlacedSubscriber>();

    public Amazon() {}

    // DesignPatterns.Singleton
    public static Amazon getInstance() {
        if (instance == null) {
            instance = new Amazon();
        }
        return instance;
    }

    void registerSubscriber(AmazonOrderPlacedSubscriber subscriber) {
        amazonOrderPlacedSubscribers.add(subscriber);
    }

    void unregisterSubscriber(AmazonOrderPlacedSubscriber subscriber) {
        amazonOrderPlacedSubscribers.remove(subscriber);
    }

    public void onOrderPlaced(Long id) {
        for (AmazonOrderPlacedSubscriber subscriber : amazonOrderPlacedSubscribers) {
            subscriber.announceOrderPlaced(id);
        }
    }
}
