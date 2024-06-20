package LLD.Java.LowLevelDesigns.StrategyDesignPattern;

public class Vehicle {
  DriveStrategy driveStrategy;
  Vehicle(DriveStrategy driveStrategy){
    this.driveStrategy=driveStrategy;
  }
  public void drive(){
    driveStrategy.drive();
  }
}
