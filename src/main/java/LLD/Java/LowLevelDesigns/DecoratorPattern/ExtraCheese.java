package LLD.Java.LowLevelDesigns.DecoratorPattern;

public class ExtraCheese extends Toppings{

  BasePizza obj;

  public ExtraCheese(BasePizza obj){
    this.obj=obj;
  }
  @Override
  public int cost() {
    int totalCost=obj.cost()+200;
    System.out.println("Total Cost of Pizza with ExtraCheese topping is "+ totalCost);
    return totalCost;
  }
  @Override
  public String getName() {
    System.out.println(obj.getName()+" "+"ExtraCheese");
    return null;
  }
}
