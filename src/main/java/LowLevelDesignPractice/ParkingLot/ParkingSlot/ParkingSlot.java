package LowLevelDesignPractice.ParkingLot.ParkingSlot;

import LowLevelDesignPractice.ParkingLot.Ticket.Ticket;
import LowLevelDesignPractice.ParkingLot.Vehicle.Vehicle;

public abstract class ParkingSlot {
  private int id;
  protected double price;

  private boolean isOccupied;
  private Vehicle vehicle;

  public ParkingSlot(int id) {
    this.id = id;
    this.vehicle=null;
    this.isOccupied=false;
  }

  public void parkVehicle(Vehicle vehicle){
    this.vehicle=vehicle;
    this.isOccupied=true;
  }

  public void unParkVehicle(Ticket ticket){
    ticket.getParkingSlot().vehicle=null;
    ticket.getParkingSlot().isOccupied=false;
  }

  public boolean isSlotOccupied(){
    return isOccupied;
  }

  public Vehicle getVehicle(){
    return this.vehicle;
  }

  public abstract double computePrice(int entryTime);
}
