package LLD.Java.LowLevelDesigns.StrategyDesignPattern;

public class Car extends Vehicle{
  public Car(){
    super(new SpecialDrive());
  }
}
