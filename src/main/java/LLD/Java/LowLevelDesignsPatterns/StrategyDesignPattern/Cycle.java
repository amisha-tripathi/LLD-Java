package LLD.Java.LowLevelDesignsPatterns.StrategyDesignPattern;

public class Cycle extends Vehicle{
  public Cycle() {
    super(new NormalDrive());
  }
}
