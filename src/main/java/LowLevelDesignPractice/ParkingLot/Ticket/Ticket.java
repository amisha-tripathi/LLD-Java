package LowLevelDesignPractice.ParkingLot.Ticket;

import LowLevelDesignPractice.ParkingLot.ParkingLevel;
import LowLevelDesignPractice.ParkingLot.ParkingSlot.ParkingSlot;
import LowLevelDesignPractice.ParkingLot.Vehicle.Vehicle;

public class Ticket {
  ParkingSlot parkingSlot;

  int level;

  Vehicle vehicle;

  public int getLevel() {
    return level;
  }

  int entryTime;

  String ticketId;

  public Ticket(ParkingSlot parkingSlot, Vehicle vehicle, int entryTime, String ticketId, int level) {
    this.parkingSlot = parkingSlot;
    this.vehicle = vehicle;
    this.entryTime = entryTime;
    this.ticketId = ticketId;
    this.level=level;
  }

  public ParkingSlot getParkingSlot() {
    return parkingSlot;
  }

  public int getEntryTime() {
    return entryTime;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public String getTicketId() {
    return ticketId;
  }
}
