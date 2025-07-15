package LowLevelDesignPractice.BookMyShow;

import java.util.List;

public class Show {

  int showId;
  Movie movie;
  Screen screen;

  int startTime;
  List<Integer> bookSeatIds;
  public int getShowId() {
    return showId;
  }

  public void setShowId(int showId) {
    this.showId = showId;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public Screen getScreen() {
    return screen;
  }

  public void setScreen(Screen screen) {
    this.screen = screen;
  }

  public int getStartTime() {
    return startTime;
  }

  public void setStartTime(int startTime) {
    this.startTime = startTime;
  }

  public List<Integer> getBookSeatIds() {
    return bookSeatIds;
  }

  public void setBookSeatIds(List<Integer> bookSeatIds) {
    this.bookSeatIds = bookSeatIds;
  }

}
