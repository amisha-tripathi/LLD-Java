package LowLevelDesignPractice.CarRentalSystem;

import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class VehicleInventorySystem {
  List<Vehicle> vehicles;
  VehicleInventorySystem(){
  }
  public void setVehicles(List<Vehicle> vehicleList){
    this.vehicles=vehicleList;
  }
  public void reserveVehicle(Vehicle vehicle){
    vehicle.getReservation().setReserved(true);
  }
  public List<Vehicle> getVehicles(){
    return vehicles;
  }
  public List<Vehicle> reservedVehicle(){
    List<Vehicle> reservedVehicleList=new ArrayList<>();
    for(Vehicle vehicle: vehicles){
      if(vehicle.getReservation().getReserved()){
        reservedVehicleList.add(vehicle);
      }
    }
    return reservedVehicleList;
  }
  public List<Vehicle> nonreservedVehicle(){
    List<Vehicle> nonreservedVehicleList=new ArrayList<>();
    for(Vehicle vehicle: vehicles){
      if(!vehicle.getReservation().getReserved()){
        nonreservedVehicleList.add(vehicle);
      }
    }
    return nonreservedVehicleList;
  }
}
