package LLD.Java.LowLevelDesigns;

import LLD.Java.LowLevelDesigns.DecoratorPattern.BasePizza;
import LLD.Java.LowLevelDesigns.DecoratorPattern.ExtraCheese;
import LLD.Java.LowLevelDesigns.DecoratorPattern.Farmhouse;
import LLD.Java.LowLevelDesigns.DecoratorPattern.Margherita;
import LLD.Java.LowLevelDesigns.DecoratorPattern.Mushroom;
import LLD.Java.LowLevelDesigns.FactoryDesignPattern.BMW;
import LLD.Java.LowLevelDesigns.FactoryDesignPattern.LuxuryVehicle;
import LLD.Java.LowLevelDesigns.FactoryDesignPattern.NormalVehicle;
import LLD.Java.LowLevelDesigns.FactoryDesignPattern.TATA;
import LLD.Java.LowLevelDesigns.FactoryDesignPattern.VehcileFactory2;
import LLD.Java.LowLevelDesigns.Observable.IphoneStock;
import LLD.Java.LowLevelDesigns.Observable.Stock;
import LLD.Java.LowLevelDesigns.Observer.EmailAlertObserver;
import LLD.Java.LowLevelDesigns.Observer.NotificationAlertObserver;
import LLD.Java.LowLevelDesigns.StrategyDesignPattern.Bike;
import LLD.Java.LowLevelDesigns.StrategyDesignPattern.Car;
import LLD.Java.LowLevelDesigns.StrategyDesignPattern.Cycle;
import LLD.Java.LowLevelDesigns.StrategyDesignPattern.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class LowLevelDesignsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LowLevelDesignsApplication.class, args);
		//strategy design pattern starts here

//		Vehicle obj=new Bike();
//		obj.drive();
//
//		obj=new Cycle();
//		obj.drive();
//
//		obj=new Car();
//		obj.drive();

		//strategy design pattern ends here

		//observable pattern starts here

//		Stock iphones=new IphoneStock();
//
//		NotificationAlertObserver obj=new EmailAlertObserver(iphones);
//
//		iphones.addObserver(obj);
//		iphones.setData(10);
//		iphones.setData(100);
		//does not call 2 times because the stock is not 0.

		//observable pattern ends here.

		//Decorator Design Pattern starts here

		//farmhouse+extracheese
//		Farmhouse farmhouse=new Farmhouse();
//		BasePizza extraCheese=new ExtraCheese(farmhouse);
//		extraCheese.getName();
//		extraCheese.cost();

		//margherita+extracheese+mushroom

//		BasePizza mushroompizza=new Mushroom(new ExtraCheese(new Margherita()));
//		mushroompizza.cost();

		//Decorator Design Pattern ends here

		//Abstract Factory Design Pattern starts here

//		VehcileFactory2 obj=new VehcileFactory2(new LuxuryVehicle(new BMW()));
//		obj.getVehicleFactory("BMW");
//
//		obj=new VehcileFactory2(new NormalVehicle(new TATA()));
//		obj.getVehicleFactory("TATA");

		//Abstract Factory Design Pattern ends here
	}

}
