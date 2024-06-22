package LLD.Java.LowLevelDesigns.DecoratorPattern;

public class Margherita extends BasePizza{

  @Override
  public int cost() {
    return 50;
  }
  @Override
  public String getName() {
    String name="Margherita";
    return name;
  }
}
