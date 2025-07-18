package LowLevelDesignPractice.BookMyShow;

import java.util.List;

public class Theatre {
  int theatreId;

  String address;

  City city;

  public int getTheatreId() {
    return theatreId;
  }

  public void setTheatreId(int theatreId) {
    this.theatreId = theatreId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public List<Screen> getScreenList() {
    return screenList;
  }

  public void setScreenList(List<Screen> screenList) {
    this.screenList = screenList;
  }

  public List<Show> getShowsList() {
    return showsList;
  }

  public void setShowsList(List<Show> showsList) {
    this.showsList = showsList;
  }

  List<Screen> screenList;
  List<Show> showsList;
}
