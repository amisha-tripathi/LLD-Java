package LLD.Java.LowLevelDesigns.StrategyDesignPattern;

public class NormalDrive implements DriveStrategy{
  @Override
  public void drive() {
    System.out.println("Normal drive");
  }
}
