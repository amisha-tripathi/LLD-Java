package LLD.Java.LowLevelDesignsPatterns.StrategyDesignPattern;

public class Main {
  public static void main(String args[]) {
    //strategy design pattern starts here

		Vehicle obj=new Bike();
		obj.drive();

		obj=new Cycle();
		obj.drive();

		obj=new Car();
		obj.drive();

    //strategy design pattern ends here
  }
}
