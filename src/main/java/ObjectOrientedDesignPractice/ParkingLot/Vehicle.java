package ObjectOrientedDesignPractice.ParkingLot;

import lombok.AllArgsConstructor;

public abstract class Vehicle {
  private String licenseNumber;
  private VehicleType vehicleType;

  Vehicle(String licenseNumber, VehicleType vehicleType){
    this.licenseNumber=licenseNumber;
    this.vehicleType=vehicleType;
  }
  private ParkingTicket ticket;

  public void assignTicket(ParkingTicket ticket) {
    this.ticket = ticket;
  }

}