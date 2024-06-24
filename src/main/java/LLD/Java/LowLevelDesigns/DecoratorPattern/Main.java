package LLD.Java.LowLevelDesigns.DecoratorPattern;

public class Main {
  public static void main(String args[]) {
    //Decorator Design Pattern starts here

    //farmhouse+extracheese
		Farmhouse farmhouse=new Farmhouse();
		BasePizza extraCheese=new ExtraCheese(farmhouse);
		extraCheese.getName();
		extraCheese.cost();

    //margherita+extracheese+mushroom

		BasePizza mushroompizza=new Mushroom(new ExtraCheese(new Margherita()));
		mushroompizza.cost();

    //Decorator Design Pattern ends here
  }

}
