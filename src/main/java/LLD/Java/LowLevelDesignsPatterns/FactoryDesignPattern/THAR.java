package LLD.Java.LowLevelDesignsPatterns.FactoryDesignPattern;

public class THAR implements Vehicle{
  @Override
  public int getAverage() {
    System.out.println("avg for THAR is "+ 2000);
    return 2000;
  }
}
