package controllers;

import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;
import utils.Importer;
import controllers.LMovieAPI;
import models.User;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Importer.userImporter();
		Importer.movieImporter();
		Importer.ratingImporter();
		Main main = new Main();
		Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to likemovie - ?help for instructions", main);
		shell.commandLoop();
		main.likeMovies.store();

		
	}
	
	public LMovieAPI likeMovies = new LMovieAPI();
	
	@Command(description="Add a new User")
	public void addUser (@Param(name="user ID") Long id,@Param(name="first name") String firstName, @Param(name="last name") String lastName,
			@Param(name="age") String age, @Param(name="gender") String gender, @Param(name="occupation") String occupation)
	{
		likeMovies.addUser(id, firstName, lastName, age, gender, occupation);
	}
	
	@Command(description="List the users")
	public void listUsers ()
	{ 
		for (User u : likeMovies.listUsers().values()) {
			System.out.println(u.toJSONString());
		}
		//System.out.println(likeMovies.listUsers());
;
	}
	
	@Command(description="Delete a User")
	public void removeUser (@Param(name="id") Long id)
	{
		likeMovies.removeUser(id);
	}

	@Command(description="Load XML File")
	public void load ()
	{
		try {
			likeMovies.load();
		} catch (Exception e) {
			System.out.println("File load error");
			e.printStackTrace();
		}
	}
	

	@Command(description="Store data in file")
	public void store ()
	{
		try {
			likeMovies.store();
		} catch (Exception e) {
			System.out.print("File write error");
			e.printStackTrace();
		}
	}
	
	@Command(description="Add a Movie")
	public void addMovie (@Param(name="title") String title, @Param(name="year") String year, @Param(name="url") String url)
	{
		likeMovies.addMovie(title, year, url);
	}
	
}


