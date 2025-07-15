package LowLevelDesignPractice.CarRentalSystem;

import java.util.List;

import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Vehicle;

public class Store {
   VehicleInventoryManagementSystem vehicleInventoryManagementSystem;
   Location location;

   List<Reservation> reservations;

//   Store(Location location, List<Reservation> reservations){
//      this.location=location;
//      this.reservations=reservations;
//   }

   public Reservation createReservation(User user, Vehicle vehicle, int StartTime){
      Reservation reservation=new Reservation(user, vehicle, StartTime);
      reservations.add(reservation);
          return reservation;
   }

   public void addVehicles(Vehicle vehicle){
      vehicleInventoryManagementSystem.getVehicles().add(vehicle);
   }

   public List<Vehicle> getVehicles(){
      return vehicleInventoryManagementSystem.getVehicles();
   }

   public Location getLocation(){
      return this.location;
   }


}
