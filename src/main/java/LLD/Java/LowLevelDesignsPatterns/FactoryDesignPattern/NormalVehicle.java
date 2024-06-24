package LLD.Java.LowLevelDesignsPatterns.FactoryDesignPattern;

public class NormalVehicle implements VehicleFactory{

  Vehicle obj;

  public NormalVehicle(Vehicle obj){
    this.obj=obj;
  }
  @Override
  public Vehicle getVehicle(String name) {
    switch (name) {
      case "TATA", "SWIFT" -> {
        System.out.println("This is a normal Vehicle");
        obj.getAverage();
        return null;
      }
      default -> {
        return null;
      }
    }
  }
}
