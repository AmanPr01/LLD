package DesignPatterns.observer;

public class InventoryService implements AmazonOrderPlacedSubscriber {

    InventoryService() {
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced(Long id) {
        System.out.println("Order placed for " + id + " informed to the inventory.");
    }
}
