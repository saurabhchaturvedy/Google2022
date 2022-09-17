package main.java.LLD.ParkingLot;

import java.util.Map;

public class ParkingFloor {
    String name;
    Map<ParkingSlotType, Map<String,ParkingSlot>> parkingSlots;
    public ParkingFloor(String name , Map<ParkingSlotType,Map<String,ParkingSlot>> parkingSlots) {
        this.name=name;
        this.parkingSlots = parkingSlots;
    }

    public ParkingSlot getRelevantSlotForVehicleAndPark(Vehicle vehicle) {
        VehicleCategory vehicleCategory = vehicle.getVehicleCategory();
        ParkingSlotType parkingSlotType = pickCorrectSlot(vehicleCategory);
        Map<String,ParkingSlot> relevantParkingSlot = parkingSlots.get(parkingSlotType);
        ParkingSlot slot =null ;
        for(Map.Entry<String,ParkingSlot> m : relevantParkingSlot.entrySet()){
            if(m.getValue().isAvailable) {
                slot = m.getValue();
                slot.addVehicle(vehicle);
                break;
            }
        }

        return slot;
    }

    private ParkingSlotType pickCorrectSlot(VehicleCategory vehicleCategory) {
        if(vehicleCategory.equals(VehicleCategory.TWO_WHEELER)) return ParkingSlotType.TwoWheeler;
        else if(vehicleCategory.equals(VehicleCategory.HATCHBACK) || vehicleCategory.equals(VehicleCategory.SEDAN)) return ParkingSlotType.Compact;
        else if(vehicleCategory.equals(VehicleCategory.SUV)) return ParkingSlotType.Medium;
        else if(vehicleCategory.equals(VehicleCategory.BUS)) return ParkingSlotType.Large;

        return null;
    }
}