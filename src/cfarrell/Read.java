package cfarrell;

import java.io.File;
import java.io.FileNotFoundException;

import edu.princeton.cs.introcs.In;

public class Read{

	public Read() {
		// TODO Auto-generated constructor stub
	}

	public static void loadUserData() throws Exception {
		File usersFile = new File("data_movieLens/users5.dat");
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
                throw new Exception("Invalid member length: "+userTokens.length);
            }
        }
		
}

	private String readLine() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
