package LLD.Java.LowLevelDesigns.Observable;

import LLD.Java.LowLevelDesigns.Observer.NotificationAlertObserver;

public interface Stock {
  void addObserver(NotificationAlertObserver observer);
  void removeObserver(NotificationAlertObserver observer);
  void notifySubscribers();

  void setData(int newCount);
  int getData();
}
