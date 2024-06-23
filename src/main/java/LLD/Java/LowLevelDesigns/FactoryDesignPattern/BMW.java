package LLD.Java.LowLevelDesigns.FactoryDesignPattern;

public class BMW implements Vehicle{
  @Override
  public int getAverage() {
    System.out.println("avg for BMW is "+ 1000);
    return 1000;
  }
}
