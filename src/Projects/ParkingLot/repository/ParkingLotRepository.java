package Projects.ParkingLot.repository;

import Projects.ParkingLot.exceptions.ParkingLotNotFoundException;
import Projects.ParkingLot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> getParkingLot = new HashMap<>();

    public Optional<ParkingLot> getParkingLot(long gateId) throws ParkingLotNotFoundException {
        if (getParkingLot.containsKey(gateId)) {
            return Optional.of(getParkingLot.get(gateId));
        }
        throw new ParkingLotNotFoundException();
    }
}
