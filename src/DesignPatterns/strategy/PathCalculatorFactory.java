package DesignPatterns.strategy;

import DesignPatterns.strategy.PathCalculator.BikePathCalculator;
import DesignPatterns.strategy.PathCalculator.CarPathCalculator;
import DesignPatterns.strategy.PathCalculator.PathCalculatorStrategy;
import DesignPatterns.strategy.PathCalculator.WalkPathCalculator;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorForMode(ModeOfTransport mode) {
        switch (mode) {
            case CAR -> {
                return new CarPathCalculator();
            }
            case BIKE -> {
                return new BikePathCalculator();
            }
            case WALK -> {
                return new WalkPathCalculator();
            }
        }
        return null;
    }
}

//public class PathCalculatorFactory {
//    public static PathCalculatorStrategy getPathCalculatorForMode(ModeOfTransport mode) {
//        if (mode.equals(ModeOfTransport.CAR)) {
//            return new CarPathCalculator();
//        }
//        else if (mode.equals(ModeOfTransport.BIKE)) {
//            return new BikePathCalculator();
//        }
//        else {
//            return new WalkPathCalculator();
//        }
//    }
//}
