package strategy.PathCalculator;

public class CarPathCalculator implements PathCalculatorStrategy {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Driving the Path via Car.");
    }
}
