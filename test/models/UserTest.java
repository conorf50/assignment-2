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
    User homer = new User (4509l, "homer", "simpson", "40",  "male", "procrastinator");

  @Test
  public void testCreate()
  {
	assertNotEquals(homer.id, null);
    assertEquals ("homer",               homer.getFirstName());
    assertEquals ("simpson",             homer.getLastName());
    assertEquals ("male",  				 homer.getGender());   
    assertEquals ("40",                  homer.getAge());
    assertEquals ("procrastinator", 	 homer.getOccupation());   
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
	  assertEquals (john.firstName,"john");
	  assertEquals (john.lastName,"smith");
	  assertEquals (john.age, "45");
	  assertEquals (john.occupation,"painter");
	  assertEquals (john.gender,"M");
	  
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