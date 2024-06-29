package LowLevelDesignPractice.CarRentalSystem;

import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Vehicle;

public class Bill {
  Vehicle vehicle;
  Bill(Vehicle vehicle){
    this.vehicle=vehicle;
  }
  int getBill(){
    System.out.println("your bill is"+ 10000);
    return 10000;
  }
}
