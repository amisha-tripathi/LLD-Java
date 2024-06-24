package LLD.Java.LowLevelDesignsPatterns.FactoryDesignPattern;

public class Main {
  public static void main(String args[]) {

    //Abstract Factory Design Pattern starts here

		VehcileFactory2 obj=new VehcileFactory2(new LuxuryVehicle(new BMW()));
		obj.getVehicleFactory("BMW");

		obj=new VehcileFactory2(new NormalVehicle(new TATA()));
		obj.getVehicleFactory("TATA");

    //Abstract Factory Design Pattern ends here
  }
}
