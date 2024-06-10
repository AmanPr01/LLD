package observer;

public interface AmazonOrderPlacedSubscriber {

    void announceOrderPlaced(Long id);
}
