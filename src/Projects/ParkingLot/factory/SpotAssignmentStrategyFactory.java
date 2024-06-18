package Projects.ParkingLot.factory;

import Projects.ParkingLot.models.SpotAssignmentStrategyType;
import Projects.ParkingLot.strategies.CheapestSpotAssignmentStrategy;
import Projects.ParkingLot.strategies.NearestSpotAssignmentStrategy;
import Projects.ParkingLot.strategies.RandomSpotAssignmentStrategy;
import Projects.ParkingLot.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategyForType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        switch (spotAssignmentStrategyType) {
            case SpotAssignmentStrategyType.CHEAPEST -> {
                return new CheapestSpotAssignmentStrategy();
            }
            case SpotAssignmentStrategyType.RANDOM -> {
                return new RandomSpotAssignmentStrategy();
            }
        }
        return new RandomSpotAssignmentStrategy();
    }
}
