package models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

import models.User;
import models.Movie;

public class MovieTest
{
	static Long counter = 0l;
	public Long id;
	public String title;
	public String year;
	public String url;
	
	public static HashMap<Long, Movie> movies = new HashMap<Long, Movie>();
    Movie fastcar = new Movie (title, "2015", "www.ie");
    

	public MovieTest(String title, String year, String url)
	{
		this.id = counter++;
		this.title = title;
		this.year = year;
		this.url = url;
	}


    

  @SuppressWarnings("static-access")
@Test
  public void testCreate()
  {
	assertNotEquals(fastcar.id, null);
    assertEquals ("title",               fastcar.getMovieTitle());

  }

  @Test
  public void testIds()
  {
    Set<Long> ids = new HashSet<>();
	List<User> films = new ArrayList<>();

    for (User movie : films)
    {
      ids.add(movie.id);
    }
  // assertEquals (User.equals(true), ids.size());
  }

  @Test
  public void testNames(){
	  Movie car = new Movie ("john", "1234", "painter"); 
	  assertEquals ("john", car.getMovieTitle());
	  assertNotEquals (null, car.getMovieTitle());

  }
  
  @Test
  public void testEquals()
  {
    Movie kayak = new Movie ("homer", "2013", "painter.com"); 
    Movie boat  = new Movie ("bart", "2012", "joker.net"); 
    assertEquals(boat, boat);
    assertNotEquals(boat,kayak);
    assertSame(kayak, kayak);
    assertNotSame(kayak, boat);
    assertNotEquals(kayak, boat);
  }
  
}