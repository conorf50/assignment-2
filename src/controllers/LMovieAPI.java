package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Movie;
import models.User;

public class LMovieAPI
{
	public Map<Long, User> userIndex = new HashMap<>();
	public Map<Long, Movie> movieIndex = new HashMap<>();

	public LMovieAPI() {
	}
	

	public User addUser(Long id, String firstName, String lastName, String age, String gender, String occupation)
	{
		User user = new User (id,firstName, lastName, age, gender, occupation);
		userIndex.put(user.id, user);
		return user;
	}
	
	
	public Map<Long, User> listUsers()
	{
		return User.getUsers();
	}
	
	public Movie addMovie(String title, String year, String url)
	{
		Movie movie = new Movie (title, year, url);
		movieIndex.put(movie.id, movie);
		return movie;
	}

	public void	removeUser(Long id) {
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
		return null;
	}

	public void load() {
	}

	public void write() {
	}

	public void store() {
		// TODO Auto-generated method stub

	}
}