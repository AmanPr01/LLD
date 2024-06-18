//package Projects.ParkingLot.repository;
//
//import Projects.ParkingLot.exceptions.VehicleNotFoundException;
//import Projects.ParkingLot.models.Vehicle;
//
//import java.util.Optional;
//
//public class VehicleRepository {
//    public Optional<Vehicle> findById(String id) throws VehicleNotFoundException {
//        if (id == null) {
//            throw new VehicleNotFoundException();
//        }
//        return null;
//    }
//
//    // this method can be used for update as well
//    public Vehicle save(Vehicle vehicle) {
//        return null;
//    }
//}

package Projects.ParkingLot.repository;

import Projects.ParkingLot.exceptions.VehicleNotFoundException;
import Projects.ParkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber) {
        return null;
    }

    //this save method can be used for update as well as insert.
    public Vehicle save(Vehicle vehicle) {
        return null;
    }

}
