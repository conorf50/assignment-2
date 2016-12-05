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
User homer = new User ("homer", "simpson", "male",  "40", "procrastinator");

  @Test
  public void testCreate()
  {
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
	public List<User> users = new ArrayList<>();

    for (User user : users)
    {
      ids.add(user.id);
    }
    assertEquals (User.equals(true), ids.size());
  }

  @Test
  public void testToString()
  {
    assertEquals ("User{" + homer.id + ", homer, simpson, male, 40, procrastinator}", homer.toString());
  }
  
  @Test
  public void testEquals()
  {
    User homer2 = new User ("homer", "simpson", "45",  "male", "timewaster"); 
    User bart   = new User ("bart", "simpson", "12",  "male", "joker"); 

    assertEquals(homer, homer);
    assertEquals(homer, homer2);
    assertSame(homer, homer);
    assertNotSame(homer, homer2);
    assertNotEquals(homer, bart);
  }
  
}