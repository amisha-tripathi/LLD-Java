package LowLevelDesignPractice.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
  Map<City, List<Movie>> map=new HashMap<>();
  List<Movie> allMovies;

  public void addMovie(){

  }
  public List<Movie> getAllMovies(){
    return new ArrayList<>();
  }

  public List<Movie> getAllMoviesLocationWise(City city){
    return map.get(city);
  }

  public Movie getMovieByName(Movie mv){
    //iterate on all movies and see if something matches and return.
    return new Movie();
  }


}
