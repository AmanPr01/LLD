package decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new ChocoChip(
                                    new VanillaScoop(
                                            new StrawberryScoop(
                                                    new ChocolateCone(
                                                            new ChocoChip(
                                                                    new OrangeCone()
                                                            )
                                                    )
                                            )
                                    )
        );

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
