package LLD.Java.LowLevelDesignsPatterns.FactoryDesignPattern;

public class SWIFT implements Vehicle{
  @Override
  public int getAverage() {
    System.out.println("avg for TATA is "+ 200);
    return 200;
  }
}
