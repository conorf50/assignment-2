package cfarrell;

public interface IRecommend {
	
	public void addUser(String firstName,String lastName,int age,String gender,String occupation);
	
	public void	removeUser(int userID);
	
	public void addMovie(String title, int year, String url);
	
	public void addRating(int userID, int movieID, int rating);
	
	public int getMovie(int movieID);
	
	public int getUserRatings(int userID);
	
	public int getUserRecommendations(int userID);
	
	public String getTopTenMovies();
	
	public void load();
	
	public void write();
}
