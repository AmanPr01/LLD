package observer;

public class Client {
    public static void main(String[] args) {
        Long id = 10L;
        Amazon amazon = Amazon.getInstance();
        InventoryService inventoryService = new InventoryService();
        LogisticService logisticService = new LogisticService();
        NotificationService notificationService = new NotificationService();

        amazon.onOrderPlaced(id);
    }
}
