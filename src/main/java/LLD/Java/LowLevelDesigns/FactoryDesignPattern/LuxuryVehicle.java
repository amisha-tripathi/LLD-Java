package LLD.Java.LowLevelDesigns.FactoryDesignPattern;

public class LuxuryVehicle implements VehicleFactory{

  Vehicle obj;

  public LuxuryVehicle(Vehicle obj){
    this.obj=obj;
  }
  @Override
  public Vehicle getVehicle(String name) {
    switch (name) {
      case "THAR", "BMW" -> {
        System.out.println("This is a LUXURY Vehicle");
        obj.getAverage();
        return null;
      }
      default -> {
        return null;
      }
    }
  }
}
