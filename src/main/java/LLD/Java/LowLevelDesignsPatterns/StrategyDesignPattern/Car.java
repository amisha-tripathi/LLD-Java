package LLD.Java.LowLevelDesignsPatterns.StrategyDesignPattern;

public class Car extends Vehicle{
  public Car(){
    super(new SpecialDrive());
  }
}
