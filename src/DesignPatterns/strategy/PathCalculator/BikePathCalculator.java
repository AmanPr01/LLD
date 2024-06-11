package DesignPatterns.strategy.PathCalculator;

public class BikePathCalculator implements PathCalculatorStrategy {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Driving the Path via Bike.");
    }
}
