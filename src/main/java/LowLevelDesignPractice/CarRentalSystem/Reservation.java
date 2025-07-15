package LowLevelDesignPractice.CarRentalSystem;

import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Vehicle;

public class Reservation {
  User user;
  Vehicle vehicle;

  int startTime;

  Bill bill;

  public Reservation(User user, Vehicle vehicle, int startTime) {
    this.user=user;
    this.vehicle=vehicle;
    this.startTime=startTime;
  }

}
