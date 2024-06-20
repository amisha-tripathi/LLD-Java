package LLD.Java.LowLevelDesigns.StrategyDesignPattern;

public class Bike extends Vehicle{
  public Bike() {
    super(new SpecialDrive());
  }
}
