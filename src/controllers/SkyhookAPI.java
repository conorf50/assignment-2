package controllers;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import models.Movie;
import models.User;
import utils.XMLSerializer;

public class SkyhookAPI
{
	public Map<Long, User> userIndex = new HashMap<>();
	public Map<Long, Movie> movieIndex = new HashMap<>();
	public static XMLSerializer serializer  = new XMLSerializer(new File("data.xml"));
	public SkyhookAPI() {
	}

	public User addUser(Long id, String firstName, String lastName, String age, String gender, String occupation)
	{
		User user = new User (id,firstName, lastName, age, gender, occupation);
		User.addUser(user.id, user.firstName, user.lastName, user.age, user.gender,user.occupation);
		return user;
	}
	
	public void	removeUser(Long id) {
		User.removeUser(id);
	}

	public Movie addMovie(String title, String year, String url)
	{
		Movie movie = new Movie (title, year, url);
		Movie.addMovie(title, year,url);
		return movie;
	}
	

	public void addRating(int userID, int movieID, int rating) {
	}

	public int getMovie(int movieID) {
		return 0;
	}

	public int getUserRatings(int userID) {
		return 0;
	}

	public int getUserRecommendations(int userID) {
		return 0;
	}

	public String getTopTenMovies() {
		//Collections.sort();
		return null;
	}
	@SuppressWarnings("unchecked")
	public void load() throws Exception
	{
		serializer.read();
		userIndex = (Map<Long, User>) serializer.pop();
		movieIndex = (Map<Long, Movie>) serializer.pop();
		User.counter = (Long) serializer.pop();
	}
	public void write() throws Exception
	{
		serializer.push(User.counter);
		serializer.push(movieIndex);
		serializer.push(userIndex);

		serializer.write();
	}
	
	
	public Map<Long, User> listUsers()
	{
		return User.getUsers();
	}
	
	public Map<Long, Movie> listMovies() {
		return Movie.listMovies();
		
	}

	
	public void removeMovie(Long id) {
		Movie.removeMovie(id);
		
	}
	
	





	



}