package LowLevelDesignPractice.CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
  List<Location> locations;
  VehicleRentalSystem(List<Location> locations){
    this.locations=locations;
  }

  void getLocations(){
    for(Location location: locations)
      System.out.println(location.getCity());
  }

}
