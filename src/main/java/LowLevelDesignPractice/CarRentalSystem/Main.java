package LowLevelDesignPractice.CarRentalSystem;

import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Bike;
import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Car;
import LowLevelDesignPractice.CarRentalSystem.VehicleModel.Vehicle;
import LowLevelDesignPractice.CarRentalSystem.VehicleModel.VehicleType;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String args[]) {
    List<User> users=new ArrayList<>();
    User user1=new User();
    users.add(user1);
    
    List<Vehicle> vehicles=new ArrayList<>();

    Vehicle car=new Car();
    car.setAverage(100);
    car.setVehicleType(VehicleType.FOUR_WHEELER);

    Vehicle bike=new Bike();
    bike.setAverage(200);
    bike.setVehicleType(VehicleType.TWO_WHEELER);

    vehicles.add(car);
    vehicles.add(bike);

    List<Store> stores=new ArrayList<>();
    Store store1=new Store();
    store1.addVehicles(car);
    store1.addVehicles(bike);
    stores.add(store1);

    VehicleRentalSystem vehicleRentalSystem=new VehicleRentalSystem(users, stores);

    //user comes;
    User user=users.get(0);

    //user searches store based on location
    Location location=new Location();
    Store store=vehicleRentalSystem.getStoreList(location);

    //user gets list of all vehicles of that store
    List<Vehicle> vehicleList=store.getVehicles();

    //Reservation is created in that store for a vehicle
    Reservation rs=store.createReservation(user1,bike,1);

    //generate the bill
    Bill bill=new Bill(rs);

    //make payment based on bill

  }
}
