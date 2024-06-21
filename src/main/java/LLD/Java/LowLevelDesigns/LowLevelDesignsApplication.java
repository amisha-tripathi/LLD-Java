package LLD.Java.LowLevelDesigns;

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

		Stock iphones=new IphoneStock();

		NotificationAlertObserver obj=new EmailAlertObserver(iphones);

		iphones.addObserver(obj);
		iphones.setData(10);
		iphones.setData(100); //does not call 2 times because the stock is not 0.

		//observable pattern ends here.
	}

}
