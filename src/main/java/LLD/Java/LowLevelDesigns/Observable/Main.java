package LLD.Java.LowLevelDesigns.Observable;

import LLD.Java.LowLevelDesigns.Observer.EmailAlertObserver;
import LLD.Java.LowLevelDesigns.Observer.NotificationAlertObserver;

public class Main {

  public static void main(String args[]) {
    //observable pattern starts here

		Stock iphones=new IphoneStock();

		NotificationAlertObserver obj=new EmailAlertObserver(iphones);

		iphones.addObserver(obj);
		iphones.setData(10);
		iphones.setData(100);
    //does not call 2 times because the stock is not 0.

    //observable pattern ends here.
  }
}
