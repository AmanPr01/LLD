package strategy;

import strategy.PathCalculator.BikePathCalculator;
import strategy.PathCalculator.CarPathCalculator;
import strategy.PathCalculator.PathCalculatorStrategy;
import strategy.PathCalculator.WalkPathCalculator;

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
