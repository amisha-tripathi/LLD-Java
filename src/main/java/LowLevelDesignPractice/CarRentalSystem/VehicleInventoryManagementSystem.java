package LowLevelDesignPractice.CarRentalSystem;

import java.util.List;

import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Vehicle;


public class VehicleInventoryManagementSystem {
  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  List<Vehicle> vehicles;

  public VehicleInventoryManagementSystem(List<Vehicle> vehicles){
    this.vehicles=vehicles;
  }
}
