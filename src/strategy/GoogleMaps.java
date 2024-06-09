package strategy;

import strategy.PathCalculator.PathCalculatorStrategy;

public class GoogleMaps {
    public void findPath(String source, String target, ModeOfTransport mode) {

        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorForMode(mode);

        pathCalculatorStrategy.findPath(source, target);
    }
}
