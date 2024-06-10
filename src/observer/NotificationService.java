package observer;

public class NotificationService implements AmazonOrderPlacedSubscriber {

    NotificationService() {
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced(Long id) {
        System.out.println("You got a notification. Order placed by " + id + ".");
    }
}
