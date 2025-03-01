package LowLevelDesignPractice.ParkingLot.Vehicle;

public class Vehicle {
  private String vehicleName;
  private String vehicleNumber;

  VehicleType vehicleType;

  public Vehicle(String vehicleName, String vehicleNumber, VehicleType vehicleType) {
    this.vehicleName = vehicleName;
    this.vehicleNumber = vehicleNumber;
    this.vehicleType = vehicleType;
  }

  public String getVehicleName() {
    return vehicleName;
  }

  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }
}
