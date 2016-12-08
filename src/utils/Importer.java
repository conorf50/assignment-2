package utils;
import java.io.File;
import models.Rating;
import edu.princeton.cs.introcs.In;
import models.User;
import models.Movie;

public class Importer {
	public static void userImporter() {
		System.out.println("Importing users...");
		File usersFile = new File("input/users5.dat");
		In inUsers = new In(usersFile);
		//each field is separated(delimited) by a '|'
		String delims = "[|]";
		while (!inUsers.isEmpty()) {
			// get user and rating from data source
			String userDetails = inUsers.readLine();
			// parse user details string
			String[] userTokens = userDetails.split(delims);
			if (userTokens.length == 7) {
				System.out.println("Users Imported");
	
				User u = new User(Long.parseLong(userTokens[0]) , userTokens[1], (userTokens[2]),userTokens[3], userTokens[4], userTokens[5] );
				//System.out.println(u.getId());
				User.users.put(u.getId(), u);

			}
			else
			{
				System.out.println("Import failed");

				try {
					throw new Exception("Invalid member length: "+userTokens.length);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


	public static void movieImporter() {
		File usersFile = new File("input/items5.dat");
		In inUsers = new In(usersFile);
		//each field is separated(delimited) by a '|'
		String delims = "[|]";
		while (!inUsers.isEmpty()) {
			// get user and rating from data source
			String userDetails = inUsers.readLine();

			// parse user details string
			String[] userTokens = userDetails.split(delims);

			if (userTokens.length >= 5) {
//			
				Movie m = new Movie(userTokens[1], userTokens[2], (userTokens[3]) );
				Movie.movies.put(m.getId(), m);
				System.out.println("Movies Imported");
				;

			}else
			{
				try {
					throw new Exception("Invalid member length of: "+userTokens.length);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void ratingImporter() {
		File usersFile = new File("input/ratings5.dat");
		In inUsers = new In(usersFile);
		//each field is separated(delimited) by a '|'
		String delims = "[|]";
		while (!inUsers.isEmpty()) {
			// get user and rating from data source
			String userDetails = inUsers.readLine();

			// parse user details string
			String[] userTokens = userDetails.split(delims);

			// output user data to console.
			if (userTokens.length == 4) {
				System.out.println("UserID: "+userTokens[0]+",First Name:"+
						userTokens[1]+",Surname:" + userTokens[2]+",Age:");
						Rating r = new Rating(new Long(Long.parseLong((userTokens[0]))), new Long(Long.parseLong((userTokens[1]))),new Long(Long.parseLong((userTokens[2]))),
								new Long(Long.parseLong(userTokens[3])));
				Rating.ratings.add(r);
				System.out.println("Ratings Imported");
				;

			}else
			{
				try {
					throw new Exception("Invalid member length: "+userTokens.length);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

