package LowLevelDesignPractice.CarRentalSystem;

import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Vehicle;
import java.util.List;

public class Store {
  VehicleInventorySystem vehicleInventorySystem;
  int storeId;
  Location storeLocation;

  Bill bill;

  public void setVehicles(List<Vehicle> list){
    //check if without making obj of vehicleInventorySystem if we can do this.
    VehicleInventorySystem vehicleInventorySystem=new VehicleInventorySystem();
    vehicleInventorySystem.setVehicles(list);
  }

  public List<Vehicle> getReservedVehicle(){
    System.out.println(vehicleInventorySystem.reservedVehicle());
    return vehicleInventorySystem.reservedVehicle();
  }

  public List<Vehicle> getNonReservedVehicle(){
    System.out.println(vehicleInventorySystem.nonreservedVehicle());
    return vehicleInventorySystem.nonreservedVehicle();
  }

  public void getBill(Vehicle vehicle){
    bill=new Bill(vehicle);
    bill.getBill();
  }


}
