package LowLevelDesignPractice.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
  List<Theatre> allMovies;
  Map<City, List<Theatre>> map=new HashMap<>();

  public TheatreController(List<Theatre> allMovies, Map<City, List<Theatre>> map) {
    this.allMovies = allMovies;
    this.map = map;
  }


  public void addTheatre(){

  }
  public List<Theatre> getAllTheatres(){
    return new ArrayList<>();
  }

  public List<Theatre> getAllTheatreLocationWise(City city){
    return map.get(city);
  }

  public Theatre getMovieByName(Theatre mv){
    //iterate on all movies and see if something matches and return.
    return new Theatre();
  }

  public Map<City, List<Theatre>> getMap() {
    return map;
  }

  public void setMap(Map<City, List<Theatre>> map) {
    this.map = map;
  }

  public List<Theatre> getAllMovies() {
    return allMovies;
  }

  public void setAllMovies(List<Theatre> allMovies) {
    this.allMovies = allMovies;
  }

}
