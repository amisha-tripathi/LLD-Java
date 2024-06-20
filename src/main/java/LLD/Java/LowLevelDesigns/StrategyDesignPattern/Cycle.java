package LLD.Java.LowLevelDesigns.StrategyDesignPattern;

public class Cycle extends Vehicle{
  public Cycle() {
    super(new NormalDrive());
  }
}
