package Projects.ParkingLot.exceptions;

public class VehicleNotFoundException extends Exception {
    public VehicleNotFoundException() {
        super("Vehicle not found");
    }
}
