package controllers;
import static org.junit.Assert.*;
import java.util.Map;
import org.junit.Test;

import models.Movie;
import models.User;

public class SkyhookAPITest {


//	User frank = new User (2l, "frank", "walsh", "M",  "40", "lecturer");
	SkyhookAPI api = new SkyhookAPI();
	public void testAddUser(Long id, String firstName, String lastName, String age, String gender, String occupation)
	{
		api.addUser(0L, "bob", "jones", "M", "25", "student");
		api.addUser(1L, "joe", "walsh", "M", "19", "student");
		api.addUser(2L, "frank", "walsh", "M", "40", "lecturer");
		api.addUser(2L, "mary", "davis", "F", "49", "cleaner");
	}
	@Test
	public void testListUsers() {
		api.addUser(2L, "mary", "davis", "F", "49", "cleaner");
		assertEquals(0, api.userIndex.size());
		Map<Long, User> newUsers = api.listUsers();
		assertEquals(1, newUsers.size());
	}

	@Test
	public void	testRemoveUser() {
		Object user = new User(2L, "frank", "walsh", "M", "40", "lecturer");
	//	api.removeUser(user.id);
	}

	@Test
	public void testAddRating() {
	}


	@Test
	public void testGetMovie() {
		Movie movie = new Movie("film", "2016", "www.com");

	assertNotEquals(api.getMovie(1), 0);
	
		
	}

	@Test
	public void testGetUserRatings() {

	}

	@Test
	public void testGetUserRecommendations() {

	}

	@Test
	public void getTopTenMovies() {

	}




}
