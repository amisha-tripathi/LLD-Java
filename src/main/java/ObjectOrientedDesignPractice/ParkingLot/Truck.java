package ObjectOrientedDesignPractice.ParkingLot;

public class Truck extends Vehicle {
  public Truck(String licenseNumber) {
    super(licenseNumber, VehicleType.TRUCK);
  }
}