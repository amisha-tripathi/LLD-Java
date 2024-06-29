package LowLevelDesignPractice.CarRentalSystem;

import java.util.List;

public class Location {
  String city;
  String address;

  List<Store> storeList;
  Location(List<Store> storeList){
    this.storeList=storeList;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getPinCode() {
    return pinCode;
  }

  public void setPinCode(int pinCode) {
    this.pinCode = pinCode;
  }

  String state;
  int pinCode;
}
