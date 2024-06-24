package LLD.Java.LowLevelDesignsPatterns.StrategyDesignPattern;

public class Bike extends Vehicle{
  public Bike() {
    super(new SpecialDrive());
  }
}
