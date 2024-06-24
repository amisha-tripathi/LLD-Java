package LLD.Java.LowLevelDesignsPatterns.Observer;

import LLD.Java.LowLevelDesignsPatterns.Observable.Stock;

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
