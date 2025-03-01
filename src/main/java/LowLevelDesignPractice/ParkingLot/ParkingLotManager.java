package LowLevelDesignPractice.ParkingLot;

import LowLevelDesignPractice.ParkingLot.Ticket.Ticket;
import LowLevelDesignPractice.ParkingLot.Vehicle.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {
  private List<ParkingLevel> levels;

  int numberOfLevels;

  public ParkingLotManager(int level) {
    this.numberOfLevels = level;
    this.levels=new ArrayList<>();
    for(int i=0; i<numberOfLevels; i++){
      levels.add(new ParkingLevel(i+1,40,60));
    }
  }

  public Ticket parkVehicle(Vehicle vehicle){
    for(ParkingLevel parkingLevel: levels){
      if(parkingLevel.isParkingAvailableAtThisLevel(vehicle)){
        return parkingLevel.parkVehicleAtSlot(vehicle);
      }
    }
    return null;
  }

  public void unparkVehicle(Ticket ticket){
    ParkingLevel parkingLevel=levels.get(ticket.getLevel());
    parkingLevel.unparkVehicleAtSlot(ticket);
  }
}
