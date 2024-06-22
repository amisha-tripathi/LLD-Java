package LLD.Java.LowLevelDesigns.DecoratorPattern;

public class Mushroom extends Toppings{
  BasePizza obj;
  public Mushroom(BasePizza obj){
    this.obj=obj;
  }
  @Override
  public int cost() {
    int totalCost=obj.cost()+500;
    System.out.println("Total Cost is "+ totalCost);
    return obj.cost()+500;
  }

  @Override
  public String getName() {
    System.out.println(obj.getName()+" "+"Mushroom");
    return null;
  }
}
