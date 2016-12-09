package models;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

import models.User;

public class UserTest
{
	public static Long counter = 0l;
	public Long id;
	public String firstName;
	public String lastName;
	public String gender;
	public String age;
	public String occupation;
    User homer = new User (4509l, "homer", "simpson", "male",  "40", "procrastinator");

  @Test
  public void testCreate()
  {
	equals(homer.id !=null);
    assertEquals ("homer",               homer.firstName);
    assertEquals ("simpson",             homer.lastName);
    assertEquals ("male",  				 homer.gender);   
    assertEquals ("40",                  homer.age);
    assertEquals ("procrastinator", 	 homer.occupation);   
  }

  @Test
  public void testIds()
  {
    Set<Long> ids = new HashSet<>();
	List<User> users = new ArrayList<>();

    for (User user : users)
    {
      ids.add(user.id);
    }
  //  assertEquals (User.equals(true), ids.size());
  }

  @Test
  public void testNames(){
	  User john = new User (4509l, "john", "smith", "45",  "M", "painter"); 
	  equals (john.firstName = "john");
  }
  
  @Test
  public void testEquals()
  {
    User homer2 = new User (4509l, "homer", "simpson", "45",  "M", "painter"); 
    User bart   = new User (6809l, "bart", "simpson", "12",  "male", "joker"); 
    assertEquals(homer, homer);
    assertNotEquals(homer, homer2);
    assertSame(homer, homer);
    assertNotSame(homer, homer2);
    assertNotEquals(homer, bart);
  }
  
}