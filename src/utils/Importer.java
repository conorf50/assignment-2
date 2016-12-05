package utils;
import java.io.File;
import edu.princeton.cs.introcs.In;

public class Importer {
	public static void userImporter() {
		File usersFile = new File("/input/users5.dat");
		In inUsers = new In(usersFile);
		//each field is separated(delimited) by a '|'
		String delims = "[|]";
		while (!inUsers.isEmpty()) {
			// get user and rating from data source
			String userDetails = inUsers.readLine();

			// parse user details string
			String[] userTokens = userDetails.split(delims);

			// output user data to console.
			if (userTokens.length == 7) {
				System.out.println("UserID: "+userTokens[0]+",First Name:"+
						userTokens[1]+",Surname:" + userTokens[2]+",Age:"+
						Integer.parseInt(userTokens[3])+",Gender:"+userTokens[4]+",Occupation:"+
						userTokens[5]);

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


	public static void movieImporter() {
		File usersFile = new File("/input/items5.dat");
		In inUsers = new In(usersFile);
		//each field is separated(delimited) by a '|'
		String delims = "[|]";
		while (!inUsers.isEmpty()) {
			// get user and rating from data source
			String userDetails = inUsers.readLine();

			// parse user details string
			String[] userTokens = userDetails.split(delims);

			// output user data to console.
			if (userTokens.length == 5) {
				System.out.println("MovieID: "+userTokens[0]+",Movie Title:"+
						userTokens[1]+",Release Date:" + userTokens[2]+",URL:"+
						Integer.parseInt(userTokens[3])+",Unknown Genre:"+
						Integer.parseInt(userTokens[4])+",Action:"+
						Integer.parseInt(userTokens[5])+",Adventure:"+
						Integer.parseInt(userTokens[6])+",Animation:"+
						Integer.parseInt(userTokens[7])+",Children:"+
						Integer.parseInt(userTokens[8])+",Comedy:"+
						Integer.parseInt(userTokens[9])+",Crime:"+
						Integer.parseInt(userTokens[10])+",Documentary:"+
						Integer.parseInt(userTokens[11])+",Drama:"+
						Integer.parseInt(userTokens[12])+",Fantasy:"+
						Integer.parseInt(userTokens[13])+",Film-Noir:"+
						Integer.parseInt(userTokens[14])+",Horror:"+
						Integer.parseInt(userTokens[15])+",Musical:"+
						Integer.parseInt(userTokens[16])+",Mystery:"+
						Integer.parseInt(userTokens[17])+",Romance:"+
						Integer.parseInt(userTokens[18])+",Sci-Fi:"+
						Integer.parseInt(userTokens[19])+",Thriller:"+
						Integer.parseInt(userTokens[20])+",War:"+
						Integer.parseInt(userTokens[21])+",Western:"
			);

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
	public static void ratingImporter() {
		File usersFile = new File("/input/items5.dat");
		In inUsers = new In(usersFile);
		//each field is separated(delimited) by a '|'
		String delims = "[|]";
		while (!inUsers.isEmpty()) {
			// get user and rating from data source
			String userDetails = inUsers.readLine();

			// parse user details string
			String[] userTokens = userDetails.split(delims);

			// output user data to console.
			if (userTokens.length == 7) {
				System.out.println("UserID: "+userTokens[0]+",First Name:"+
						userTokens[1]+",Surname:" + userTokens[2]+",Age:"
						
					);

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

