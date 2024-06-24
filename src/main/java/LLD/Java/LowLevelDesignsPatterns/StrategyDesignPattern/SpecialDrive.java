package LLD.Java.LowLevelDesignsPatterns.StrategyDesignPattern;

public class SpecialDrive implements DriveStrategy{
  @Override
  public void drive() {
    System.out.println("Special drive");
  }
}
