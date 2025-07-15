package LowLevelDesignPractice.BookMyShow;

public class Movie {
  int id;
  String movieName;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public int getMovieDuration() {
    return movieDuration;
  }

  public void setMovieDuration(int movieDuration) {
    this.movieDuration = movieDuration;
  }

  int movieDuration;
}
