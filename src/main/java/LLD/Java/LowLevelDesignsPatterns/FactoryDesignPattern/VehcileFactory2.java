package LLD.Java.LowLevelDesignsPatterns.FactoryDesignPattern;

public class VehcileFactory2 {
  VehicleFactory obj;
  public VehcileFactory2(VehicleFactory obj){
    this.obj=obj;
  }

  public void getVehicleFactory(String name){
    obj.getVehicle(name);
  }

}
