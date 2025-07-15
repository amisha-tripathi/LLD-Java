package LowLevelDesignPractice.CarRentalSystem.VehicleModel;

public class Vehicle {
  int vehicleId;
  int vehicleNumber;

  VehicleType vehicleType;
  int average;
  int kmdriven;

  public int getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(int vehicleId) {
    this.vehicleId = vehicleId;
  }

  public int getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(int vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public int getAverage() {
    return average;
  }

  public void setAverage(int average) {
    this.average = average;
  }

  public int getKmdriven() {
    return kmdriven;
  }

  public void setKmdriven(int kmdriven) {
    this.kmdriven = kmdriven;
  }

  public int getHourlyCost() {
    return hourlyCost;
  }

  public void setHourlyCost(int hourlyCost) {
    this.hourlyCost = hourlyCost;
  }

  int hourlyCost;

}
