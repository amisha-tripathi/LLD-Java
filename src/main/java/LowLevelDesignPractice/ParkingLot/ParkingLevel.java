package LowLevelDesignPractice.ParkingLot;

import LowLevelDesignPractice.ParkingLot.ParkingSlot.ThreeWheelerParkingSlot;
import LowLevelDesignPractice.ParkingLot.ParkingSlot.TwoWheelerParkingSlot;
import LowLevelDesignPractice.ParkingLot.Ticket.Ticket;
import LowLevelDesignPractice.ParkingLot.Vehicle.Vehicle;
import LowLevelDesignPractice.ParkingLot.Vehicle.VehicleType;
import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
  private int level;
  private List<TwoWheelerParkingSlot> twoWheelerLists;

  private List<ThreeWheelerParkingSlot> threeWheelerLists;

  public ParkingLevel(int level, int twoWheelerSpots, int threeWheelerSpots) {
    this.level = level;
    this.twoWheelerLists = new ArrayList<>();
    for (int i = 0; i < twoWheelerSpots; i++) {
      twoWheelerLists.add(new TwoWheelerParkingSlot(i));
    }

    this.threeWheelerLists = new ArrayList<>();
    for (int i = 0; i < threeWheelerSpots; i++) {
      threeWheelerLists.add(new ThreeWheelerParkingSlot(i));
    }
  }

  public Ticket parkVehicleAtSlot(Vehicle vehicle) {
    if (vehicle.getVehicleType() == VehicleType.Two_Wheeler) {
      for (TwoWheelerParkingSlot slot : twoWheelerLists) {
        if (!slot.isSlotOccupied()) {
          slot.parkVehicle(vehicle);
          return new Ticket(slot, vehicle, 1, "1",level);
        } else {
          return null;
        }
      }
    }
    for (ThreeWheelerParkingSlot slot : threeWheelerLists) {
      if (!slot.isSlotOccupied()) {
        slot.parkVehicle(vehicle);
        return new Ticket(slot, vehicle, 2, "2",level);
      } else {
        return null;
      }
    }
    return null;
  }

  public void unparkVehicleAtSlot(Ticket ticket) {
    ticket.getParkingSlot().unParkVehicle(ticket);
  }

  public boolean isParkingAvailableAtThisLevel(Vehicle vehicle) {
    if (vehicle.getVehicleType() == VehicleType.Two_Wheeler) {
      for (TwoWheelerParkingSlot slot : twoWheelerLists) {
        if(!slot.isSlotOccupied()) return true;
      }
    }
    else if (vehicle.getVehicleType() == VehicleType.Three_Wheeler) {
      for (ThreeWheelerParkingSlot slot : threeWheelerLists) {
        if(!slot.isSlotOccupied()) return true;
      }
    }
    return false;
  }
}

