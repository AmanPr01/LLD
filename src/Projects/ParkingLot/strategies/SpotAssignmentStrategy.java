package Projects.ParkingLot.strategies;

import Projects.ParkingLot.models.Gate;
import Projects.ParkingLot.models.ParkingSpot;
import Projects.ParkingLot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Gate gate);
}
