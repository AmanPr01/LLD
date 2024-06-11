package DesignPatterns.strategy.PathCalculator;

public class WalkPathCalculator implements PathCalculatorStrategy {

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walking the Path.");
    }
}
