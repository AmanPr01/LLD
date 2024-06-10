package observer;

public class LogisticService implements AmazonOrderPlacedSubscriber {

    LogisticService() {
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced(Long id) {
        System.out.println("Order placed for " + id + " informed to the logistics.");
    }
}
