package LLD.Java.LowLevelDesigns.Observer;

import LLD.Java.LowLevelDesigns.Observable.Stock;

public class EmailAlertObserver implements NotificationAlertObserver{
  Stock obj;
  public EmailAlertObserver(Stock obj){
    this.obj=obj;
  }
  @Override
  public void update() {
    System.out.println("the stock is now "+ obj.getData());
  }
}
