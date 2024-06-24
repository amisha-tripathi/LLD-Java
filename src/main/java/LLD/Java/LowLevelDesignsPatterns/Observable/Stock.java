package LLD.Java.LowLevelDesignsPatterns.Observable;

import LLD.Java.LowLevelDesignsPatterns.Observer.NotificationAlertObserver;

public interface Stock {
  void addObserver(NotificationAlertObserver observer);
  void removeObserver(NotificationAlertObserver observer);
  void notifySubscribers();

  void setData(int newCount);
  int getData();
}
