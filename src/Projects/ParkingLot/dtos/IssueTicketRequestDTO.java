package Projects.ParkingLot.dtos;

import Projects.ParkingLot.models.Gate;
import Projects.ParkingLot.models.Vehicle;
import Projects.ParkingLot.models.VehicleType;

public class IssueTicketRequestDTO {
    private Long gateId;
    private String vehicleId;
    private VehicleType vehicleType;
    private String ownerName;

    public  Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
