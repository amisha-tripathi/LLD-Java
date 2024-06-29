package LowLevelDesignPractice.CarRentalSystem.VehicleModel;

import LowLevelDesignPractice.CarRentalSystem.Reservation;

public class Vehicle {
  int vehicleId;
  int vehicleNumber;

  VehicleType vehicleType;
  int average;
  int kmdriven;

  public Reservation getReservation() {
    return reservation;
  }

  public void setReservation(Reservation reservation) {
    this.reservation = reservation;
  }

  Reservation reservation;

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

  public VehicleStatus getStatus() {
    return status;
  }

  public void setStatus(VehicleStatus status) {
    this.status = status;
  }

  VehicleStatus status=VehicleStatus.ACTIVE;

}
