package Projects.ParkingLot.exceptions;

public class GateNotFoundException extends Exception {
    public GateNotFoundException() {
        super("Gate Not Found");
    }
}
