package LLD.Java.LowLevelDesigns.Observable;

import LLD.Java.LowLevelDesigns.Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements Stock{
  int data=0;
 public List<NotificationAlertObserver> list=new ArrayList<>();
  @Override
  public void addObserver(NotificationAlertObserver observer) {
    list.add(observer);
  }

  @Override
  public void removeObserver(NotificationAlertObserver observer) {
    list.remove(observer);
  }

  @Override
  public void notifySubscribers() {
    for(NotificationAlertObserver s: list){
      s.update();
    }
  }

  @Override
  public void setData(int newCount) {
    if(data==0){
      data=data+newCount;
      notifySubscribers();
    }
  }
  @Override
  public int getData() {
    return data;
  }

}
