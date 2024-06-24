package LLD.Java.LowLevelDesignsPatterns.DecoratorPattern;

public class Farmhouse extends BasePizza{
  @Override
  public int cost() {
    return 100;
  }

  @Override
  public String getName() {
    String name="Farmhouse";
    return name;
  }
}
