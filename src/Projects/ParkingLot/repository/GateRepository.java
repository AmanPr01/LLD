package Projects.ParkingLot.repository;

import Projects.ParkingLot.exceptions.GateNotFoundException;
import Projects.ParkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gateMap = new HashMap<>();

    public Optional<Gate> getGateById(Long gateId) throws GateNotFoundException {
        if (gateMap.containsKey(gateId)) {
            return Optional.of(gateMap.get(gateId));
        }
        else {
            return Optional.empty();
        }
    }
}
