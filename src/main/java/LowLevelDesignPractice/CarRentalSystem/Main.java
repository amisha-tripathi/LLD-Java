package LowLevelDesignPractice.CarRentalSystem;

import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Bike;
import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Car;
import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Vehicle;
import LowLevelDesignPractice.CarRentalSystem.VehicleModel.VehicleStatus;
import LowLevelDesignPractice.CarRentalSystem.VehicleModel.VehicleType;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String args[]) {
    List<Vehicle> vehicles=new ArrayList<>();

    Vehicle car=new Car();
    car.setStatus(VehicleStatus.ACTIVE);
    car.setAverage(100);
    car.setVehicleType(VehicleType.FOUR_WHEELER);

    Vehicle bike=new Bike();
    bike.setStatus(VehicleStatus.INACTIVE);
    bike.setAverage(200);
    bike.setVehicleType(VehicleType.TWO_WHEELER);

    vehicles.add(car);
    vehicles.add(bike);

    Store gkpStore=new Store();
    gkpStore.setVehicles(vehicles);

    Store blrStore=new Store();
    blrStore.setVehicles(vehicles);

    List<Store> storeList=new ArrayList<>();
    storeList.add(gkpStore);
    storeList.add(blrStore);


    Location gorakhpur=new Location(storeList);
    Location bangalore=new Location(storeList);
    List<Location> locations=new ArrayList<>();
    locations.add(gorakhpur);
    locations.add(bangalore);

    VehicleRentalSystem vehicleRentalSystem=new VehicleRentalSystem(locations);
    vehicleRentalSystem.getLocations();

  }
}
