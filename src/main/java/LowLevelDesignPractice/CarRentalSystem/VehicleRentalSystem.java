package LowLevelDesignPractice.CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
  List<User> userList;
  List<Store> storeList;

  public VehicleRentalSystem(List<User> userList, List<Store> storeList) {
    this.userList = userList;
    this.storeList = storeList;
  }

  public Store getStoreList(Location location) {
//    for(Store store: storeList){
//      if(store.getLocation().equals(location)){
//        return store;
//      }
//    }
//    return null;
    return storeList.get(0);
  }
}
